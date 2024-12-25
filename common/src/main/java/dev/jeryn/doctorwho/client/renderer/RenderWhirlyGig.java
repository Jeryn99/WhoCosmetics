package dev.jeryn.doctorwho.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import dev.jeryn.doctorwho.DoctorWhoDeco;
import dev.jeryn.doctorwho.client.models.ModelRegistration;
import dev.jeryn.doctorwho.client.models.block.WhirlyGigModel;
import dev.jeryn.doctorwho.common.blockentity.WhirlygigBlockEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class RenderWhirlyGig implements BlockEntityRenderer<WhirlygigBlockEntity>, BlockEntityRendererProvider<WhirlygigBlockEntity> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(DoctorWhoDeco.MOD_ID, "textures/block/whirlygig.png");
    private static final ResourceLocation TEXTURE_GLOW = new ResourceLocation(DoctorWhoDeco.MOD_ID, "textures/block/whirlygig_glow.png");
    private final WhirlyGigModel whirlyGigModel;

    public RenderWhirlyGig(Context context) {
        whirlyGigModel = new WhirlyGigModel(context.bakeLayer(ModelRegistration.WHIRLYGIG));
    }

    @Override
    public void render(WhirlygigBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        poseStack.pushPose();
        poseStack.translate(0.5D, 1.5, 0.5D);
        poseStack.mulPose(Axis.ZP.rotationDegrees(180));
      //  poseStack.mulPose(Axis.YP.rotationDegrees(blockstate.getValue(FacingEntityBlock.ROTATION).floatValue() * 22.5F));
        whirlyGigModel.renderToBuffer(blockEntity, poseStack, bufferSource.getBuffer(RenderType.entityTranslucent(TEXTURE)), packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);

        poseStack.pushPose();
        whirlyGigModel.renderToBuffer(blockEntity, poseStack, bufferSource.getBuffer(RenderType.entityTranslucentEmissive(TEXTURE_GLOW)), 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1F);
        poseStack.popPose();

        poseStack.popPose();
    }


    @Override
    public BlockEntityRenderer<WhirlygigBlockEntity> create(Context context) {
        return new RenderWhirlyGig(context);
    }
}
