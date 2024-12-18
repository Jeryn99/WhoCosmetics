package dev.jeryn.doctorwho.common.forge;

import dev.jeryn.doctorwho.common.WCBlocks;
import dev.jeryn.doctorwho.common.WCItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class WCItemsImpl {

    public static CreativeModeTab createTab() {
        return CreativeModeTab.builder().title(Component.translatable(WCItems.CREATIVE_TAB)).icon(() -> new ItemStack(WCBlocks.WHIRLY_GIG.get())).build();
    }


    public static CreativeModeTab createRoundelSlabsTab() {
        return CreativeModeTab.builder().title(Component.translatable(WCItems.CREATIVE_TAB)).icon(() -> new ItemStack(WCBlocks.ROUNDEL_CORAL_SLAB.get())).build();
    }


    public static CreativeModeTab createRoundelTab() {
        return CreativeModeTab.builder().title(Component.translatable(WCItems.CREATIVE_TAB)).icon(() -> new ItemStack(WCBlocks.ROUNDEL_CORAL.get())).build();
    }

}
