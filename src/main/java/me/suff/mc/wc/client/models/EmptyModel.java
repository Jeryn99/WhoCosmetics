package me.suff.mc.wc.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;

/* Created by Craig on 11/03/2021 */
public class EmptyModel extends BipedModel< LivingEntity > {
    public EmptyModel(float modelSize) {
        super(modelSize);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {

    }
}
