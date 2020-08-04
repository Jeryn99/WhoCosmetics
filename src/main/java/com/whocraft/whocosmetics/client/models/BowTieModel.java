package com.whocraft.whocosmetics.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IDyeableArmorItem;

public class BowTieModel extends BipedModel {
    private final RendererModel bowties;
    private final RendererModel bowtie;
    private final RendererModel angle2;
    private final RendererModel angle;

    public BowTieModel() {
        textureWidth = 16;
        textureHeight = 16;

        bowties = new RendererModel(this);
        bowties.setRotationPoint(0.0F, 0.0F, 0.0F);


        bowtie = new RendererModel(this);
        bowtie.setRotationPoint(0.0F, 23.5F, 0.0F);
        bowties.addChild(bowtie);
        bowtie.cubeList.add(new ModelBox(bowtie, 0, 0, -2.5F, -23.0F, -2.75F, 5, 1, 1, 0.0F, false));
        bowtie.cubeList.add(new ModelBox(bowtie, 0, 0, -2.5F, -23.0F, -2.5F, 5, 1, 1, 0.0F, false));
        bowtie.cubeList.add(new ModelBox(bowtie, 7, 3, -0.5F, -23.0F, -2.85F, 1, 1, 1, 0.0F, false));

        angle2 = new RendererModel(this);
        angle2.setRotationPoint(0.0F, -22.5F, -2.25F);
        bowtie.addChild(angle2);
        setRotationAngle(angle2, 0.0F, 0.0F, -0.1745F);
        angle2.cubeList.add(new ModelBox(angle2, 0, 4, -0.55F, -0.5F, -0.25F, 3, 1, 1, 0.0F, false));
        angle2.cubeList.add(new ModelBox(angle2, 0, 2, -2.45F, -0.5F, -0.25F, 3, 1, 1, 0.0F, false));

        angle = new RendererModel(this);
        angle.setRotationPoint(0.0F, -22.5F, -2.25F);
        bowtie.addChild(angle);
        setRotationAngle(angle, 0.0F, 0.0F, 0.1745F);
        angle.cubeList.add(new ModelBox(angle, 0, 6, -0.55F, -0.5F, -0.25F, 3, 1, 1, 0.0F, false));
        angle.cubeList.add(new ModelBox(angle, 7, 7, -2.45F, -0.5F, -0.25F, 3, 1, 1, 0.0F, false));
        bipedBody = bowties;
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

    public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}