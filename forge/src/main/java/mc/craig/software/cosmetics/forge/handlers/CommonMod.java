package mc.craig.software.cosmetics.forge.handlers;

import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.common.WCItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;


@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
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
