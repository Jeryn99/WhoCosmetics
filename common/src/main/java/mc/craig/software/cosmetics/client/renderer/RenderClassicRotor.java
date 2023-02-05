package mc.craig.software.cosmetics.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.client.models.ModelRegistration;
import mc.craig.software.cosmetics.client.models.block.ClassicRotorModel;
import mc.craig.software.cosmetics.client.models.block.ToyotaRotorModel;
import mc.craig.software.cosmetics.common.blockentity.ClassicRotorBlockEntity;
import mc.craig.software.cosmetics.common.blockentity.ClassicRotorBlockEntity;
import mc.craig.software.cosmetics.common.blocks.CoralChairBlock;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockState;

public class RenderClassicRotor implements BlockEntityRenderer<ClassicRotorBlockEntity>, BlockEntityRendererProvider<ClassicRotorBlockEntity> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(WhoCosmetics.MOD_ID, "textures/block/classic_rotor.png");
    private final ClassicRotorModel classicRotorModel;

    public RenderClassicRotor(Context context) {
        classicRotorModel = new ClassicRotorModel(context.bakeLayer(ModelRegistration.CLASSIC_ROTOR));
    }

    @Override
    public void render(ClassicRotorBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        poseStack.pushPose();
        poseStack.translate(0.5D, 1.5, 0.5D);

        BlockState blockstate = blockEntity.getBlockState();
        poseStack.mulPose(Vector3f.ZP.rotationDegrees(180));
        poseStack.mulPose(Vector3f.YP.rotationDegrees(-blockstate.getValue(CoralChairBlock.FACING).toYRot()));
        classicRotorModel.renderToBuffer(blockEntity, poseStack, bufferSource.getBuffer(RenderType.entityTranslucent(TEXTURE)), packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
        poseStack.popPose();
    }


    @Override
    public BlockEntityRenderer<ClassicRotorBlockEntity> create(Context context) {
        return new RenderClassicRotor(context);
    }
}
