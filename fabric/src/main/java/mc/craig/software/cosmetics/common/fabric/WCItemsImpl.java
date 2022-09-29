package mc.craig.software.cosmetics.common.fabric;

import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.common.WCItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class WCItemsImpl {

    public static final CreativeModeTab TAB = FabricItemGroupBuilder.build(
            new ResourceLocation(WhoCosmetics.MOD_ID, WhoCosmetics.MOD_ID),
            () -> new ItemStack(WCItems.EYE_STALK.get()));

    public static CreativeModeTab getCreativeTab() {
        return TAB;
    }

}
