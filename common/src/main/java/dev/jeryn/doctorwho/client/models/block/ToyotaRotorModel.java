package dev.jeryn.doctorwho.client.models.block;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.jeryn.doctorwho.common.blockentity.ToyotaRotorBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class ToyotaRotorModel extends AnimateBlockEntityModel<ToyotaRotorBlockEntity> {

    private final ModelPart root;


    public static final AnimationDefinition FLIGHT_LOOP = AnimationDefinition.Builder.withLength(2f).looping()
            .addAnimation("vertical_movement",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(1f, KeyframeAnimations.posVec(0f, 7.075000000000001f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(2f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM))).build();

    private final ModelPart casing;
    private final ModelPart vertical_movement;
    private final ModelPart lights;
    private final ModelPart light_brackets;

    public ToyotaRotorModel(ModelPart root) {
        this.root = root;
        this.casing = root.getChild("casing");
        this.vertical_movement = root.getChild("vertical_movement");
        this.lights = root.getChild("lights");
        this.light_brackets = root.getChild("light_brackets");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition casing = partdefinition.addOrReplaceChild("casing", CubeListBuilder.create().texOffs(48, 0).addBox(-8.0F, -48.0F, -8.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(42, 54).addBox(-6.0F, -46.0F, -6.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-6.0F, -44.0F, -6.0F, 12.0F, 32.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 54).addBox(-7.0F, -12.0F, -7.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(0, 70).addBox(-7.0F, -12.0F, -7.0F, 14.0F, 3.0F, 14.0F, new CubeDeformation(-0.2F))
                .texOffs(32, 28).addBox(-8.0F, -10.0F, -8.0F, 16.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition vertical_movement = partdefinition.addOrReplaceChild("vertical_movement", CubeListBuilder.create().texOffs(49, 19).addBox(-0.5F, 6.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -11.0F, 0.0F));

        PartDefinition spire_rotor_r1 = vertical_movement.addOrReplaceChild("spire_rotor_r1", CubeListBuilder.create().texOffs(8, 44).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition lights = partdefinition.addOrReplaceChild("lights", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition lights_inner = lights.addOrReplaceChild("lights_inner", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, 0.0F));

        PartDefinition nrthwst_r1 = lights_inner.addOrReplaceChild("nrthwst_r1", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -8.5F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0F, -27.5F, -3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition sthwst_r1 = lights_inner.addOrReplaceChild("sthwst_r1", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -8.5F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0F, -27.5F, 3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition sthest_r1 = lights_inner.addOrReplaceChild("sthest_r1", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -8.5F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.0F, -27.5F, 3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition nrthest_r1 = lights_inner.addOrReplaceChild("nrthest_r1", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -8.5F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.0F, -27.5F, -3.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition lights_outer = lights.addOrReplaceChild("lights_outer", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition sthwst_r2 = lights_outer.addOrReplaceChild("sthwst_r2", CubeListBuilder.create().texOffs(88, 21).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(3.0F, -28.0F, 3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition nrthwst_r2 = lights_outer.addOrReplaceChild("nrthwst_r2", CubeListBuilder.create().texOffs(88, 21).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(3.0F, -28.0F, -3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition nrthest_r2 = lights_outer.addOrReplaceChild("nrthest_r2", CubeListBuilder.create().texOffs(88, 21).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-3.0F, -28.0F, -3.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition sthest_r2 = lights_outer.addOrReplaceChild("sthest_r2", CubeListBuilder.create().texOffs(88, 21).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-3.0F, -28.0F, 3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition light_brackets = partdefinition.addOrReplaceChild("light_brackets", CubeListBuilder.create().texOffs(49, 19).addBox(-0.5F, -28.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition lower_spire_r1 = light_brackets.addOrReplaceChild("lower_spire_r1", CubeListBuilder.create().texOffs(36, 0).addBox(-1.5F, -21.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(16, 44).addBox(-1.0F, -27.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-1.5F, -44.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition upper = light_brackets.addOrReplaceChild("upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition nthwst_upper_r1 = upper.addOrReplaceChild("nthwst_upper_r1", CubeListBuilder.create().texOffs(48, 0).addBox(-1.5F, -16.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -28.0F, -3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition sthwst_upper_r1 = upper.addOrReplaceChild("sthwst_upper_r1", CubeListBuilder.create().texOffs(48, 0).addBox(-1.5F, -16.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -28.0F, 3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition sthest_upper_r1 = upper.addOrReplaceChild("sthest_upper_r1", CubeListBuilder.create().texOffs(48, 0).addBox(-1.5F, -16.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -28.0F, 3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition nthest_upper_r1 = upper.addOrReplaceChild("nthest_upper_r1", CubeListBuilder.create().texOffs(48, 0).addBox(-1.5F, -16.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -28.0F, -3.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition lower = light_brackets.addOrReplaceChild("lower", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition nthwst_lower_r1 = lower.addOrReplaceChild("nthwst_lower_r1", CubeListBuilder.create().texOffs(42, 54).addBox(-1.5F, 8.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -28.0F, -3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition sthwst_lower_r1 = lower.addOrReplaceChild("sthwst_lower_r1", CubeListBuilder.create().texOffs(42, 54).addBox(-1.5F, 8.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -28.0F, 3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition sthest_lower_r1 = lower.addOrReplaceChild("sthest_lower_r1", CubeListBuilder.create().texOffs(42, 54).addBox(-1.5F, 8.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -28.0F, 3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition nthest_lower_r1 = lower.addOrReplaceChild("nthest_lower_r1", CubeListBuilder.create().texOffs(42, 54).addBox(-1.5F, 8.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -28.0F, -3.0F, 0.0F, -0.7854F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }


    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        casing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        vertical_movement.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        lights.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        light_brackets.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart root() {
        return root;
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(ToyotaRotorBlockEntity blockEntity, PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        animate(blockEntity.FLY, FLIGHT_LOOP, Minecraft.getInstance().player.tickCount);


        casing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        vertical_movement.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        lights.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        light_brackets.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
