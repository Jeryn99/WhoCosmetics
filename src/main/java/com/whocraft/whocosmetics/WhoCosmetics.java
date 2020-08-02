package com.whocraft.whocosmetics;

import com.whocraft.whocosmetics.client.ClothingManager;
import com.whocraft.whocosmetics.common.WCItems;
import com.whocraft.whocosmetics.data.ItemModelCreation;
import com.whocraft.whocosmetics.data.RecipeCreation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
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
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        FMLJavaModLoadingContext.get().getModEventBus().register(this);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void onNewRegistries(RegistryEvent.NewRegistry e) {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        WCItems.ITEMS.register(eventBus);
    }

    @SubscribeEvent
    public void gatherData(GatherDataEvent e) {
        e.getGenerator().addProvider(new ItemModelCreation(e.getGenerator()));
        e.getGenerator().addProvider(new RecipeCreation(e.getGenerator()));
    }

    public void doClientStuff(final FMLClientSetupEvent event) {
        ClothingManager.setup();
    }

}
