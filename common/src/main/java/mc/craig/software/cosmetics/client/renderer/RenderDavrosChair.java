package mc.craig.software.cosmetics.client.renderer;

import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.client.models.vehicle.DavrosChairModel;
import mc.craig.software.cosmetics.client.models.ModelRegistration;
import mc.craig.software.cosmetics.common.entity.DavrosChair;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderDavrosChair extends MobRenderer<DavrosChair, DavrosChairModel> {

    public RenderDavrosChair(EntityRendererProvider.Context context) {
        super(context, new DavrosChairModel(context.bakeLayer(ModelRegistration.DAVROS_CHAIR)), 1);
    }

    @Override
    public ResourceLocation getTextureLocation(DavrosChair entity) {
        DavrosChair.Variant variant = entity.getVariantEnum();
        return new ResourceLocation(WhoCosmetics.MOD_ID, "textures/entity/" + variant.getTexture() + ".png");
    }
}
