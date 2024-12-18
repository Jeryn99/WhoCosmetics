package dev.jeryn.doctorwho.common.fabric;

import dev.jeryn.doctorwho.WhoCosmetics;
import dev.jeryn.doctorwho.common.WCBlocks;
import dev.jeryn.doctorwho.common.WCItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;

public class WCItemsImpl {

    public static final CreativeModeTab ITEM_GROUP = FabricItemGroup.builder().icon(() -> new ItemStack(WCBlocks.WHIRLY_GIG.get())).displayItems((enabledFeatures, entries) -> {

        BuiltInRegistries.ITEM.iterator().forEachRemaining(item -> {
            if (BuiltInRegistries.ITEM.getKey(item).getNamespace().matches(WhoCosmetics.MOD_ID) && !(item instanceof BlockItem)) {
                entries.accept(item);
            }
        });
    }).title(Component.translatable(WCItems.CREATIVE_TAB)).build();

    public static final CreativeModeTab SLABS = FabricItemGroup.builder().icon(() -> new ItemStack(WCBlocks.ROUNDEL_CORAL_SLAB.get())).displayItems((enabledFeatures, entries) -> {

        BuiltInRegistries.ITEM.iterator().forEachRemaining(item -> {
            if (BuiltInRegistries.ITEM.getKey(item).getNamespace().matches(WhoCosmetics.MOD_ID) && item instanceof BlockItem blockItem) {
                if(blockItem.getBlock() instanceof SlabBlock) {
                    entries.accept(item);
                }
            }
        });
    }).title(Component.translatable(WCItems.CREATIVE_TAB)).build();


    public static final CreativeModeTab ROUNDELS = FabricItemGroup.builder().icon(() -> new ItemStack(WCBlocks.ROUNDEL_CORAL.get())).displayItems((enabledFeatures, entries) -> {

        BuiltInRegistries.ITEM.iterator().forEachRemaining(item -> {
            if (BuiltInRegistries.ITEM.getKey(item).getNamespace().matches(WhoCosmetics.MOD_ID) && item instanceof BlockItem blockItem) {
                if(!(blockItem.getBlock() instanceof SlabBlock)) {
                    entries.accept(item);
                }
            }
        });
    }).title(Component.translatable(WCItems.CREATIVE_TAB)).build();

    public static CreativeModeTab createTab() {
        return ITEM_GROUP;
    }


    public static CreativeModeTab createRoundelSlabsTab() {
        return SLABS;
    }


    public static CreativeModeTab createRoundelTab() {
        return ROUNDELS;
    }
}
