package me.craig.software.cosmetics.handles;

import me.craig.software.cosmetics.common.items.ClothingItem;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;

public class ClientEvents {

    public static void init() {
        for (Item item : Registry.ITEM) {
            ColorProviderRegistry.ITEM.register((itemStack, index) -> {
                if (itemStack.getItem() instanceof ClothingItem clothingItem && index == 0) {
                    if (clothingItem.isColored()) {
                        return clothingItem.getColor(itemStack);
                    }
                }
                return -1;
            }, item);
        }
    }

}
