package com.whocraft.whocosmetics.client.models;


import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.LivingEntity;

public class RainbowScarfModel extends BipedModel<LivingEntity> {
    private final RendererModel scarf;
    private final RendererModel fourth_scarf;

    public RainbowScarfModel() {
        textureWidth = 64;
        textureHeight = 64;

        scarf = new RendererModel(this);
        scarf.setRotationPoint(0.0F, 0.0F, 0.0F);

        fourth_scarf = new RendererModel(this);
        fourth_scarf.setRotationPoint(-1.5F, 10.5F, -3.5F);
        scarf.addChild(fourth_scarf);
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 0, 0, -2.75F, -10.75F, 0.5F, 3, 24, 1, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 16, 16, -2.25F, -10.5F, 0.25F, 2, 12, 1, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 22, 22, 3.25F, -10.5F, 0.25F, 2, 10, 1, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 8, 8, 2.75F, -10.75F, 0.5F, 3, 21, 1, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 8, 0, -2.5F, -10.5F, 5.0F, 8, 2, 1, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 16, 9, -2.75F, -10.75F, 1.5F, 2, 2, 4, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 15, 3, 3.75F, -10.75F, 1.5F, 2, 2, 4, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 22, 15, -1.0F, -2.0F, 0.0F, 5, 2, 1, 0.0F, false));
        bipedBody = scarf;
        bipedHeadwear.isHidden = true;
        bipedLeftArm.isHidden = true;
        bipedRightArm.isHidden = true;
    }

}