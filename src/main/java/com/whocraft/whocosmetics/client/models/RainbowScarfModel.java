package com.whocraft.whocosmetics.client.models;


import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class RainbowScarfModel extends BipedModel<LivingEntity> {
    private final ModelRenderer scarf;
    private final ModelRenderer fourth_scarf;

    public RainbowScarfModel() {
        super(0);
        textureWidth = 64;
        textureHeight = 64;

        scarf = new ModelRenderer(this);
        scarf.setRotationPoint(0.0F, 0.0F, 0.0F);


        fourth_scarf = new ModelRenderer(this);
        fourth_scarf.setRotationPoint(-1.5F, 10.5F, -3.5F);
        scarf.addChild(fourth_scarf);
        fourth_scarf.setTextureOffset(0, 0).addBox(-2.75F, -10.75F, 0.5F, 3.0F, 24.0F, 1.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(16, 16).addBox(-2.25F, -10.5F, 0.25F, 2.0F, 12.0F, 1.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(22, 22).addBox(3.25F, -10.5F, 0.25F, 2.0F, 10.0F, 1.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(8, 8).addBox(2.75F, -10.75F, 0.5F, 3.0F, 21.0F, 1.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(8, 0).addBox(-2.5F, -10.5F, 5.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(16, 9).addBox(-2.75F, -10.75F, 1.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(15, 3).addBox(3.75F, -10.75F, 1.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);
        fourth_scarf.setTextureOffset(22, 15).addBox(-1.0F, -2.0F, 0.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);     bipedBody = scarf;
        bipedHeadwear.showModel = false;
        bipedLeftArm.showModel = false;
        bipedRightArm.showModel = false;
    }

}