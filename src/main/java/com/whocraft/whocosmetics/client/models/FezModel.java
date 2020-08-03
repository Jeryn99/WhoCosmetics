package com.whocraft.whocosmetics.client.models;


import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IDyeableArmorItem;

import java.util.function.Predicate;

public class FezModel extends BipedModel {
    private final RendererModel hat_fez;
    private final RendererModel fez_hat;
    private final RendererModel tasel;

    public FezModel() {
        textureWidth = 16;
        textureHeight = 16;

        hat_fez = new RendererModel(this);
        hat_fez.setRotationPoint(0.0F, 0.0F, 0.0F);


        fez_hat = new RendererModel(this);
        fez_hat.setRotationPoint(0.25F, -8.25F, 0.5F);
        hat_fez.addChild(fez_hat);
        setRotationAngle(fez_hat, -0.384F, 0.0F, 0.0F);
        fez_hat.cubeList.add(new ModelBox(fez_hat, 0, 0, -3.75F, -3.0F, 0.75F, 3, 3, 3, 0.0F, false));
        fez_hat.cubeList.add(new ModelBox(fez_hat, 0, 6, -3.25F, -3.1F, 1.25F, 2, 1, 2, 0.0F, false));

        tasel = new RendererModel(this);
        tasel.setRotationPoint(-2.25F, -3.25F, 2.25F);
        fez_hat.addChild(tasel);
        tasel.cubeList.add(new ModelBox(tasel, 6, 7, -0.5F, 0.0F, -0.5F, 1, 1, 2, 0.0F, false));
        tasel.cubeList.add(new ModelBox(tasel, 0, 9, -0.5F, 0.0F, 0.75F, 1, 3, 1, 0.0F, false));
        bipedHead = hat_fez;
    }

    @Override
    public void render(LivingEntity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_) {
        IDyeableArmorItem iDyeableArmorItem = (IDyeableArmorItem) p_78088_1_.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem();
        int color = iDyeableArmorItem.getColor(p_78088_1_.getItemStackFromSlot(EquipmentSlotType.HEAD));
        float red = (float) (color >> 16 & 255) / 255.0F;
        float green = (float) (color >> 8 & 255) / 255.0F;
        float blue = (float) (color & 255) / 255.0F;
        GlStateManager.color4f(1.0F * red, 1.0F * green, 1.0F * blue, 1.0F);
        super.render(p_78088_1_, p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_);
        bipedHeadwear.isHidden = true;
    }

    public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}