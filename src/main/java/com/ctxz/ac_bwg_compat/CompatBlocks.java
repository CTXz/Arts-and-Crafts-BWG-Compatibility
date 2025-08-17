package com.ctxz.ac_bwg_compat;

import java.util.HashMap;
import java.util.function.Supplier;

import com.kekecreations.arts_and_crafts.common.block.ACFlowerPotBlock;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class CompatBlocks {

    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(BuiltInRegistries.BLOCK, ACBWGCompat.MOD_ID);

    public static final HashMap<DyeColor, Supplier<Block>> DYED_MAPLE_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_JACARANDA_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_WILLOW_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_GUZMANIA_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_RAINBOW_EUCALYPTUS_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_PINK_ALLIUM_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ORANGE_DAISY_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_PALM_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ALLIUM_FLOWER_BUSH_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_INCAN_LILY_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_FIR_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_BISTORT_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_IRIS_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ALPINE_BELLFLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_BAOBAB_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_BLUE_SPRUCE_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_RED_SPRUCE_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_WHITE_MANGROVE_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_CALIFORNIA_POPPY_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_SKYRIS_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_MINI_CACTUS_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_YELLOW_DAFFODIL_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_CIKA_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_SNOWDROPS_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ORANGE_BIRCH_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_CYAN_ROSE_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_MAGENTA_AMARANTH_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_RED_BIRCH_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ROSE_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_GOLDEN_SPINED_CACTUS_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ASPEN_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_BROWN_OAK_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_FIRECRACKER_FLOWER_BUSH_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_WINTER_CYCLAMEN_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_BEGONIA_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ORANGE_SPRUCE_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_CROCUS_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_PURPLE_AMARANTH_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ANGELICA_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_WHITE_ANEMONE_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_LOLLIPOP_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_VIOLET_LEATHER_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_WITCH_HAZEL_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_WINTER_SUCCULENT_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_DAFFODIL_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_JACARANDA_BUSH_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_CYAN_AMARANTH_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_RED_OAK_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_OSIRIA_ROSE_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_KOVAN_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_MAGENTA_TULIP_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_AMARANTH_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_WHITE_SAKURA_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_WHITE_ALLIUM_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_YUCCA_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_MAHOGANY_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ORANGE_AMARANTH_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_GREEN_ENCHANTED_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_SILVER_VASE_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_SPIRIT_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_RED_MAPLE_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_HOLLY_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_GREEN_TULIP_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_RICHEA_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_BROWN_BIRCH_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_PROTEA_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_CYAN_TULIP_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_INDIGO_JACARANDA_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_PINK_ALLIUM_FLOWER_BUSH_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_PURPLE_SAGE_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ARAUCARIA_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_PEACH_LEATHER_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_WHITE_ALLIUM_FLOWER_BUSH_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ZELKOVA_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_BLUE_SAGE_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ORCHARD_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_PINK_DAFFODIL_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_LAZARUS_BELLFLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_CYPRESS_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_PINK_ANEMONE_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_HORSEWEED_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_PALO_VERDE_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_BLUE_ENCHANTED_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_BLACK_ROSE_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_YELLOW_TULIP_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_WINTER_SCILLA_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_REDWOOD_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_YELLOW_BIRCH_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_YELLOW_SPRUCE_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_EBONY_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_IRONWOOD_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_SILVER_MAPLE_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_WHITE_SAGE_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_WHITE_PUFFBALL_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_WINTER_ROSE_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_PRICKLY_PEAR_CACTUS_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_PINE_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_BROWN_ZELKOVA_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_HYDRANGEA_BUSH_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_YELLOW_SAKURA_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_PURPLE_TULIP_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_FAIRY_SLIPPER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_ORANGE_OAK_SAPLING_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_INDIGO_JACARANDA_BUSH_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DYED_SHRUB_POTS = new HashMap<>();

    private static Block bwgFlowerPot(String path, DyeColor dyeColor) {
        BlockBehaviour.Properties props = BlockBehaviour.Properties.of()
            .instabreak()
            .noOcclusion()
            .pushReaction(PushReaction.DESTROY);
        var rl = ResourceLocation.fromNamespaceAndPath("biomeswevegone", path);
        Block block = BuiltInRegistries.BLOCK.getOptional(rl)
            .orElseGet(() -> {
                ACBWGCompat.LOGGER.warn("BWG block not found: {}", rl);
                return Blocks.AIR;
            });

        return new ACFlowerPotBlock(block, dyeColor, props);
    }

    static {
        for (DyeColor colours : DyeColor.values()) {
            DYED_MAPLE_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_maple_sapling", () -> CompatBlocks.bwgFlowerPot("maple_sapling", colours)));
            DYED_JACARANDA_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_jacaranda_sapling", () -> CompatBlocks.bwgFlowerPot("jacaranda_sapling", colours)));
            DYED_WILLOW_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_willow_sapling", () -> CompatBlocks.bwgFlowerPot("willow_sapling", colours)));
            DYED_GUZMANIA_POTS.put(colours, BLOCKS.register(colours + "_potted_guzmania", () -> CompatBlocks.bwgFlowerPot("guzmania", colours)));
            DYED_RAINBOW_EUCALYPTUS_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_rainbow_eucalyptus_sapling", () -> CompatBlocks.bwgFlowerPot("rainbow_eucalyptus_sapling", colours)));
            DYED_PINK_ALLIUM_POTS.put(colours, BLOCKS.register(colours + "_potted_pink_allium", () -> CompatBlocks.bwgFlowerPot("pink_allium", colours)));
            DYED_ORANGE_DAISY_POTS.put(colours, BLOCKS.register(colours + "_potted_orange_daisy", () -> CompatBlocks.bwgFlowerPot("orange_daisy", colours)));
            DYED_PALM_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_palm_sapling", () -> CompatBlocks.bwgFlowerPot("palm_sapling", colours)));
            DYED_ALLIUM_FLOWER_BUSH_POTS.put(colours, BLOCKS.register(colours + "_potted_allium_flower_bush", () -> CompatBlocks.bwgFlowerPot("allium_flower_bush", colours)));
            DYED_INCAN_LILY_POTS.put(colours, BLOCKS.register(colours + "_potted_incan_lily", () -> CompatBlocks.bwgFlowerPot("incan_lily", colours)));
            DYED_FIR_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_fir_sapling", () -> CompatBlocks.bwgFlowerPot("fir_sapling", colours)));
            DYED_BISTORT_POTS.put(colours, BLOCKS.register(colours + "_potted_bistort", () -> CompatBlocks.bwgFlowerPot("bistort", colours)));
            DYED_IRIS_POTS.put(colours, BLOCKS.register(colours + "_potted_iris", () -> CompatBlocks.bwgFlowerPot("iris", colours)));
            DYED_ALPINE_BELLFLOWER_POTS.put(colours, BLOCKS.register(colours + "_potted_alpine_bellflower", () -> CompatBlocks.bwgFlowerPot("alpine_bellflower", colours)));
            DYED_BAOBAB_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_baobab_sapling", () -> CompatBlocks.bwgFlowerPot("baobab_sapling", colours)));
            DYED_BLUE_SPRUCE_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_blue_spruce_sapling", () -> CompatBlocks.bwgFlowerPot("blue_spruce_sapling", colours)));
            DYED_RED_SPRUCE_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_red_spruce_sapling", () -> CompatBlocks.bwgFlowerPot("red_spruce_sapling", colours)));
            DYED_WHITE_MANGROVE_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_white_mangrove_sapling", () -> CompatBlocks.bwgFlowerPot("white_mangrove_sapling", colours)));
            DYED_CALIFORNIA_POPPY_POTS.put(colours, BLOCKS.register(colours + "_potted_california_poppy", () -> CompatBlocks.bwgFlowerPot("california_poppy", colours)));
            DYED_SKYRIS_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_skyris_sapling", () -> CompatBlocks.bwgFlowerPot("skyris_sapling", colours)));
            DYED_MINI_CACTUS_POTS.put(colours, BLOCKS.register(colours + "_potted_mini_cactus", () -> CompatBlocks.bwgFlowerPot("mini_cactus", colours)));
            DYED_YELLOW_DAFFODIL_POTS.put(colours, BLOCKS.register(colours + "_potted_yellow_daffodil", () -> CompatBlocks.bwgFlowerPot("yellow_daffodil", colours)));
            DYED_CIKA_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_cika_sapling", () -> CompatBlocks.bwgFlowerPot("cika_sapling", colours)));
            DYED_SNOWDROPS_POTS.put(colours, BLOCKS.register(colours + "_potted_snowdrops", () -> CompatBlocks.bwgFlowerPot("snowdrops", colours)));
            DYED_ORANGE_BIRCH_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_orange_birch_sapling", () -> CompatBlocks.bwgFlowerPot("orange_birch_sapling", colours)));
            DYED_CYAN_ROSE_POTS.put(colours, BLOCKS.register(colours + "_potted_cyan_rose", () -> CompatBlocks.bwgFlowerPot("cyan_rose", colours)));
            DYED_MAGENTA_AMARANTH_POTS.put(colours, BLOCKS.register(colours + "_potted_magenta_amaranth", () -> CompatBlocks.bwgFlowerPot("magenta_amaranth", colours)));
            DYED_RED_BIRCH_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_red_birch_sapling", () -> CompatBlocks.bwgFlowerPot("red_birch_sapling", colours)));
            DYED_ROSE_POTS.put(colours, BLOCKS.register(colours + "_potted_rose", () -> CompatBlocks.bwgFlowerPot("rose", colours)));
            DYED_GOLDEN_SPINED_CACTUS_POTS.put(colours, BLOCKS.register(colours + "_potted_golden_spined_cactus", () -> CompatBlocks.bwgFlowerPot("golden_spined_cactus", colours)));
            DYED_ASPEN_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_aspen_sapling", () -> CompatBlocks.bwgFlowerPot("aspen_sapling", colours)));
            DYED_BROWN_OAK_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_brown_oak_sapling", () -> CompatBlocks.bwgFlowerPot("brown_oak_sapling", colours)));
            DYED_FIRECRACKER_FLOWER_BUSH_POTS.put(colours, BLOCKS.register(colours + "_potted_firecracker_flower_bush", () -> CompatBlocks.bwgFlowerPot("firecracker_flower_bush", colours)));
            DYED_WINTER_CYCLAMEN_POTS.put(colours, BLOCKS.register(colours + "_potted_winter_cyclamen", () -> CompatBlocks.bwgFlowerPot("winter_cyclamen", colours)));
            DYED_BEGONIA_POTS.put(colours, BLOCKS.register(colours + "_potted_begonia", () -> CompatBlocks.bwgFlowerPot("begonia", colours)));
            DYED_ORANGE_SPRUCE_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_orange_spruce_sapling", () -> CompatBlocks.bwgFlowerPot("orange_spruce_sapling", colours)));
            DYED_CROCUS_POTS.put(colours, BLOCKS.register(colours + "_potted_crocus", () -> CompatBlocks.bwgFlowerPot("crocus", colours)));
            DYED_PURPLE_AMARANTH_POTS.put(colours, BLOCKS.register(colours + "_potted_purple_amaranth", () -> CompatBlocks.bwgFlowerPot("purple_amaranth", colours)));
            DYED_ANGELICA_POTS.put(colours, BLOCKS.register(colours + "_potted_angelica", () -> CompatBlocks.bwgFlowerPot("angelica", colours)));
            DYED_WHITE_ANEMONE_POTS.put(colours, BLOCKS.register(colours + "_potted_white_anemone", () -> CompatBlocks.bwgFlowerPot("white_anemone", colours)));
            DYED_LOLLIPOP_FLOWER_POTS.put(colours, BLOCKS.register(colours + "_potted_lollipop_flower", () -> CompatBlocks.bwgFlowerPot("lollipop_flower", colours)));
            DYED_VIOLET_LEATHER_FLOWER_POTS.put(colours, BLOCKS.register(colours + "_potted_violet_leather_flower", () -> CompatBlocks.bwgFlowerPot("violet_leather_flower", colours)));
            DYED_WITCH_HAZEL_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_witch_hazel_sapling", () -> CompatBlocks.bwgFlowerPot("witch_hazel_sapling", colours)));
            DYED_WINTER_SUCCULENT_POTS.put(colours, BLOCKS.register(colours + "_potted_winter_succulent", () -> CompatBlocks.bwgFlowerPot("winter_succulent", colours)));
            DYED_DAFFODIL_POTS.put(colours, BLOCKS.register(colours + "_potted_daffodil", () -> CompatBlocks.bwgFlowerPot("daffodil", colours)));
            DYED_JACARANDA_BUSH_POTS.put(colours, BLOCKS.register(colours + "_potted_jacaranda_bush", () -> CompatBlocks.bwgFlowerPot("jacaranda_bush", colours)));
            DYED_CYAN_AMARANTH_POTS.put(colours, BLOCKS.register(colours + "_potted_cyan_amaranth", () -> CompatBlocks.bwgFlowerPot("cyan_amaranth", colours)));
            DYED_RED_OAK_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_red_oak_sapling", () -> CompatBlocks.bwgFlowerPot("red_oak_sapling", colours)));
            DYED_OSIRIA_ROSE_POTS.put(colours, BLOCKS.register(colours + "_potted_osiria_rose", () -> CompatBlocks.bwgFlowerPot("osiria_rose", colours)));
            DYED_KOVAN_FLOWER_POTS.put(colours, BLOCKS.register(colours + "_potted_kovan_flower", () -> CompatBlocks.bwgFlowerPot("kovan_flower", colours)));
            DYED_MAGENTA_TULIP_POTS.put(colours, BLOCKS.register(colours + "_potted_magenta_tulip", () -> CompatBlocks.bwgFlowerPot("magenta_tulip", colours)));
            DYED_AMARANTH_POTS.put(colours, BLOCKS.register(colours + "_potted_amaranth", () -> CompatBlocks.bwgFlowerPot("amaranth", colours)));
            DYED_WHITE_SAKURA_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_white_sakura_sapling", () -> CompatBlocks.bwgFlowerPot("white_sakura_sapling", colours)));
            DYED_WHITE_ALLIUM_POTS.put(colours, BLOCKS.register(colours + "_potted_white_allium", () -> CompatBlocks.bwgFlowerPot("white_allium", colours)));
            DYED_YUCCA_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_yucca_sapling", () -> CompatBlocks.bwgFlowerPot("yucca_sapling", colours)));
            DYED_MAHOGANY_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_mahogany_sapling", () -> CompatBlocks.bwgFlowerPot("mahogany_sapling", colours)));
            DYED_ORANGE_AMARANTH_POTS.put(colours, BLOCKS.register(colours + "_potted_orange_amaranth", () -> CompatBlocks.bwgFlowerPot("orange_amaranth", colours)));
            DYED_GREEN_ENCHANTED_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_green_enchanted_sapling", () -> CompatBlocks.bwgFlowerPot("green_enchanted_sapling", colours)));
            DYED_SILVER_VASE_FLOWER_POTS.put(colours, BLOCKS.register(colours + "_potted_silver_vase_flower", () -> CompatBlocks.bwgFlowerPot("silver_vase_flower", colours)));
            DYED_SPIRIT_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_spirit_sapling", () -> CompatBlocks.bwgFlowerPot("spirit_sapling", colours)));
            DYED_RED_MAPLE_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_red_maple_sapling", () -> CompatBlocks.bwgFlowerPot("red_maple_sapling", colours)));
            DYED_HOLLY_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_holly_sapling", () -> CompatBlocks.bwgFlowerPot("holly_sapling", colours)));
            DYED_GREEN_TULIP_POTS.put(colours, BLOCKS.register(colours + "_potted_green_tulip", () -> CompatBlocks.bwgFlowerPot("green_tulip", colours)));
            DYED_RICHEA_POTS.put(colours, BLOCKS.register(colours + "_potted_richea", () -> CompatBlocks.bwgFlowerPot("richea", colours)));
            DYED_BROWN_BIRCH_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_brown_birch_sapling", () -> CompatBlocks.bwgFlowerPot("brown_birch_sapling", colours)));
            DYED_PROTEA_FLOWER_POTS.put(colours, BLOCKS.register(colours + "_potted_protea_flower", () -> CompatBlocks.bwgFlowerPot("protea_flower", colours)));
            DYED_CYAN_TULIP_POTS.put(colours, BLOCKS.register(colours + "_potted_cyan_tulip", () -> CompatBlocks.bwgFlowerPot("cyan_tulip", colours)));
            DYED_INDIGO_JACARANDA_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_indigo_jacaranda_sapling", () -> CompatBlocks.bwgFlowerPot("indigo_jacaranda_sapling", colours)));
            DYED_PINK_ALLIUM_FLOWER_BUSH_POTS.put(colours, BLOCKS.register(colours + "_potted_pink_allium_flower_bush", () -> CompatBlocks.bwgFlowerPot("pink_allium_flower_bush", colours)));
            DYED_PURPLE_SAGE_POTS.put(colours, BLOCKS.register(colours + "_potted_purple_sage", () -> CompatBlocks.bwgFlowerPot("purple_sage", colours)));
            DYED_ARAUCARIA_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_araucaria_sapling", () -> CompatBlocks.bwgFlowerPot("araucaria_sapling", colours)));
            DYED_PEACH_LEATHER_FLOWER_POTS.put(colours, BLOCKS.register(colours + "_potted_peach_leather_flower", () -> CompatBlocks.bwgFlowerPot("peach_leather_flower", colours)));
            DYED_WHITE_ALLIUM_FLOWER_BUSH_POTS.put(colours, BLOCKS.register(colours + "_potted_white_allium_flower_bush", () -> CompatBlocks.bwgFlowerPot("white_allium_flower_bush", colours)));
            DYED_ZELKOVA_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_zelkova_sapling", () -> CompatBlocks.bwgFlowerPot("zelkova_sapling", colours)));
            DYED_BLUE_SAGE_POTS.put(colours, BLOCKS.register(colours + "_potted_blue_sage", () -> CompatBlocks.bwgFlowerPot("blue_sage", colours)));
            DYED_ORCHARD_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_orchard_sapling", () -> CompatBlocks.bwgFlowerPot("orchard_sapling", colours)));
            DYED_PINK_DAFFODIL_POTS.put(colours, BLOCKS.register(colours + "_potted_pink_daffodil", () -> CompatBlocks.bwgFlowerPot("pink_daffodil", colours)));
            DYED_LAZARUS_BELLFLOWER_POTS.put(colours, BLOCKS.register(colours + "_potted_lazarus_bellflower", () -> CompatBlocks.bwgFlowerPot("lazarus_bellflower", colours)));
            DYED_CYPRESS_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_cypress_sapling", () -> CompatBlocks.bwgFlowerPot("cypress_sapling", colours)));
            DYED_PINK_ANEMONE_POTS.put(colours, BLOCKS.register(colours + "_potted_pink_anemone", () -> CompatBlocks.bwgFlowerPot("pink_anemone", colours)));
            DYED_HORSEWEED_POTS.put(colours, BLOCKS.register(colours + "_potted_horseweed", () -> CompatBlocks.bwgFlowerPot("horseweed", colours)));
            DYED_PALO_VERDE_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_palo_verde_sapling", () -> CompatBlocks.bwgFlowerPot("palo_verde_sapling", colours)));
            DYED_BLUE_ENCHANTED_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_blue_enchanted_sapling", () -> CompatBlocks.bwgFlowerPot("blue_enchanted_sapling", colours)));
            DYED_BLACK_ROSE_POTS.put(colours, BLOCKS.register(colours + "_potted_black_rose", () -> CompatBlocks.bwgFlowerPot("black_rose", colours)));
            DYED_YELLOW_TULIP_POTS.put(colours, BLOCKS.register(colours + "_potted_yellow_tulip", () -> CompatBlocks.bwgFlowerPot("yellow_tulip", colours)));
            DYED_WINTER_SCILLA_POTS.put(colours, BLOCKS.register(colours + "_potted_winter_scilla", () -> CompatBlocks.bwgFlowerPot("winter_scilla", colours)));
            DYED_REDWOOD_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_redwood_sapling", () -> CompatBlocks.bwgFlowerPot("redwood_sapling", colours)));
            DYED_YELLOW_BIRCH_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_yellow_birch_sapling", () -> CompatBlocks.bwgFlowerPot("yellow_birch_sapling", colours)));
            DYED_YELLOW_SPRUCE_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_yellow_spruce_sapling", () -> CompatBlocks.bwgFlowerPot("yellow_spruce_sapling", colours)));
            DYED_EBONY_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_ebony_sapling", () -> CompatBlocks.bwgFlowerPot("ebony_sapling", colours)));
            DYED_IRONWOOD_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_ironwood_sapling", () -> CompatBlocks.bwgFlowerPot("ironwood_sapling", colours)));
            DYED_SILVER_MAPLE_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_silver_maple_sapling", () -> CompatBlocks.bwgFlowerPot("silver_maple_sapling", colours)));
            DYED_WHITE_SAGE_POTS.put(colours, BLOCKS.register(colours + "_potted_white_sage", () -> CompatBlocks.bwgFlowerPot("white_sage", colours)));
            DYED_WHITE_PUFFBALL_POTS.put(colours, BLOCKS.register(colours + "_potted_white_puffball", () -> CompatBlocks.bwgFlowerPot("white_puffball", colours)));
            DYED_WINTER_ROSE_POTS.put(colours, BLOCKS.register(colours + "_potted_winter_rose", () -> CompatBlocks.bwgFlowerPot("winter_rose", colours)));
            DYED_PRICKLY_PEAR_CACTUS_POTS.put(colours, BLOCKS.register(colours + "_potted_prickly_pear_cactus", () -> CompatBlocks.bwgFlowerPot("prickly_pear_cactus", colours)));
            DYED_PINE_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_pine_sapling", () -> CompatBlocks.bwgFlowerPot("pine_sapling", colours)));
            DYED_BROWN_ZELKOVA_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_brown_zelkova_sapling", () -> CompatBlocks.bwgFlowerPot("brown_zelkova_sapling", colours)));
            DYED_HYDRANGEA_BUSH_POTS.put(colours, BLOCKS.register(colours + "_potted_hydrangea_bush", () -> CompatBlocks.bwgFlowerPot("hydrangea_bush", colours)));
            DYED_YELLOW_SAKURA_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_yellow_sakura_sapling", () -> CompatBlocks.bwgFlowerPot("yellow_sakura_sapling", colours)));
            DYED_PURPLE_TULIP_POTS.put(colours, BLOCKS.register(colours + "_potted_purple_tulip", () -> CompatBlocks.bwgFlowerPot("purple_tulip", colours)));
            DYED_FAIRY_SLIPPER_POTS.put(colours, BLOCKS.register(colours + "_potted_fairy_slipper", () -> CompatBlocks.bwgFlowerPot("fairy_slipper", colours)));
            DYED_ORANGE_OAK_SAPLING_POTS.put(colours, BLOCKS.register(colours + "_potted_orange_oak_sapling", () -> CompatBlocks.bwgFlowerPot("orange_oak_sapling", colours)));
            DYED_INDIGO_JACARANDA_BUSH_POTS.put(colours, BLOCKS.register(colours + "_potted_indigo_jacaranda_bush", () -> CompatBlocks.bwgFlowerPot("indigo_jacaranda_bush", colours)));
            DYED_SHRUB_POTS.put(colours, BLOCKS.register(colours + "_potted_shrub", () -> CompatBlocks.bwgFlowerPot("shrub", colours)));
        }
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
