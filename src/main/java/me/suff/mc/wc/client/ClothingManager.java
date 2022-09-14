package me.suff.mc.wc.client;

import me.suff.mc.wc.Modeller;
import me.suff.mc.wc.common.WCItems;
import me.suff.mc.wc.client.models.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;

import java.util.HashMap;

public class ClothingManager {

    private static HashMap<Item, ClothingData> CLOTH_MODELS = new HashMap<>();

    public static void setup() {
        addData(WCItems.FEZ.get(), new ClothingData(WCItems.FEZ.get()).setModelForSlot(new FezModel(), EquipmentSlotType.HEAD).ignoreSteve());
        addData(WCItems.BOW_TIE.get(), new ClothingData(WCItems.BOW_TIE.get()).setModelForSlot(new BowTieModel(), EquipmentSlotType.CHEST).ignoreSteve());
        addData(WCItems.STETSON.get(), new ClothingData(WCItems.STETSON.get()).setModelForSlot(new StetsonModel(), EquipmentSlotType.HEAD).ignoreSteve().setModeller(Modeller.JAMIE));
        addData(WCItems.ASTRAKHAN.get(), new ClothingData(WCItems.ASTRAKHAN.get()).setModelForSlot(new FirstHatModel(), EquipmentSlotType.HEAD).ignoreSteve());
        addData(WCItems.STRAW_HAT.get(), new ClothingData(WCItems.STRAW_HAT.get()).setModelForSlot(new StrawHatModel(), EquipmentSlotType.HEAD).ignoreSteve());
        addData(WCItems.RAINBOW_SCARF.get(), new ClothingData(WCItems.RAINBOW_SCARF.get()).setModelForSlot(new GenericJacketModel(), EquipmentSlotType.CHEST).ignoreSteve());
        addData(WCItems.RED_SCARF.get(), new ClothingData(WCItems.RED_SCARF.get()).setModelForSlot(new GenericJacketModel(), EquipmentSlotType.CHEST).setModeller(Modeller.VIOLET).ignoreSteve());
        addData(WCItems.CELERY.get(), new ClothingData(WCItems.CELERY.get()).setModelForSlot(new StickOfCeleryModel(), EquipmentSlotType.CHEST).ignoreSteve());
        addData(WCItems.SCARF.get(), new ClothingData(WCItems.SCARF.get()).setModelForSlot(new ScarfModel(), EquipmentSlotType.CHEST).ignoreSteve());
        addData(WCItems.SATCHEL.get(), new ClothingData(WCItems.SATCHEL.get()).setModelForSlot(new SatchelModel(), EquipmentSlotType.CHEST).ignoreSteve());
        addData(WCItems.CRICKET_JACKET.get(), new ClothingData(WCItems.CRICKET_JACKET.get()).setModelForSlot(new GenericJacketModel(), EquipmentSlotType.CHEST).setModeller(Modeller.VIOLET).hideWear());
        addData(WCItems.VELVET_COAT.get(), new ClothingData(WCItems.VELVET_COAT.get()).setModelForSlot(new GenericJacketModel(), EquipmentSlotType.CHEST).setModeller(Modeller.VIOLET).hideWear());
        addData(WCItems.TENTH_COAT.get(), new ClothingData(WCItems.TENTH_COAT.get()).setModelForSlot(new GenericJacketModel(), EquipmentSlotType.CHEST).setModeller(Modeller.VIOLET).hideWear());

        addData(WCItems.SPACE_HELMET.get(), new ClothingData(WCItems.SPACE_HELMET.get(), "space_suit").setModelForSlot(new SpaceSuitModel(EquipmentSlotType.HEAD), EquipmentSlotType.HEAD).setModeller(Modeller.JAMIE).hideWear());
        addData(WCItems.SPACE_CHEST.get(), new ClothingData(WCItems.SPACE_CHEST.get(), "space_suit").setModelForSlot(new SpaceSuitModel(EquipmentSlotType.CHEST), EquipmentSlotType.CHEST).setModeller(Modeller.JAMIE).hideWear());
        addData(WCItems.SPACE_LEGS.get(), new ClothingData(WCItems.SPACE_LEGS.get(), "space_suit").setModelForSlot(new SpaceSuitModel(EquipmentSlotType.LEGS), EquipmentSlotType.LEGS).setModeller(Modeller.JAMIE).hideWear());
        addData(WCItems.SPACE_FEET.get(), new ClothingData(WCItems.SPACE_FEET.get(), "space_suit").setModelForSlot(new EmptyModel(1), EquipmentSlotType.FEET).setModeller(Modeller.JAMIE));
        addData(WCItems.SASH.get(), new ClothingData(WCItems.SASH.get()).setModelForSlot(new RassilonSashModel(), EquipmentSlotType.CHEST).setModeller(Modeller.END).ignoreSteve());
        addData(WCItems.SECOND_JACKET.get(), new ClothingData(WCItems.SECOND_JACKET.get()).setModelForSlot(new GenericJacketModel(), EquipmentSlotType.CHEST).setModeller(Modeller.VIOLET).hideWear());
        addData(WCItems.GASMASK.get(), new ClothingData(WCItems.GASMASK.get()).setModelForSlot(new GasMaskModel(), EquipmentSlotType.HEAD).setModeller(Modeller.END).ignoreSteve());

    }

    public static ClothingData getDataForItem(Item item) {
        return CLOTH_MODELS.get(item);
    }

    public static void addData(Item item, ClothingData biped) {
        CLOTH_MODELS.put(item, biped);
    }

}
