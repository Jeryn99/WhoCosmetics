package me.suff.mc.wc.client.models.tiles;

/* Created by Craig on 14/03/2021 */
// Made with Blockbench 3.8.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class WardrobeModel extends EntityModel {
    private final ModelRenderer Cabinet;
    private final ModelRenderer Case;
    private final ModelRenderer Feet;
    private final ModelRenderer Doors;
    public final ModelRenderer Right;
    public final ModelRenderer Left;
    private final ModelRenderer Interior;

    public WardrobeModel() {
        textureWidth = 128;
        textureHeight = 128;

        Cabinet = new ModelRenderer(this);
        Cabinet.setRotationPoint(-8.0F, 24.0F, 0.0F);


        Case = new ModelRenderer(this);
        Case.setRotationPoint(16.0F, -1.0F, -8.0F);
        Cabinet.addChild(Case);
        Case.setTextureOffset(0, 0).addBox(-24.0F, -43.0F, 0.0F, 32.0F, 2.0F, 16.0F, 0.0F, false);
        Case.setTextureOffset(75, 62).addBox(7.0F, -41.0F, 2.0F, 0.0F, 39.0F, 13.0F, 0.0F, true);
        Case.setTextureOffset(0, 37).addBox(-23.0F, -41.0F, 15.0F, 30.0F, 39.0F, 1.0F, 0.0F, false);
        Case.setTextureOffset(62, 62).addBox(-23.0F, -41.0F, 2.0F, 0.0F, 39.0F, 13.0F, 0.0F, false);
        Case.setTextureOffset(28, 77).addBox(-23.0F, -41.0F, 1.0F, 2.0F, 39.0F, 1.0F, 0.0F, true);
        Case.setTextureOffset(28, 77).addBox(5.0F, -41.0F, 1.0F, 2.0F, 39.0F, 1.0F, 0.0F, false);
        Case.setTextureOffset(0, 0).addBox(-24.0F, -2.0F, 0.0F, 32.0F, 2.0F, 16.0F, 0.0F, false);
        Case.setTextureOffset(0, 18).addBox(-23.0F, -47.0F, 1.0F, 30.0F, 4.0F, 15.0F, 0.0F, false);

        Feet = new ModelRenderer(this);
        Feet.setRotationPoint(-3.0F, 65.0F, 14.0F);
        Case.addChild(Feet);
        Feet.setTextureOffset(0, 0).addBox(-20.0F, -65.0F, -13.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        Feet.setTextureOffset(0, 0).addBox(-20.0F, -65.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        Feet.setTextureOffset(0, 0).addBox(8.0F, -65.0F, -13.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        Feet.setTextureOffset(0, 0).addBox(8.0F, -65.0F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        Doors = new ModelRenderer(this);
        Doors.setRotationPoint(0.0F, 0.0F, 0.0F);
        Cabinet.addChild(Doors);


        Right = new ModelRenderer(this);
        Right.setRotationPoint(21.0F, -25.0F, -7.0F);
        Doors.addChild(Right);
        Right.setTextureOffset(0, 3).addBox(-12.0F, 1.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Right.setTextureOffset(34, 77).addBox(-13.0F, -17.0F, 0.0F, 13.0F, 39.0F, 1.0F, 0.0F, false);

        Left = new ModelRenderer(this);
        Left.setRotationPoint(-5.0F, -25.0F, -7.0F);
        Doors.addChild(Left);
        Left.setTextureOffset(0, 3).addBox(11.0F, 1.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Left.setTextureOffset(0, 77).addBox(0.0F, -17.0F, 0.0F, 13.0F, 39.0F, 1.0F, 0.0F, false);

        Interior = new ModelRenderer(this);
        Interior.setRotationPoint(-8.0F, 24.0F, 0.0F);
        Interior.setTextureOffset(80, 0).addBox(-4.0F, -35.0F, -4.0F, 3.0F, 6.0F, 10.0F, 0.0F, false);
        Interior.setTextureOffset(80, 0).addBox(8.0F, -35.0F, -4.0F, 3.0F, 6.0F, 10.0F, 0.0F, false);
        Interior.setTextureOffset(91, 21).addBox(20.0F, -35.0F, -4.0F, 3.0F, 6.0F, 10.0F, 0.0F, false);
        Interior.setTextureOffset(80, 0).addBox(2.0F, -35.0F, -4.0F, 3.0F, 6.0F, 10.0F, 0.0F, false);
        Interior.setTextureOffset(80, 0).addBox(14.0F, -35.0F, -4.0F, 3.0F, 6.0F, 10.0F, 0.0F, false);
        Interior.setTextureOffset(62, 38).addBox(-7.0F, -34.0F, 0.0F, 30.0F, 2.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }


    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Cabinet.render(matrixStack, buffer, packedLight, packedOverlay);
        Interior.render(matrixStack, buffer, packedLight, packedOverlay);
    }
}