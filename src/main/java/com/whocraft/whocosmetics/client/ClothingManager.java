package com.whocraft.whocosmetics.client;

import com.whocraft.whocosmetics.client.models.FezModel;
import com.whocraft.whocosmetics.client.models.FirstHatModel;
import com.whocraft.whocosmetics.client.models.StetsonModel;
import com.whocraft.whocosmetics.common.WCItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;

import java.util.HashMap;

public class ClothingManager {

    private static HashMap<Item, ClothingData> CLOTH_MODELS = new HashMap<>();

    public static void setup() {
        addData(WCItems.FEZ.get(), new ClothingData(WCItems.FEZ.get(), "fez").setModelForSlot(new FezModel(), EquipmentSlotType.HEAD));
        addData(WCItems.STETSON.get(), new ClothingData(WCItems.STETSON.get(), "stetson").setModelForSlot(new StetsonModel(), EquipmentSlotType.HEAD));
        addData(WCItems.FIRST_HAT.get(), new ClothingData(WCItems.FIRST_HAT.get(), "first_hat").setModelForSlot(new FirstHatModel(), EquipmentSlotType.HEAD));
    }

    public static ClothingData getDataForItem(Item item) {
        return CLOTH_MODELS.get(item);
    }

    public static void addData(Item item, ClothingData biped) {
        CLOTH_MODELS.put(item, biped);
    }

}
