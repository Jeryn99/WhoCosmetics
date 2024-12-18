package dev.jeryn.doctorwho.forge.handlers;

import dev.jeryn.doctorwho.WhoCosmetics;
import dev.jeryn.doctorwho.common.WCItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonMod {


    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent buildEvent) {
        BuiltInRegistries.ITEM.iterator().forEachRemaining(item -> {
            if(buildEvent.getTab() == WCItems.MAIN.get()) {
                if (BuiltInRegistries.ITEM.getKey(item).getNamespace().matches(WhoCosmetics.MOD_ID)) {
                    buildEvent.accept(item);
                }
            }
        });
    }

}
