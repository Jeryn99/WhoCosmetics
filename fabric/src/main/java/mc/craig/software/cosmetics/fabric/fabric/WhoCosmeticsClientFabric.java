package mc.craig.software.cosmetics.fabric.fabric;

import mc.craig.software.cosmetics.client.ClientUtil;
import mc.craig.software.cosmetics.client.models.ModelRegistration;
import mc.craig.software.cosmetics.client.renderer.RenderDavrosChair;
import mc.craig.software.cosmetics.common.entity.Entities;
import mc.craig.software.cosmetics.fabric.fabric.handles.ClientEvents;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class WhoCosmeticsClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientEvents.init();
        ModelRegistration.init();
        ClientUtil.clothingModels();
        EntityRendererRegistry.register(Entities.DAVROS_CHAIR.get(), RenderDavrosChair::new);

    }
}
