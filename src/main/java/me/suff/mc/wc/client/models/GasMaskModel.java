package me.suff.mc.wc.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

/* Created by Craig on 15/03/2021 */
public class GasMaskModel extends BipedModel< LivingEntity >
{

    private final ModelRenderer gas_mask;
    private final ModelRenderer bipedHead_r1;

    public GasMaskModel() {
        super(1);
        textureWidth = 64;
        textureHeight = 64;

        gas_mask = new ModelRenderer(this);
        gas_mask.setRotationPoint(0.0F, 0.0F, 0.0F);
        gas_mask.setTextureOffset(24, 24).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

        bipedHead_r1 = new ModelRenderer(this);
        bipedHead_r1.setRotationPoint(0.0F, -1.0F, -5.0F);
        gas_mask.addChild(bipedHead_r1);
        setRotationAngle(bipedHead_r1, 0.3054F, 0.0F, 0.0F);
        bipedHead_r1.setTextureOffset(2, 45).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.5F, false);
        setVisible(false);
        bipedHead = gas_mask;
        bipedHead.showModel = true;
        bipedHeadwear.showModel = false;
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        gas_mask.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }


}
