package com.whocraft.whocosmetics.client.models;// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IDyeableArmorItem;

public class ScarfModel extends BipedModel {
    private final RendererModel first_scarf;
    private final RendererModel firsts_scarf;

    public ScarfModel() {
        textureWidth = 32;
        textureHeight = 32;

        first_scarf = new RendererModel(this);
        first_scarf.setRotationPoint(0.0F, 0.0F, 0.0F);

        firsts_scarf = new RendererModel(this);
        firsts_scarf.setRotationPoint(-1.5F, 10.5F, -3.5F);
        first_scarf.addChild(firsts_scarf);
        firsts_scarf.cubeList.add(new ModelBox(firsts_scarf, 0, 3, -2.75F, -10.75F, 0.5F, 3, 10, 1, 0.0F, false));
        firsts_scarf.cubeList.add(new ModelBox(firsts_scarf, 8, 6, -2.75F, -0.75F, 1.0F, 3, 2, 0, 0.0F, false));
        firsts_scarf.cubeList.add(new ModelBox(firsts_scarf, 8, 6, 2.75F, -2.75F, 1.0F, 3, 2, 0, 0.0F, true));
        firsts_scarf.cubeList.add(new ModelBox(firsts_scarf, 0, 20, -2.25F, -10.5F, 0.25F, 2, 7, 1, 0.0F, false));
        firsts_scarf.cubeList.add(new ModelBox(firsts_scarf, 19, 5, 3.25F, -10.5F, 0.25F, 2, 6, 1, 0.0F, false));
        firsts_scarf.cubeList.add(new ModelBox(firsts_scarf, 12, 14, 2.75F, -10.75F, 0.5F, 3, 8, 1, 0.0F, false));
        firsts_scarf.cubeList.add(new ModelBox(firsts_scarf, 0, 0, -2.5F, -10.5F, 5.0F, 8, 2, 1, 0.0F, false));
        firsts_scarf.cubeList.add(new ModelBox(firsts_scarf, 0, 14, -2.75F, -10.75F, 1.5F, 2, 2, 4, 0.0F, false));
        firsts_scarf.cubeList.add(new ModelBox(firsts_scarf, 8, 8, 3.75F, -10.75F, 1.5F, 2, 2, 4, 0.0F, false));
        firsts_scarf.cubeList.add(new ModelBox(firsts_scarf, 8, 3, -1.0F, -6.0F, 0.0F, 5, 2, 1, 0.0F, false));
        bipedBody = first_scarf;
    }

    @Override
    public void render(LivingEntity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_) {
        IDyeableArmorItem iDyeableArmorItem = (IDyeableArmorItem) p_78088_1_.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem();
        int color = iDyeableArmorItem.getColor(p_78088_1_.getItemStackFromSlot(EquipmentSlotType.CHEST));
        float red = (float) (color >> 16 & 255) / 255.0F;
        float green = (float) (color >> 8 & 255) / 255.0F;
        float blue = (float) (color & 255) / 255.0F;
        GlStateManager.color4f(1.0F * red, 1.0F * green, 1.0F * blue, 1.0F);
        super.render(p_78088_1_, p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_);
        bipedHeadwear.isHidden = true;
        bipedLeftArm.isHidden = true;
        bipedRightArm.isHidden = true;
    }
}