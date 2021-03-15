package me.suff.mc.wc.client.models.tiles;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class HatstandModel extends EntityModel< Entity > {
    private final ModelRenderer Arms;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer BrollyHolder;
    private final ModelRenderer bb_main;

    public HatstandModel() {
        textureWidth = 128;
        textureHeight = 128;

        Arms = new ModelRenderer(this);
        Arms.setRotationPoint(0.0F, 24.0F, 0.0F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        Arms.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 2.3562F, 0.0F);
        cube_r1.setTextureOffset(0, 0).addBox(0.0F, -40.0F, -7.0F, 0.0F, 40.0F, 14.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        Arms.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 3.1416F, 0.0F);
        cube_r2.setTextureOffset(0, 0).addBox(0.0F, -40.0F, -7.0F, 0.0F, 40.0F, 14.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        Arms.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, -2.3562F, 0.0F);
        cube_r3.setTextureOffset(0, 0).addBox(0.0F, -40.0F, -7.0F, 0.0F, 40.0F, 14.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        Arms.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
        cube_r4.setTextureOffset(0, 0).addBox(0.0F, -40.0F, -7.0F, 0.0F, 40.0F, 14.0F, 0.0F, false);

        BrollyHolder = new ModelRenderer(this);
        BrollyHolder.setRotationPoint(-0.5F, 24.0F, 0.5F);
        BrollyHolder.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -5.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.setTextureOffset(28, 28).addBox(-1.0F, -40.0F, -1.0F, 2.0F, 39.0F, 2.0F, 0.0F, false);
        bb_main.setTextureOffset(30, 4).addBox(-3.5F, -5.0F, -3.5F, 7.0F, 1.0F, 7.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Arms.render(matrixStack, buffer, packedLight, packedOverlay);
        BrollyHolder.render(matrixStack, buffer, packedLight, packedOverlay);
        bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}