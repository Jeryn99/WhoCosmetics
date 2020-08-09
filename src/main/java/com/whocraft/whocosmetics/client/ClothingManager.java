package com.whocraft.whocosmetics.client;

import com.whocraft.whocosmetics.client.models.*;
import com.whocraft.whocosmetics.common.WCItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;

import java.util.HashMap;

public class ClothingManager {

    private static HashMap<Item, ClothingData> CLOTH_MODELS = new HashMap<>();

    public static void setup() {
        addData(WCItems.FEZ.get(), new ClothingData(WCItems.FEZ.get()).setModelForSlot(new FezModel(), EquipmentSlotType.HEAD));
        addData(WCItems.BOW_TIE.get(), new ClothingData(WCItems.BOW_TIE.get()).setModelForSlot(new BowTieModel(), EquipmentSlotType.CHEST));
        addData(WCItems.STETSON.get(), new ClothingData(WCItems.STETSON.get()).setModelForSlot(new StetsonModel(), EquipmentSlotType.HEAD));
        addData(WCItems.ASTRAKHAN.get(), new ClothingData(WCItems.ASTRAKHAN.get()).setModelForSlot(new FirstHatModel(), EquipmentSlotType.HEAD));
        addData(WCItems.STRAW_HAT.get(), new ClothingData(WCItems.STRAW_HAT.get()).setModelForSlot(new StrawHatModel(), EquipmentSlotType.HEAD));
        addData(WCItems.BOW_TIE.get(), new ClothingData(WCItems.BOW_TIE.get()).setModelForSlot(new BowTieModel(), EquipmentSlotType.CHEST));
        addData(WCItems.RAINBOW_SCARF.get(), new ClothingData(WCItems.RAINBOW_SCARF.get()).setModelForSlot(new RainbowScarfModel(), EquipmentSlotType.CHEST));
        addData(WCItems.CELERY.get(), new ClothingData(WCItems.CELERY.get()).setModelForSlot(new StickOfCeleryModel(), EquipmentSlotType.CHEST));
        addData(WCItems.WINGS.get(), new ClothingData(WCItems.WINGS.get()).setModelForSlot(new WeepingAngelWingsModel(), EquipmentSlotType.CHEST).setModeller(null));
        addData(WCItems.SCARF.get(), new ClothingData(WCItems.SCARF.get()).setModelForSlot(new ScarfModel(), EquipmentSlotType.CHEST));
        addData(WCItems.SATCHEL.get(), new ClothingData(WCItems.SATCHEL.get()).setModelForSlot(new SatchelModel(), EquipmentSlotType.CHEST));
        addData(WCItems.CLOAK.get(), new ClothingData(WCItems.CLOAK.get()).setModelForSlot(new RedCloakModel(), EquipmentSlotType.CHEST).hasArmSupport());
        addData(WCItems.CRICKET_JACKET.get(), new ClothingData(WCItems.CRICKET_JACKET.get()).setModelForSlot(new CricketJacketModel(), EquipmentSlotType.CHEST).hasArmSupport());
        addData(WCItems.CLOAK.get(), new ClothingData(WCItems.CLOAK.get()).setModelForSlot(new RedCloakModel(), EquipmentSlotType.CHEST));
    }

    public static ClothingData getDataForItem(Item item) {
        return CLOTH_MODELS.get(item);
    }

    public static void addData(Item item, ClothingData biped) {
        CLOTH_MODELS.put(item, biped);
    }

}
