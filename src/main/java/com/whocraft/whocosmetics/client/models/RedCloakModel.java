package com.whocraft.whocosmetics.client.models;

import com.whocraft.whocosmetics.client.models.BipedArmSupport;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.LivingEntity;

public class RedCloakModel extends BipedArmSupport {
    private final RendererModel main_torso;
    private final RendererModel body;
    private final RendererModel leg_skirt;
    private final RendererModel right_arm_alex;
    private final RendererModel right;
    private final RendererModel left_arm_alex;
    private final RendererModel left;

    private final RendererModel right_arm_steve;
    private final RendererModel steve_right;
    private final RendererModel left_arm_steve;
    private final RendererModel steve_left;


    public RedCloakModel() {
        textureWidth = 64;
        textureHeight = 64;

        main_torso = new RendererModel(this);
        main_torso.setRotationPoint(0.0F, 0.0F, 0.0F);


        body = new RendererModel(this);
        body.setRotationPoint(-0.5F, 24.75F, -0.5F);
        main_torso.addChild(body);
        body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -25.0F, 2.0F, 7, 12, 1, 0.0F, false));
        body.cubeList.add(new ModelBox(body, 6, 22, -4.0F, -25.0F, 1.0F, 1, 12, 2, 0.0F, false));
        body.cubeList.add(new ModelBox(body, 0, 22, 4.0F, -25.0F, 1.0F, 1, 12, 2, 0.0F, false));

        leg_skirt = new RendererModel(this);
        leg_skirt.setRotationPoint(-0.25F, 11.75F, 2.5F);
        main_torso.addChild(leg_skirt);
        leg_skirt.cubeList.add(new ModelBox(leg_skirt, 0, 13, -3.25F, 0.0F, -1.0F, 7, 8, 1, 0.0F, false));
        leg_skirt.cubeList.add(new ModelBox(leg_skirt, 32, 32, 3.75F, 0.0F, -2.0F, 1, 8, 2, 0.0F, false));
        leg_skirt.cubeList.add(new ModelBox(leg_skirt, 18, 29, -4.25F, 0.0F, -2.0F, 1, 8, 2, 0.0F, false));

        right_arm_alex = new RendererModel(this);
        right_arm_alex.setRotationPoint(-5.0F, 2.5F, 0.0F);


        right = new RendererModel(this);
        right.setRotationPoint(4.5F, 22.25F, -0.5F);
        right_arm_alex.addChild(right);
        right.cubeList.add(new ModelBox(right, 12, 29, -6.0F, -24.0F, 2.0F, 2, 9, 1, 0.0F, false));
        right.cubeList.add(new ModelBox(right, 16, 0, -7.0F, -24.0F, -1.0F, 1, 9, 4, 0.0F, false));
        right.cubeList.add(new ModelBox(right, 22, 14, -7.0F, -25.0F, -1.0F, 3, 1, 4, 0.0F, false));

        left_arm_alex = new RendererModel(this);
        left_arm_alex.setRotationPoint(5.0F, 2.5F, 0.0F);


        left = new RendererModel(this);
        left.setRotationPoint(-4.5F, 22.25F, -0.5F);
        left_arm_alex.addChild(left);
        left.cubeList.add(new ModelBox(left, 16, 16, 6.0F, -24.0F, -1.0F, 1, 9, 4, 0.0F, false));
        left.cubeList.add(new ModelBox(left, 26, 26, 4.0F, -24.0F, 2.0F, 2, 9, 1, 0.0F, false));
        left.cubeList.add(new ModelBox(left, 22, 9, 4.0F, -25.0F, -1.0F, 3, 1, 4, 0.0F, false));


        right_arm_steve = new RendererModel(this);
        right_arm_steve.setRotationPoint(-5.0F, 2.5F, 0.0F);


        steve_right = new RendererModel(this);
        steve_right.setRotationPoint(4.5F, 22.25F, -0.5F);
        right_arm_steve.addChild(steve_right);
        steve_right.cubeList.add(new ModelBox(steve_right, 12, 29, -7.0F, -24.0F, 2.0F, 3, 9, 1, 0.0F, false));
        steve_right.cubeList.add(new ModelBox(steve_right, 16, 0, -8.0F, -24.0F, -1.0F, 1, 9, 4, 0.0F, false));
        steve_right.cubeList.add(new ModelBox(steve_right, 22, 14, -8.0F, -25.0F, -1.0F, 4, 1, 4, 0.0F, false));

        left_arm_steve = new RendererModel(this);
        left_arm_steve.setRotationPoint(5.0F, 2.5F, 0.0F);


        steve_left = new RendererModel(this);
        steve_left.setRotationPoint(-4.5F, 22.25F, -0.5F);
        left_arm_steve.addChild(steve_left);
        steve_left.cubeList.add(new ModelBox(steve_left, 16, 16, 7.0F, -24.0F, -1.0F, 1, 9, 4, 0.0F, false));
        steve_left.cubeList.add(new ModelBox(steve_left, 26, 26, 4.0F, -24.0F, 2.0F, 3, 9, 1, 0.0F, false));
        steve_left.cubeList.add(new ModelBox(steve_left, 22, 9, 4.0F, -25.0F, -1.0F, 4, 1, 4, 0.0F, false));

        bipedBody = main_torso;

        //Alex
        rightAlexArm = right_arm_alex;
        leftAlexArm = left_arm_alex;

        //Steve
        rightArmSteve = right_arm_steve;
        leftArmSteve = left_arm_steve;

    }

}