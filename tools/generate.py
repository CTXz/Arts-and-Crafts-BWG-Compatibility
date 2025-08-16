#!/usr/bin/env python3
"""
Generate Arts & Crafts x BWG dyed-potted assets into a separate compat mod namespace,
writing everything under: <out_dir>/src/generated/resources

Usage:
  python3 generate_bwg_pot_compat.py /path/to/Oh-The-Biomes-Weve-Gone \
                                     /path/to/Arts-and-Crafts \
                                     /path/to/your-compat-mod-root
"""

import argparse
import json
import sys
from pathlib import Path
from typing import Any, Dict, List, Set, Iterable

MODID = "ac_bwg_compat"

def parse_args():
    p = argparse.ArgumentParser(description="Generate A&C x BWG dyed potted assets (outputs to src/generated/resources)")
    p.add_argument("bwg_dir", type=Path, help="Path to Oh-The-Biomes-Weve-Gone repo root")
    p.add_argument("ac_dir", type=Path, help="Path to Arts-and-Crafts repo root")
    p.add_argument("out_dir", type=Path, help="Path to your compat mod root (the script writes into src/generated/resources here)")
    return p.parse_args()

def list_potted_jsons(directory: Path) -> List[Path]:
    if not directory.exists():
        return []
    return [p for p in directory.rglob("*.json") if "potted" in p.name]

def detect_ac_colors(ac_generated_blockstates_dir: Path) -> List[str]:
    colors: Set[str] = set()
    if ac_generated_blockstates_dir.exists():
        for p in ac_generated_blockstates_dir.glob("*_potted_*.json"):
            name = p.stem
            if "_potted_" in name:
                color = name.split("_potted_", 1)[0]
                if color:
                    colors.add(color)
    return sorted(colors)

def load_json(path: Path) -> Dict[str, Any]:
    with path.open("r", encoding="utf-8") as f:
        return json.load(f)

def save_json(obj: Dict[str, Any], path: Path) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    with path.open("w", encoding="utf-8") as f:
        json.dump(obj, f, ensure_ascii=False, indent=2)

def rewrite_blockstate_models(obj: Any, color: str) -> Any:
    """
    Traverse JSON; whenever key == 'model' and value is a string:
      - replace '/potted_' with '/{color}_potted_'
      - replace 'biomeswevegone:' with f'{MODID}:'
    Also handles lists and nested dicts (e.g., multipart with 'apply': {'model': ...}).
    """
    if isinstance(obj, dict):
        new = {}
        for k, v in obj.items():
            if k == "model" and isinstance(v, str):
                v = v.replace("/potted_", f"/{color}_potted_")
                v = v.replace("biomeswevegone:", f"{MODID}:")
            else:
                # handle nested 'apply.model'
                if k == "apply" and isinstance(v, dict) and isinstance(v.get("model"), str):
                    v = dict(v)
                    v["model"] = v["model"].replace("/potted_", f"/{color}_potted_").replace(
                        "biomeswevegone:", f"{MODID}:"
                    )
                else:
                    v = rewrite_blockstate_models(v, color)
            new[k] = v
        return new
    if isinstance(obj, list):
        return [rewrite_blockstate_models(x, color) for x in obj]
    return obj

def rewrite_model_textures(obj: Dict[str, Any], color: str) -> Dict[str, Any]:
    """
    Ensure the model has the dyed pot textures from Arts & Crafts.
    Leaves existing 'plant' (and others) intact.
    """
    textures = obj.get("textures")
    if not isinstance(textures, dict):
        textures = {}
    tex_path = f"arts_and_crafts:block/{color}_flower_pot"
    textures["flowerpot"] = tex_path
    textures["particle"]  = tex_path
    obj["textures"] = textures
    return obj

def update_loot_table(obj: Dict[str, Any], color: str, base_name: str) -> Dict[str, Any]:
    """
    - Change any '*:flower_pot' drop to our dyed pot item.
    - Update random_sequence to our namespace.
    """
    for pool in obj.get("pools", []):
        for e in pool.get("entries", []):
            name = e.get("name")
            if isinstance(name, str) and name.endswith(":flower_pot"):
                e["name"] = f"{MODID}:{color}_flower_pot"
    obj["random_sequence"] = f"{MODID}:blocks/{color}_{base_name}"
    return obj

