package me.craig.software.cosmetics.client.models;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;


public class RassilonSashModel<T extends Entity> extends EntityModel<T> {
    private final ModelPart sash;

    public RassilonSashModel(ModelPart root) {
        this.sash = root.getChild("sash");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition sash = partdefinition.addOrReplaceChild("sash", CubeListBuilder.create().texOffs(23, 0).addBox(-0.2775F, 6.5517F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 21).addBox(-1.7416F, 6.5517F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition fourth_scarf = sash.addOrReplaceChild("fourth_scarf", CubeListBuilder.create().texOffs(23, 10).addBox(3.5F, -10.5F, 5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 8).addBox(-1.5F, -10.5F, 5.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
                .texOffs(19, 19).addBox(3.5F, -10.5F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 15).addBox(0.5F, -10.5F, 5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 22).addBox(-2.5F, -10.5F, 5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 20).addBox(-2.5F, -10.5F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 25).addBox(-2.75F, -10.75F, 1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(23, 23).addBox(-2.75F, -10.75F, 4.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(6, 23).addBox(-2.75F, -10.75F, 3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 24).addBox(3.75F, -10.75F, 1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(22, 7).addBox(3.75F, -10.75F, 4.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(17, 22).addBox(3.75F, -10.75F, 3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 11).addBox(3.85F, -10.85F, 2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F))
                .texOffs(8, 0).addBox(-2.85F, -10.85F, 2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offset(-1.5F, 10.5F, -3.5F));

        PartDefinition bends = fourth_scarf.addOrReplaceChild("bends", CubeListBuilder.create(), PartPose.offset(1.5F, 13.5F, 3.5F));

        PartDefinition bone4 = bends.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(24, 5).addBox(-1.0392F, -1.6321F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0744F, -16.5153F, -2.0F, 0.0F, 0.0F, 0.5236F));

        PartDefinition bone3 = bends.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(24, 18).addBox(-1.1062F, -1.716F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0744F, -16.5153F, -2.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition bone2 = bends.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(23, 26).addBox(4.3442F, -2.9583F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(25, 3).addBox(4.3442F, -1.3083F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(18, 25).addBox(4.3442F, 0.3917F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 15).addBox(4.3442F, -2.9583F, -3.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-3.0F, -22.0F, 0.5F, 0.0F, 0.0F, 0.4363F));

        PartDefinition bone = bends.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(26, 16).addBox(-0.9063F, -0.4226F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(6, 26).addBox(-0.9063F, 1.2274F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(25, 14).addBox(-0.9063F, 2.9274F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(6, 16).addBox(-0.9063F, -0.4226F, -3.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-3.0F, -22.0F, 0.5F, 0.0F, 0.0F, -0.4363F));

        PartDefinition bone5 = sash.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(18, 13).addBox(-1.5F, -15.9483F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(17, 4).addBox(-1.5F, -12.9483F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(15, 11).addBox(-1.5F, -9.9483F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(15, 0).addBox(-1.5F, -5.4483F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(18, 2).addBox(-1.5F, -14.4483F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 18).addBox(-1.5F, -11.4483F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 5).addBox(-1.5F, -6.9483F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 16).addBox(-1.5F, -8.4483F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(15, 6).addBox(-1.5F, -3.9483F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-1.5F, -17.4483F, -2.5F, 3.0F, 14.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        sash.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}