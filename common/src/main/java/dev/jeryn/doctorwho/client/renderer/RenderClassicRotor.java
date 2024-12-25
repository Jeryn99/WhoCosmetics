package dev.jeryn.doctorwho.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import dev.jeryn.doctorwho.DoctorWhoDeco;
import dev.jeryn.doctorwho.client.models.ModelRegistration;
import dev.jeryn.doctorwho.client.models.block.ClassicRotorModel;
import dev.jeryn.doctorwho.common.blockentity.ClassicRotorBlockEntity;
import dev.jeryn.doctorwho.common.blocks.FacingEntityBlock;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockState;

public class RenderClassicRotor implements BlockEntityRenderer<ClassicRotorBlockEntity>, BlockEntityRendererProvider<ClassicRotorBlockEntity> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(DoctorWhoDeco.MOD_ID, "textures/block/classic_rotor.png");
    private final ClassicRotorModel classicRotorModel;

    public RenderClassicRotor(Context context) {
        classicRotorModel = new ClassicRotorModel(context.bakeLayer(ModelRegistration.CLASSIC_ROTOR));
    }

    @Override
    public void render(ClassicRotorBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        poseStack.pushPose();
        poseStack.translate(0.5D, 1.5, 0.5D);

        BlockState blockstate = blockEntity.getBlockState();
        poseStack.mulPose(Axis.ZP.rotationDegrees(180));
        poseStack.mulPose(Axis.YP.rotationDegrees(blockstate.getValue(FacingEntityBlock.ROTATION).floatValue() * 22.5F));
        classicRotorModel.renderToBuffer(blockEntity, poseStack, bufferSource.getBuffer(RenderType.entityTranslucent(TEXTURE)), packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
        poseStack.popPose();
    }


    @Override
    public BlockEntityRenderer<ClassicRotorBlockEntity> create(Context context) {
        return new RenderClassicRotor(context);
    }
}
