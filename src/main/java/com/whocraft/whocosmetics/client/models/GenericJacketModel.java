package com.whocraft.whocosmetics.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.whocraft.whocosmetics.util.ClientUtil;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class GenericJacketModel extends BipedModel<LivingEntity> implements LivingArmor {

    private final ModelRenderer Body;
    private final ModelRenderer JacketFlow;
    private final ModelRenderer RightArm;
    private final ModelRenderer LeftArm;
    private LivingEntity living;

    public GenericJacketModel() {
        super(0);
        textureWidth = 64;
        textureHeight = 64;
        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.35F, false);

        JacketFlow = new ModelRenderer(this);
        JacketFlow.setRotationPoint(0.0F, 12.0F, 2.0F);
        Body.addChild(JacketFlow);
        setRotationAngle(JacketFlow, 0.0873F, 0.0F, 0.0F);
        JacketFlow.setTextureOffset(24, 0).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 6.0F, 0.0F, 0.35F, false);

        RightArm = new ModelRenderer(this);
        RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        RightArm.setTextureOffset(0, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

        LeftArm = new ModelRenderer(this);
        LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        LeftArm.setTextureOffset(16, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

        bipedLeftArm = LeftArm;
        bipedRightArm = RightArm;
        bipedBody = Body;
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {

        if (ClientUtil.isSteve(living)) {
            bipedLeftArm.setRotationPoint(-5.0F, 1.5F, 0.0F);
            bipedRightArm.setRotationPoint(5.0F, 1.5F, 0.0F);
        } else {
            bipedLeftArm.setRotationPoint(5, 1.5F, 0);
            bipedRightArm.setRotationPoint(-5, 1.5F, 0);
        }
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
