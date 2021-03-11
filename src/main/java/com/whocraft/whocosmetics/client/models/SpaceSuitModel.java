package com.whocraft.whocosmetics.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.whocraft.whocosmetics.util.ClientUtil;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

/* Created by Craig on 10/03/2021 */
public class SpaceSuitModel extends BipedModel< LivingEntity > implements LivingArmor {
    private final ModelRenderer Head;
    private final ModelRenderer Body;
    private final ModelRenderer RightArm;
    private final ModelRenderer LeftArm;
    private final ModelRenderer RightArmSteve;
    private final ModelRenderer LeftArmSteve;
    private final ModelRenderer RightLeg;
    private final ModelRenderer LeftLeg;
    private ModelRenderer mainArmRight;
    private ModelRenderer mainArmLeft;
    private EquipmentSlotType slot = EquipmentSlotType.HEAD;
    private LivingEntity livingEntity;

    public SpaceSuitModel(EquipmentSlotType equipmentSlotType) {
        super(1);
        this.slot = equipmentSlotType;
        textureWidth = 80;
        textureHeight = 80;

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        Head.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.25F, false);
        Head.setTextureOffset(0, 64).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
        Head.setTextureOffset(32, 64).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
        Head.setTextureOffset(50, 30).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 1.0F, 4.0F, 0.5F, false);
        Head.setTextureOffset(0, 0).addBox(-1.0F, -9.0F, -0.75F, 2.0F, 1.0F, 1.0F, 0.5F, false);

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
        Body.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

        RightArm = new ModelRenderer(this);
        RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        RightArm.setTextureOffset(40, 16).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);
        RightArm.setTextureOffset(40, 32).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.25F, false);

        LeftArm = new ModelRenderer(this);
        LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        LeftArm.setTextureOffset(32, 48).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);
        LeftArm.setTextureOffset(48, 48).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.25F, false);

        RightLeg = new ModelRenderer(this);
        RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        RightLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

        LeftLeg = new ModelRenderer(this);
        LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        LeftLeg.setTextureOffset(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        LeftLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

        RightArmSteve = new ModelRenderer(this);
        RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        RightArm.setTextureOffset(32, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
        RightArm.setTextureOffset(48, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, true);

        LeftArmSteve = new ModelRenderer(this);
        LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        LeftArm.setTextureOffset(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        LeftArm.setTextureOffset(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

        bipedHead = Head;
        bipedBody = Body;
        bipedLeftArm = LeftArm;
        bipedRightArm = RightArm;
        bipedRightLeg = RightLeg;
        bipedLeftLeg = LeftLeg;

    }

    public void updateArms(LivingEntity livingEntity){
        if(livingEntity instanceof AbstractClientPlayerEntity){
            boolean isSteve = ClientUtil.isSteve(livingEntity);
            if(!isSteve){
                this.mainArmLeft = LeftArm;
                this.mainArmRight = RightArm;
            } else {
                this.mainArmLeft = LeftArmSteve;
                this.mainArmRight = RightArmSteve;
            }
        } else {
            this.mainArmLeft = LeftArmSteve;
            this.mainArmRight = RightArmSteve;
        }
        bipedLeftArm = mainArmLeft;
        bipedRightArm = mainArmRight;
    }


    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        if(slot == EquipmentSlotType.HEAD) {
            Head.render(matrixStack, buffer, packedLight, packedOverlay);
        }
        if(slot == EquipmentSlotType.CHEST) {
            updateArms(getLiving());
            Body.render(matrixStack, buffer, packedLight, packedOverlay);
            mainArmRight.render(matrixStack, buffer, packedLight, packedOverlay);
            mainArmLeft.render(matrixStack, buffer, packedLight, packedOverlay);
        }
        if(slot == EquipmentSlotType.LEGS) {
            RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
            LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        }
    }

    @Override
    public void setLiving(LivingEntity entity) {
        this.livingEntity = entity;
    }

    @Override
    public LivingEntity getLiving() {
        return livingEntity;
    }
}
