package dev.jeryn.doctorwho.fabric.fabric.handles;

import dev.jeryn.doctorwho.common.WCBlocks;
import dev.jeryn.doctorwho.common.WCItems;
import dev.jeryn.doctorwho.common.items.ClothingItem;
import dev.jeryn.doctorwho.common.items.JSONClothingItem;
import dev.jeryn.doctorwho.common.items.UmbrellaItem;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class ClientEvents {

    public static void init() {

        BlockRenderLayerMap.INSTANCE.putBlock(WCBlocks.TUBE_LIGHT.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(WCBlocks.VICTORIAN_MONITOR.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(WCBlocks.HAT_STAND.get(), RenderType.translucent());


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
