package com.whocraft.whocosmetics.client;

import com.whocraft.whocosmetics.Modeller;
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
        addData(WCItems.RAINBOW_SCARF.get(), new ClothingData(WCItems.RAINBOW_SCARF.get()).setModelForSlot(new RainbowScarfModel(), EquipmentSlotType.CHEST));
        addData(WCItems.CELERY.get(), new ClothingData(WCItems.CELERY.get()).setModelForSlot(new StickOfCeleryModel(), EquipmentSlotType.CHEST));
        addData(WCItems.SCARF.get(), new ClothingData(WCItems.SCARF.get()).setModelForSlot(new ScarfModel(), EquipmentSlotType.CHEST));
        addData(WCItems.SATCHEL.get(), new ClothingData(WCItems.SATCHEL.get()).setModelForSlot(new SatchelModel(), EquipmentSlotType.CHEST));
        addData(WCItems.CRICKET_JACKET.get(), new ClothingData(WCItems.CRICKET_JACKET.get()).setModelForSlot(new GenericJacketModel(), EquipmentSlotType.CHEST).setModeller(Modeller.VIOLET));
        addData(WCItems.VELVET_COAT.get(), new ClothingData(WCItems.VELVET_COAT.get()).setModelForSlot(new GenericJacketModel(), EquipmentSlotType.CHEST).setModeller(Modeller.VIOLET));
        addData(WCItems.TENTH_COAT.get(), new ClothingData(WCItems.TENTH_COAT.get()).setModelForSlot(new GenericJacketModel(), EquipmentSlotType.CHEST).setModeller(Modeller.VIOLET));
      //  addData(WCItems.CLOAK.get(), new ClothingData(WCItems.CLOAK.get()).setModelForSlot(new RedCloakModel(), EquipmentSlotType.CHEST).setModeller(Modeller.END));

       // addData(WCItems.SPACE_HELMET.get(), new ClothingData(WCItems.SPACE_HELMET.get(), "space_suit").setModelForSlot(new SpaceHelmetModel(), EquipmentSlotType.HEAD).setModeller(Modeller.VIOLET));
      //  addData(WCItems.SPACE_CHEST.get(), new ClothingData(WCItems.SPACE_CHEST.get(), "space_suit").setModelForSlot(new SpaceChestModel(), EquipmentSlotType.CHEST).setModeller(Modeller.VIOLET));
      //  addData(WCItems.SPACE_LEGS.get(), new ClothingData(WCItems.SPACE_LEGS.get(), "space_suit").setModelForSlot(new SpaceLegsModel(), EquipmentSlotType.LEGS).setModeller(Modeller.VIOLET));
        addData(WCItems.SASH.get(), new ClothingData(WCItems.SASH.get()).setModelForSlot(new RassilonSashModel(), EquipmentSlotType.CHEST).setModeller(Modeller.END));

    }

    public static ClothingData getDataForItem(Item item) {
        return CLOTH_MODELS.get(item);
    }

    public static void addData(Item item, ClothingData biped) {
        CLOTH_MODELS.put(item, biped);
    }

}
