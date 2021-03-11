package me.suff.mc.wc.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import me.suff.mc.wc.util.ClientUtil;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class GenericJacketModel extends BipedModel<LivingEntity> implements LivingArmor {

    private final ModelRenderer RightArmSteve;
    private final ModelRenderer LeftArmSteve;
    private LivingEntity living;

    private final ModelRenderer Body;
    private final ModelRenderer RightArm;
    private final ModelRenderer LeftArm;
    private final ModelRenderer RightLeg;
    private final ModelRenderer LeftLeg;
    private ModelRenderer mainArmRight;
    private ModelRenderer mainArmLeft;

    public GenericJacketModel() {
        super(1);
        textureWidth = 64;
        textureHeight = 64;

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.35F, false);

        RightArm = new ModelRenderer(this);
        RightArm.setRotationPoint(-5.0F, 2.5F, 0.0F);
        RightArm.setTextureOffset(40, 32).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.3F, false);

        LeftArm = new ModelRenderer(this);
        LeftArm.setRotationPoint(5.0F, 2.5F, 0.0F);
        LeftArm.setTextureOffset(48, 48).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.3F, false);

        RightLeg = new ModelRenderer(this);
        RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        RightLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.3F, false);

        LeftLeg = new ModelRenderer(this);
        LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        LeftLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.3F, false);

        RightArmSteve = new ModelRenderer(this);
        RightArmSteve.setRotationPoint(-5.0F, 2.0F, 0.0F);
        RightArmSteve.setTextureOffset(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.3F, false);

        LeftArmSteve = new ModelRenderer(this);
        LeftArmSteve.setRotationPoint(5.0F, 2.0F, 0.0F);
        LeftArmSteve.setTextureOffset(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.3F, false);
        bipedBody = Body;

    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        updateArms(living);
        LeftArmSteve.copyModelAngles(bipedLeftArm);
        RightArmSteve.copyModelAngles(bipedRightArm);
        LeftArm.copyModelAngles(bipedLeftArm);
        RightArm.copyModelAngles(bipedRightArm);
        LeftLeg.copyModelAngles(bipedLeftLeg);
        RightLeg.copyModelAngles(bipedRightLeg);
        Body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
        mainArmLeft.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
        mainArmRight.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
        RightLeg.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
        LeftLeg.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
    }

    public void updateArms(LivingEntity livingEntity) {
        if (livingEntity instanceof AbstractClientPlayerEntity) {
            boolean isSteve = ClientUtil.isSteve(livingEntity);
            if (isSteve) {
                this.mainArmLeft = LeftArmSteve;
                this.mainArmRight = RightArmSteve;
            } else {
                this.mainArmLeft = LeftArm;
                this.mainArmRight = RightArm;
            }
        } else {
            this.mainArmLeft = LeftArmSteve;
            this.mainArmRight = RightArmSteve;
        }
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
