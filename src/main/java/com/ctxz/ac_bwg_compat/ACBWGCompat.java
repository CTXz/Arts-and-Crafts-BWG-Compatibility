package com.ctxz.ac_bwg_compat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ACBWGCompat.MOD_ID)
public class ACBWGCompat {
    public static final String MOD_ID = "ac_bwg_compat";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public ACBWGCompat(IEventBus modBus) {
        CompatBlocks.register(modBus);
    }
}
