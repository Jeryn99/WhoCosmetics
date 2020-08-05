package com.whocraft.whocosmetics.client;

import com.whocraft.whocosmetics.Modeller;
import com.whocraft.whocosmetics.WhoCosmetics;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ClothingData {

    private final Item item;
    private BipedModel head, chest, legs, feet;
    private ResourceLocation modelTexture = null;
    private Modeller modeller = Modeller.END;

    public ClothingData(Item item) {
        this.item = item;
        this.modelTexture = new ResourceLocation(WhoCosmetics.MODID, "textures/entity/armor/"+item.getRegistryName().getPath()+".png");
    }

    public ClothingData setModeller(Modeller modeller){
        this.modeller = modeller;
        return this;
    }

    public Modeller getModeller() {
        return modeller;
    }

    public ClothingData setModelForSlot(BipedModel model, EquipmentSlotType type) {
        switch (type) {
            case HEAD:
                head = model;
                break;
            case CHEST:
                chest = model;
                break;
            case LEGS:
                legs = model;
                break;
            case FEET:
                feet = model;
            case MAINHAND:
            case OFFHAND:
                break;
        }
        return this;
    }

    public BipedModel getModel(EquipmentSlotType equipmentSlotType) {
        switch (equipmentSlotType) {
            case HEAD:
                return head;
            case CHEST:
                return chest;
            case LEGS:
                return legs;
            case FEET:
                return feet;
            case MAINHAND:
            case OFFHAND:
                return null;
        }
        return null;
    }

    public Item getItem() {
        return item;
    }

    public ResourceLocation getModelTexture() {
        return modelTexture;
    }

}
