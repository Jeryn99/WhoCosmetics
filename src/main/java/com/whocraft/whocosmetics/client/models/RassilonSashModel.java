package com.whocraft.whocosmetics.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.LivingEntity;

public class RassilonSashModel extends BipedModel<LivingEntity>  {
    private final RendererModel sash;
    private final RendererModel fourth_scarf;
    private final RendererModel bends;
    private final RendererModel bone4;
    private final RendererModel bone3;
    private final RendererModel bone2;
    private final RendererModel bone;
    private final RendererModel bone5;

    public RassilonSashModel() {
        textureWidth = 32;
        textureHeight = 32;

        sash = new RendererModel(this);
        sash.setRotationPoint(0.0F, 0.0F, 0.0F);
        sash.cubeList.add(new ModelBox(sash, 23, 0, -0.2775F, 6.5517F, -2.5F, 2, 1, 1, 0.0F, false));
        sash.cubeList.add(new ModelBox(sash, 24, 21, -1.7416F, 6.5517F, -2.5F, 2, 1, 1, 0.0F, false));

        fourth_scarf = new RendererModel(this);
        fourth_scarf.setRotationPoint(-1.5F, 10.5F, -3.5F);
        sash.addChild(fourth_scarf);
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 23, 10, 3.5F, -10.5F, 5.0F, 2, 2, 1, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 8, 8, -1.5F, -10.5F, 5.0F, 6, 2, 1, -0.25F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 19, 19, 3.5F, -10.5F, 1.0F, 2, 2, 1, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 20, 15, 0.5F, -10.5F, 5.0F, 2, 2, 1, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 0, 22, -2.5F, -10.5F, 5.0F, 2, 2, 1, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 12, 20, -2.5F, -10.5F, 1.0F, 2, 2, 1, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 0, 25, -2.75F, -10.75F, 1.5F, 2, 2, 1, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 23, 23, -2.75F, -10.75F, 4.5F, 2, 2, 1, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 6, 23, -2.75F, -10.75F, 3.0F, 2, 2, 1, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 12, 24, 3.75F, -10.75F, 1.5F, 2, 2, 1, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 22, 7, 3.75F, -10.75F, 4.5F, 2, 2, 1, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 17, 22, 3.75F, -10.75F, 3.0F, 2, 2, 1, 0.0F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 8, 11, 3.85F, -10.85F, 2.0F, 2, 2, 3, -0.25F, false));
        fourth_scarf.cubeList.add(new ModelBox(fourth_scarf, 8, 0, -2.85F, -10.85F, 2.0F, 2, 2, 3, -0.25F, false));

        bends = new RendererModel(this);
        bends.setRotationPoint(1.5F, 13.5F, 3.5F);
        fourth_scarf.addChild(bends);


        bone4 = new RendererModel(this);
        bone4.setRotationPoint(0.0744F, -16.5153F, -2.0F);
        bends.addChild(bone4);
        setRotationAngle(bone4, 0.0F, 0.0F, 0.5236F);
        bone4.cubeList.add(new ModelBox(bone4, 24, 5, -1.0392F, -1.6321F, -0.5F, 2, 1, 1, 0.0F, false));

        bone3 = new RendererModel(this);
        bone3.setRotationPoint(0.0744F, -16.5153F, -2.0F);
        bends.addChild(bone3);
        setRotationAngle(bone3, 0.0F, 0.0F, -0.5236F);
        bone3.cubeList.add(new ModelBox(bone3, 24, 18, -1.1062F, -1.716F, -0.5F, 2, 1, 1, 0.0F, false));

        bone2 = new RendererModel(this);
        bone2.setRotationPoint(-3.0F, -22.0F, 0.5F);
        bends.addChild(bone2);
        setRotationAngle(bone2, 0.0F, 0.0F, 0.4363F);
        bone2.cubeList.add(new ModelBox(bone2, 23, 26, 4.3442F, -2.9583F, -3.0F, 2, 1, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 25, 3, 4.3442F, -1.3083F, -3.0F, 2, 1, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 18, 25, 4.3442F, 0.3917F, -3.0F, 2, 1, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 15, 4.3442F, -2.9583F, -3.0F, 2, 6, 1, -0.25F, false));

        bone = new RendererModel(this);
        bone.setRotationPoint(-3.0F, -22.0F, 0.5F);
        bends.addChild(bone);
        setRotationAngle(bone, 0.0F, 0.0F, -0.4363F);
        bone.cubeList.add(new ModelBox(bone, 26, 16, -0.9063F, -0.4226F, -3.0F, 2, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 6, 26, -0.9063F, 1.2274F, -3.0F, 2, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 25, 14, -0.9063F, 2.9274F, -3.0F, 2, 1, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 6, 16, -0.9063F, -0.4226F, -3.0F, 2, 6, 1, -0.25F, false));

        bone5 = new RendererModel(this);
        bone5.setRotationPoint(0.0F, 24.0F, 0.0F);
        sash.addChild(bone5);
        bone5.cubeList.add(new ModelBox(bone5, 18, 13, -1.5F, -15.9483F, -2.5F, 3, 1, 1, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 17, 4, -1.5F, -12.9483F, -2.5F, 3, 1, 1, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 15, 11, -1.5F, -9.9483F, -2.5F, 3, 1, 1, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 15, 0, -1.5F, -5.4483F, -2.5F, 3, 1, 1, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 18, 2, -1.5F, -14.4483F, -2.5F, 3, 1, 1, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 12, 18, -1.5F, -11.4483F, -2.5F, 3, 1, 1, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 8, 5, -1.5F, -6.9483F, -2.5F, 3, 1, 1, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 12, 16, -1.5F, -8.4483F, -2.5F, 3, 1, 1, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 15, 6, -1.5F, -3.9483F, -2.5F, 3, 1, 1, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, -1.5F, -17.4483F, -2.5F, 3, 14, 1, -0.25F, false));

        bipedBody = sash;
        bipedLeftArm.isHidden = true;
        bipedRightArm.isHidden = true;
    }

    @Override
    public void render(LivingEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    }

    public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}