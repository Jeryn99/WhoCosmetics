package me.suff.mc.wc.client.tiles;

import com.mojang.blaze3d.matrix.MatrixStack;
import me.suff.mc.wc.WhoCosmetics;
import me.suff.mc.wc.client.models.tiles.HatstandModel;
import me.suff.mc.wc.common.tiles.HatStandTile;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

/* Created by Craig on 14/03/2021 */
public class RenderHatstand extends TileEntityRenderer< HatStandTile > {

    private static HatstandModel hatstandModel = new HatstandModel();
    private static ResourceLocation texture = new ResourceLocation(WhoCosmetics.MODID, "textures/hat_stand.png");

    public RenderHatstand(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void render(HatStandTile tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
        matrixStackIn.push();
        matrixStackIn.translate(0.5,1.5,0.5);
        matrixStackIn.rotate(Vector3f.XP.rotationDegrees(180));
        hatstandModel.render(matrixStackIn, bufferIn.getBuffer(RenderType.getEntityTranslucent(texture)), combinedLightIn, combinedOverlayIn, 1, 1, 1, 1);
        matrixStackIn.pop();
    }
}
