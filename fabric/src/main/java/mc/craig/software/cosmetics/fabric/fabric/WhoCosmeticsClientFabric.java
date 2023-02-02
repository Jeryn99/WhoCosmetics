package mc.craig.software.cosmetics.fabric.fabric;

import mc.craig.software.cosmetics.client.ClientUtil;
import mc.craig.software.cosmetics.client.models.ModelRegistration;
import mc.craig.software.cosmetics.client.renderer.RenderCoralChair;
import mc.craig.software.cosmetics.client.renderer.RenderDavrosChair;
import mc.craig.software.cosmetics.client.renderer.RenderToyotaRotor;
import mc.craig.software.cosmetics.common.WCBlockEntities;
import mc.craig.software.cosmetics.common.entity.Entities;
import mc.craig.software.cosmetics.fabric.fabric.handles.ClientEvents;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.entity.NoopRenderer;

public class WhoCosmeticsClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientEvents.init();
        ModelRegistration.init();
        ClientUtil.clothingModels();
        EntityRendererRegistry.register(Entities.DAVROS_CHAIR.get(), RenderDavrosChair::new);
        EntityRendererRegistry.register(Entities.CHAIR.get(), NoopRenderer::new);
        BlockEntityRendererRegistry.register(WCBlockEntities.CORAL_CHAIR.get(), RenderCoralChair::new);
/*
        BlockEntityRendererRegistry.register(WCBlockEntities.CLASSIC_DOORS.get(), RenderClassicDoors::new);
*/
        BlockEntityRendererRegistry.register(WCBlockEntities.TOYOTA_ROTOR.get(), RenderToyotaRotor::new);
    }
}
