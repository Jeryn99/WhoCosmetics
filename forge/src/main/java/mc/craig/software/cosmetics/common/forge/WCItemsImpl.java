package mc.craig.software.cosmetics.common.forge;

import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.common.WCBlocks;
import mc.craig.software.cosmetics.common.WCItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;

public class WCItemsImpl {

    public static CreativeModeTab createTab() {
        return CreativeModeTab.builder().title(Component.translatable(WCItems.CREATIVE_TAB)).icon(() -> new ItemStack(WCBlocks.WHIRLY_GIG.get())).build();

    }

}
