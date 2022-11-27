package mc.craig.software.cosmetics.fabric.fabric.handles;

import mc.craig.software.cosmetics.common.WCItems;
import mc.craig.software.cosmetics.common.items.ClothingItem;
import mc.craig.software.cosmetics.common.items.JSONClothingItem;
import mc.craig.software.cosmetics.common.items.UmbrellaItem;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class ClientEvents {

    public static void init() {
        ColorProviderRegistry.ITEM.register((itemStack, index) -> {
            if (itemStack.getItem() instanceof ClothingItem clothingItem && index == 0) {
                if (clothingItem.isColored()) {
                    return clothingItem.getColor(itemStack);
                }
            }
            return -1;
        }, WCItems.BOW_TIE.get(), WCItems.FEZ.get());

        ColorProviderRegistry.ITEM.register((itemStack, index) -> {
            if (itemStack.getItem() instanceof JSONClothingItem clothingItem && index == 0) {
                if (clothingItem.isColored()) {
                    return clothingItem.getColor(itemStack);
                }
            }
            return -1;
        }, WCItems.TOP_HAT.get());

        ItemProperties.register(WCItems.UMBRELLA.get(), new ResourceLocation("whocosmetics:is_open"), (itemStack, clientWorld, livingEntity, unused) -> UmbrellaItem.getIsOpen(itemStack) ? 1 : 0);
        ItemProperties.register(WCItems.UMBRELLA_MISSY.get(), new ResourceLocation("whocosmetics:is_open"), (itemStack, clientWorld, livingEntity, unused) -> UmbrellaItem.getIsOpen(itemStack) ? 1 : 0);
    }

}
