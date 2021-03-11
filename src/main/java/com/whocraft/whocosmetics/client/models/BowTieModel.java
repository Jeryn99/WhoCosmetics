package com.whocraft.whocosmetics.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IDyeableArmorItem;

public class BowTieModel extends BipedModel<LivingEntity> implements LivingArmor {
    private final ModelRenderer bowties;
    private final ModelRenderer bowtie;
    private final ModelRenderer angle2;
    private final ModelRenderer angle;
    private LivingEntity living;

    public BowTieModel() {
        super(0);
        textureWidth = 16;
        textureHeight = 16;

        bowties = new ModelRenderer(this);
        bowties.setRotationPoint(0.0F, 0.0F, 0.0F);


        bowtie = new ModelRenderer(this);
        bowtie.setRotationPoint(0.0F, 23.5F, 0.0F);
        bowties.addChild(bowtie);
        bowtie.setTextureOffset(0, 0).addBox(-2.5F, -23.0F, -2.75F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        bowtie.setTextureOffset(0, 0).addBox(-2.5F, -23.0F, -2.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        bowtie.setTextureOffset(7, 3).addBox(-0.5F, -23.0F, -2.85F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        angle2 = new ModelRenderer(this);
        angle2.setRotationPoint(0.0F, -22.5F, -2.25F);
        bowtie.addChild(angle2);
        setRotationAngle(angle2, 0.0F, 0.0F, -0.1745F);
        angle2.setTextureOffset(0, 4).addBox(-0.55F, -0.5F, -0.25F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        angle2.setTextureOffset(0, 2).addBox(-2.45F, -0.5F, -0.25F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        angle = new ModelRenderer(this);
        angle.setRotationPoint(0.0F, -22.5F, -2.25F);
        bowtie.addChild(angle);
        setRotationAngle(angle, 0.0F, 0.0F, 0.1745F);
        angle.setTextureOffset(0, 6).addBox(-0.55F, -0.5F, -0.25F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        angle.setTextureOffset(7, 7).addBox(-2.45F, -0.5F, -0.25F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        bipedBody = bowties;
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        IDyeableArmorItem iDyeableArmorItem = (IDyeableArmorItem) living.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem();
        int color = iDyeableArmorItem.getColor(living.getItemStackFromSlot(EquipmentSlotType.CHEST));
        red = (float) (color >> 16 & 255) / 255.0F;
        green = (float) (color >> 8 & 255) / 255.0F;
        blue = (float) (color & 255) / 255.0F;
        bipedHeadwear.showModel = false;
        bipedLeftArm.showModel = false;
        bipedRightArm.showModel = false;
        super.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLiving(LivingEntity livingEntity) {
        this.living = livingEntity;
    }

    @Override
    public LivingEntity getLiving() {
        return living;
    }
}