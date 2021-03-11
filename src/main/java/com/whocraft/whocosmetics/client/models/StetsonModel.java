package com.whocraft.whocosmetics.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class StetsonModel extends BipedModel<LivingEntity> implements LivingArmor {
    private final ModelRenderer Head;

    private LivingEntity living;

    public StetsonModel() {
        super(1);
        textureWidth = 64;
        textureHeight = 64;

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        Head.setTextureOffset(0, 16).addBox(-3.0F, -2.0F, -4.0F, 8.0F, 3.0F, 8.0F, 0.6F, false);
        Head.setTextureOffset(0, 28).addBox(-3.0F, -2.0F, -4.0F, 8.0F, 3.0F, 8.0F, 0.8F, false);
        Head.setTextureOffset(0, 0).addBox(-6.0F, 0.0F, -7.0F, 14.0F, 2.0F, 14.0F, 0.0F, false);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        Head.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
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