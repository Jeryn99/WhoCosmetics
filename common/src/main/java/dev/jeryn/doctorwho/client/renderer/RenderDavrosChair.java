package dev.jeryn.doctorwho.client.renderer;

import dev.jeryn.doctorwho.WhoCosmetics;
import dev.jeryn.doctorwho.client.models.vehicle.DavrosChairModel;
import dev.jeryn.doctorwho.client.models.ModelRegistration;
import dev.jeryn.doctorwho.common.entity.DavrosChair;
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
