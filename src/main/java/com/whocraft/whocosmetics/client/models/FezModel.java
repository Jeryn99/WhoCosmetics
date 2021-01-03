package com.whocraft.whocosmetics.client.models;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IDyeableArmorItem;


public class FezModel extends BipedModel<LivingEntity> implements IClothingModel {
    private final ModelRenderer hat_fez;
    private final ModelRenderer fez_hat;
    private final ModelRenderer tasel;
    private LivingEntity living = Minecraft.getInstance().player;


    public FezModel() {
        super(0);
        textureWidth = 16;
        textureHeight = 16;

        hat_fez = new ModelRenderer(this);
        hat_fez.setRotationPoint(0.0F, 0.0F, 0.0F);


        fez_hat = new ModelRenderer(this);
        fez_hat.setRotationPoint(0.25F, -8.25F, 0.5F);
        hat_fez.addChild(fez_hat);
        setRotationAngle(fez_hat, -0.384F, 0.0F, 0.0F);
        fez_hat.setTextureOffset(0, 0).addBox(-3.75F, -3.0F, 0.75F, 3.0F, 3.0F, 3.0F, 0.0F, false);
        fez_hat.setTextureOffset(0, 6).addBox(-3.25F, -3.1F, 1.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        tasel = new ModelRenderer(this);
        tasel.setRotationPoint(-2.25F, -3.25F, 2.25F);
        fez_hat.addChild(tasel);
        tasel.setTextureOffset(6, 7).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        tasel.setTextureOffset(0, 9).addBox(-0.5F, 0.0F, 0.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        bipedHead = hat_fez;
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        if(living.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() instanceof IDyeableArmorItem) {
            IDyeableArmorItem iDyeableArmorItem = (IDyeableArmorItem) living.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem();
            int color = iDyeableArmorItem.getColor(living.getItemStackFromSlot(EquipmentSlotType.HEAD));
            red = (float) (color >> 16 & 255) / 255.0F;
            green = (float) (color >> 8 & 255) / 255.0F;
            blue = (float) (color & 255) / 255.0F;
            bipedHeadwear.showModel = false;
            super.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        }
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
}