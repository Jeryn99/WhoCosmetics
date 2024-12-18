package dev.jeryn.doctorwho.client.models.block;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.jeryn.doctorwho.common.blockentity.ClassicRotorBlockEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class ClassicRotorModel extends AnimateBlockEntityModel<ClassicRotorBlockEntity> {

    private final ModelPart classic_rotor;
    private final ModelPart root;
    public static final AnimationDefinition FLIGHT_LOOP = AnimationDefinition.Builder.withLength(4f).looping()
            .addAnimation("classic_rotor",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(2f, KeyframeAnimations.posVec(0f, -12f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM),
                            new Keyframe(4f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.CATMULLROM)))
            .addAnimation("inner_rotating",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(4f, KeyframeAnimations.degreeVec(0f, 180f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();

    public ClassicRotorModel(ModelPart root) {
        this.classic_rotor = root.getChild("classic_rotor");
        this.root = root;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition classic_rotor = partdefinition.addOrReplaceChild("classic_rotor", CubeListBuilder.create(), PartPose.offset(0.0F, 17.5F, 0.0F));

        PartDefinition vert_mvmnt_only = classic_rotor.addOrReplaceChild("vert_mvmnt_only", CubeListBuilder.create().texOffs(0, 42).addBox(-14.0F, -15.0F, -6.0F, 12.0F, 15.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-16.0F, -26.0F, -8.0F, 16.0F, 26.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(36, 48).addBox(-10.0F, -2.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 6.5F, 0.0F));

        PartDefinition inner_rotating = classic_rotor.addOrReplaceChild("inner_rotating", CubeListBuilder.create(), PartPose.offset(0.0F, 6.5F, 0.0F));

        PartDefinition top_rotation = inner_rotating.addOrReplaceChild("top_rotation", CubeListBuilder.create().texOffs(8, 2).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -22.5F, 0.0F));

        PartDefinition main_inner = inner_rotating.addOrReplaceChild("main_inner", CubeListBuilder.create().texOffs(0, 2).addBox(-2.0F, -13.65F, 0.0F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(48, 62).addBox(-1.0F, -10.65F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(36, 32).addBox(0.0F, -9.65F, -5.0F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(0.0F, -3.65F, -3.0F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 42).addBox(-3.0F, -3.65F, 0.0F, 6.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-3.0F, 5.35F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 12).addBox(3.0F, 5.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(12, 12).addBox(-4.0F, 5.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(48, 48).addBox(-3.0F, -3.65F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.35F, 0.0F));

        return LayerDefinition.create(meshdefinition, 96, 96);
    }


    @Override
    public ModelPart root() {
        return root;
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(ClassicRotorBlockEntity blockEntity, PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        animate(blockEntity.FLY, FLIGHT_LOOP, Minecraft.getInstance().player.tickCount);
        classic_rotor.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }


    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        classic_rotor.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }


}
