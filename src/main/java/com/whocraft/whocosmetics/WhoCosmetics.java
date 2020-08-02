package com.whocraft.whocosmetics;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;


@Mod(WhoCosmetics.MODID)
public class WhoCosmetics
{

    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MODID = "whocosmetics";

    public WhoCosmetics() {

        FMLJavaModLoadingContext.get().getModEventBus().register(this);
        MinecraftForge.EVENT_BUS.register(this);

    }

    public void doClientStuff(final FMLClientSetupEvent event) {

    }

}