def out_paths(mod_root: Path):
    """
    All outputs go under src/generated/resources
    """
    gen_root = mod_root / "src/generated/resources"
    gen_bs   = gen_root / f"assets/{MODID}/blockstates"
    gen_mod  = gen_root / f"assets/{MODID}/models/block"
    # NOTE: output to loot_tables (plural), per vanilla convention
    gen_loot = gen_root / f"data/{MODID}/loot_tables/blocks"
    return gen_bs, gen_mod, gen_loot

def process_blockstates(sources: Iterable[Path], dst_dir: Path, color: str) -> None:
    for src in sources:
        try:
            obj = load_json(src)
            obj = rewrite_blockstate_models(obj, color)
            dst = dst_dir / f"{color}_{src.name}"
            save_json(obj, dst)
        except Exception as e:
            print(f"[WARN] Blockstate failed: {src} ({e})", file=sys.stderr)

def process_models(sources: Iterable[Path], dst_dir: Path, color: str) -> None:
    for src in sources:
        try:
            obj = load_json(src)
            obj = rewrite_model_textures(obj, color)
            dst = dst_dir / f"{color}_{src.name}"
            save_json(obj, dst)
        except Exception as e:
            print(f"[WARN] Model failed: {src} ({e})", file=sys.stderr)

def process_loot(sources: Iterable[Path], dst_dir: Path, color: str) -> None:
    for src in sources:
        try:
            base = src.stem  # e.g., potted_allium_flower_bush
            obj = load_json(src)
            obj = update_loot_table(obj, color, base)
            dst = dst_dir / f"{color}_{src.name}"
            save_json(obj, dst)
        except Exception as e:
            print(f"[WARN] Loot table failed: {src} ({e})", file=sys.stderr)

def main():
    args = parse_args()

    # Infer source directories from roots
    # BWG (read from both generated and resources)
    bwg_assets_gen = args.bwg_dir / "Common/src/main/generated/resources/assets/biomeswevegone"
    bwg_assets_res = args.bwg_dir / "Common/src/main/resources/assets/biomeswevegone"
    # Some projects keep loot in generated; adjust if needed
    bwg_loot_gen   = args.bwg_dir / "Common/src/main/generated/resources/data/biomeswevegone/loot_table/blocks"

    # A&C (for color detection)
    ac_gen_blockstates = args.ac_dir / "common/src/main/generated/assets/arts_and_crafts/blockstates"

    if not ac_gen_blockstates.exists():
        print(f"[ERROR] A&C generated blockstates dir not found: {ac_gen_blockstates}", file=sys.stderr)
        return 2

    # Detect dye colors from A&C generated blockstates
    colors = detect_ac_colors(ac_gen_blockstates)
    if not colors:
        print(f"[ERROR] No colors detected in {ac_gen_blockstates} (looking for '*_potted_*.json')", file=sys.stderr)
        return 2
    print(f"[INFO] Detected {len(colors)} colors: {', '.join(colors)}")

    # Gather BWG sources
    bwg_gen_bs   = list_potted_jsons(bwg_assets_gen / "blockstates")
    bwg_gen_mod  = list_potted_jsons(bwg_assets_gen / "models/block")
    bwg_gen_loot = list_potted_jsons(bwg_loot_gen)
    bwg_res_bs   = list_potted_jsons(bwg_assets_res / "blockstates")
    bwg_res_mod  = list_potted_jsons(bwg_assets_res / "models/block")

    print(f"[INFO] BWG generated: blockstates={len(bwg_gen_bs)}, models={len(bwg_gen_mod)}, loot={len(bwg_gen_loot)}")
    print(f"[INFO] BWG resources: blockstates={len(bwg_res_bs)}, models={len(bwg_res_mod)}")

    # Outputs (only src/generated/resources)
    gen_bs_out, gen_mod_out, gen_loot_out = out_paths(args.out_dir)

    for color in colors:
        print(f"[INFO] >>> Generating color: {color}")
        # Write everything into src/generated/resources
        process_blockstates(bwg_gen_bs + bwg_res_bs, gen_bs_out, color)
        process_models(bwg_gen_mod + bwg_res_mod, gen_mod_out, color)
        process_loot(bwg_gen_loot, gen_loot_out, color)

    print(f"[DONE] Assets written under: {(args.out_dir / 'src/generated/resources').resolve()}")
    return 0

if __name__ == "__main__":
    sys.exit(main())
