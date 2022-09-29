package mc.craig.software.cosmetics.fabric.fabric.handles;

import mc.craig.software.cosmetics.common.items.ClothingItem;
import mc.craig.software.cosmetics.common.WCItems;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

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
    }

}
