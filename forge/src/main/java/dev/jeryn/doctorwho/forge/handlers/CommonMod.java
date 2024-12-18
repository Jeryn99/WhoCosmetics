package dev.jeryn.doctorwho.forge.handlers;

import dev.jeryn.doctorwho.WhoCosmetics;
import dev.jeryn.doctorwho.common.WCItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonMod {


    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent buildEvent) {
        CreativeModeTab tab = buildEvent.getTab();
        String modNamespace = WhoCosmetics.MOD_ID;

        BuiltInRegistries.ITEM.iterator().forEachRemaining(item -> {
            String namespace = BuiltInRegistries.ITEM.getKey(item).getNamespace();

            if (!namespace.equals(modNamespace)) {
                return; // Skip items from other namespaces
            }

            if (tab == WCItems.MAIN.get() && !(item instanceof BlockItem)) {
                buildEvent.accept(item);
            } else if (tab == WCItems.ROUNDELS.get() && item instanceof BlockItem blockItem) {
                if(!(blockItem.getBlock() instanceof SlabBlock)) {
                    buildEvent.accept(item);
                }
            } else if (tab == WCItems.SLABS.get() && item instanceof BlockItem blockItem) {
                if (blockItem.getBlock() instanceof SlabBlock) {
                    buildEvent.accept(item);
                }
            }
        });
    }


}
