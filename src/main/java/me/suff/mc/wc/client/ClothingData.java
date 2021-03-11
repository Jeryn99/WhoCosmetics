package me.suff.mc.wc.client;

import me.suff.mc.wc.Modeller;
import me.suff.mc.wc.WhoCosmetics;
import me.suff.mc.wc.util.ClientUtil;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ClothingData {

    private final Item item;
    private final ResourceLocation modelSteveTexture;
    private BipedModel< LivingEntity > head, chest, legs, feet;
    private ResourceLocation modelTexture = null;
    private Modeller modeller = Modeller.END;
    private boolean hideWear = false;
    private boolean ignoreSteveSupport = false;

    public ClothingData(Item item) {
        this.item = item;
        this.modelTexture = new ResourceLocation(WhoCosmetics.MODID, "textures/entity/armor/" + item.getRegistryName().getPath() + ".png");
        this.modelSteveTexture = new ResourceLocation(WhoCosmetics.MODID, "textures/entity/armor/" + item.getRegistryName().getPath() + "_steve.png");
    }

    public ClothingData(Item item, String texture) {
        this.item = item;
        this.modelTexture = new ResourceLocation(WhoCosmetics.MODID, "textures/entity/armor/" + texture + ".png");
        this.modelSteveTexture = new ResourceLocation(WhoCosmetics.MODID, "textures/entity/armor/" + texture + "_steve.png");
    }

    public ClothingData ignoreSteve() {
        this.ignoreSteveSupport = true;
        return this;
    }

    public ClothingData hideWear() {
        this.hideWear = true;
        return this;
    }

    public boolean isHideWear() {
        return hideWear;
    }

    public ClothingData setModeller(Modeller modeller) {
        this.modeller = modeller;
        return this;
    }

    public Modeller getModeller() {
        return modeller;
    }


    public ClothingData setModelForSlot(BipedModel< LivingEntity > model, EquipmentSlotType type) {
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

    public BipedModel< LivingEntity > getModel(EquipmentSlotType equipmentSlotType) {
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

    public ResourceLocation getModelTexture(Entity livingEntity) {
        if(ignoreSteveSupport){
            return modelTexture;
        }
        if (livingEntity instanceof AbstractClientPlayerEntity) {
            AbstractClientPlayerEntity playerEntity = (AbstractClientPlayerEntity) livingEntity;
            boolean isSteve = ClientUtil.isSteve(playerEntity);
            return isSteve ? modelSteveTexture : modelTexture;
        }
        return modelSteveTexture;
    }

}
