package com.whocraft.whocosmetics.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class StickOfCeleryModel extends BipedModel<LivingEntity> {

    private final ModelRenderer celery;
    private final ModelRenderer celery_stick;

    public StickOfCeleryModel() {
        super(0);
        textureWidth = 16;
        textureHeight = 16;

        celery = new ModelRenderer(this);
        celery.setRotationPoint(0.0F, 0.0F, 0.0F);


        celery_stick = new ModelRenderer(this);
        celery_stick.setRotationPoint(2.8764F, 1.6048F, -2.15F);
        celery.addChild(celery_stick);
        setRotationAngle(celery_stick, 0.0F, 0.0F, 0.1745F);
        celery_stick.setTextureOffset(0, 0).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 3.0F, 1.0F, -0.25F, false);
        celery_stick.setTextureOffset(7, 2).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, -0.25F, false);
        celery_stick.setTextureOffset(0, 5).addBox(-0.6F, -1.4F, -0.5F, 1.0F, 2.0F, 1.0F, -0.25F, false);
        celery_stick.setTextureOffset(4, 0).addBox(-0.4F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, -0.25F, false);
        celery_stick.setTextureOffset(4, 6).addBox(-0.5F, -1.55F, -0.6F, 1.0F, 2.0F, 1.0F, -0.25F, false);
        celery_stick.setTextureOffset(3, 3).addBox(-0.5F, -1.45F, -0.4F, 1.0F, 2.0F, 1.0F, -0.25F, false);

        bipedBody = celery;
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
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

}
