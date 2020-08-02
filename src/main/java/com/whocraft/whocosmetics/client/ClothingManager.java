package com.whocraft.whocosmetics.client;

import com.whocraft.whocosmetics.client.models.FezModel;
import com.whocraft.whocosmetics.common.WCItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;

import java.util.HashMap;

public class ClothingManager {

    private static HashMap<Item, ClothingData> CLOTH_MODELS = new HashMap<>();

    public static void setup() {
        addData(WCItems.FEZ.get(), new ClothingData(WCItems.FEZ.get(), "fez").setModelForSlot(new FezModel(), EquipmentSlotType.HEAD));
    }

    public static ClothingData getDataForItem(Item item) {
        return CLOTH_MODELS.get(item);
    }

    public static void addData(Item item, ClothingData biped) {
        CLOTH_MODELS.put(item, biped);
    }

}
