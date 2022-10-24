package mc.craig.software.cosmetics.common.forge;

import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.common.WCItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class WCItemsImpl {
    public static final CreativeModeTab TAB = new CreativeModeTab(WhoCosmetics.MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(WCItems.EYE_STALK.get());
        }
    };

    public static CreativeModeTab getCreativeTab() {
        return TAB;
    }

}
