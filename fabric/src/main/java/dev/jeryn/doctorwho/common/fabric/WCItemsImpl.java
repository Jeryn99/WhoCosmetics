package dev.jeryn.doctorwho.common.fabric;

import dev.jeryn.doctorwho.WhoCosmetics;
import dev.jeryn.doctorwho.common.WCBlocks;
import dev.jeryn.doctorwho.common.WCItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class WCItemsImpl {

    public static final CreativeModeTab ITEM_GROUP = FabricItemGroup.builder().icon(() -> new ItemStack(WCBlocks.WHIRLY_GIG.get())).displayItems((enabledFeatures, entries) -> {

        BuiltInRegistries.ITEM.iterator().forEachRemaining(item -> {
            if (BuiltInRegistries.ITEM.getKey(item).getNamespace().matches(WhoCosmetics.MOD_ID)) {
                entries.accept(item);
            }
        });
    }).title(Component.translatable(WCItems.CREATIVE_TAB)).build();

    public static CreativeModeTab createTab() {
        return ITEM_GROUP;
    }

}
