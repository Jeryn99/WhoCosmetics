package com.whocraft.whocosmetics.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class StickOfCeleryModel extends BipedModel {

    private final RendererModel celery;
    private final RendererModel celery_stick;

    public StickOfCeleryModel() {
        textureWidth = 16;
        textureHeight = 16;

        celery = new RendererModel(this);
        celery.setRotationPoint(0.0F, 0.0F, 0.0F);


        celery_stick = new RendererModel(this);
        celery_stick.setRotationPoint(2.8764F, 1.6048F, -2.15F);
        celery.addChild(celery_stick);
        setRotationAngle(celery_stick, 0.0F, 0.0F, 0.1745F);
        celery_stick.cubeList.add(new ModelBox(celery_stick, 0, 0, -0.5F, 0.2F, -0.5F, 1, 3, 1, -0.25F, false));
        celery_stick.cubeList.add(new ModelBox(celery_stick, 7, 2, -0.5F, -1.3F, -0.5F, 1, 2, 1, -0.25F, false));
        celery_stick.cubeList.add(new ModelBox(celery_stick, 0, 5, -0.6F, -1.4F, -0.5F, 1, 2, 1, -0.25F, false));
        celery_stick.cubeList.add(new ModelBox(celery_stick, 4, 0, -0.4F, -1.5F, -0.5F, 1, 2, 1, -0.25F, false));
        celery_stick.cubeList.add(new ModelBox(celery_stick, 4, 6, -0.5F, -1.55F, -0.6F, 1, 2, 1, -0.25F, false));
        celery_stick.cubeList.add(new ModelBox(celery_stick, 3, 3, -0.5F, -1.45F, -0.4F, 1, 2, 1, -0.25F, false));

        bipedBody = celery;
        bipedHeadwear.isHidden = true;
        bipedLeftArm.isHidden = true;
        bipedRightArm.isHidden = true;
    }

    public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
