/*
package mc.craig.software.cosmetics.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.client.models.ClassicDoorsModel;
import mc.craig.software.cosmetics.client.models.ModelRegistration;
import mc.craig.software.cosmetics.common.blockentity.ClassicDoorsBlockEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;

public class RenderClassicDoors implements BlockEntityRenderer<ClassicDoorsBlockEntity>, BlockEntityRendererProvider<ClassicDoorsBlockEntity> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(WhoCosmetics.MOD_ID, "textures/block/classic_doors.png");
    private final ClassicDoorsModel classicDoorsModel;

    public RenderClassicDoors(Context context) {
        classicDoorsModel = new ClassicDoorsModel(context.bakeLayer(ModelRegistration.CLASSIC_DOOR));
    }

    @Override
    public void render(ClassicDoorsBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        if (blockEntity.getBlockState().hasProperty(DoorBlock.HALF) && blockEntity.getBlockState().getValue(DoorBlock.HALF) == DoubleBlockHalf.UPPER)
            return;
        poseStack.pushPose();
        poseStack.translate(0.5D, 1.5, 0.5D);

        BlockState blockstate = blockEntity.getBlockState();
        poseStack.translate(0, 0, -0.4);
        poseStack.mulPose(Vector3f.ZP.rotationDegrees(180));
        poseStack.mulPose(Vector3f.YP.rotationDegrees(-blockstate.getValue(ClassicDoorsBlock.FACING).toYRot()));
        classicDoorsModel.renderToBuffer(blockEntity, poseStack, bufferSource.getBuffer(RenderType.entityTranslucent(TEXTURE)), packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
        poseStack.popPose();
    }


    @Override
    public BlockEntityRenderer<ClassicDoorsBlockEntity> create(Context context) {
        return new RenderClassicDoors(context);
    }
}
*/
