package dev.jeryn.doctorwho.fabric.fabric;

import dev.jeryn.doctorwho.client.ClientUtil;
import dev.jeryn.doctorwho.client.models.ModelRegistration;
import dev.jeryn.doctorwho.client.renderer.*;
import dev.jeryn.doctorwho.common.WCBlockEntities;
import dev.jeryn.doctorwho.common.entity.Entities;
import dev.jeryn.doctorwho.fabric.fabric.handles.ClientEvents;
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
        EntityRendererRegistry.register(Entities.GRENADE.get(), RenderGrenade::new);
        EntityRendererRegistry.register(Entities.NITRO_9.get(), RenderNitro9::new);
        BlockEntityRendererRegistry.register(WCBlockEntities.CORAL_CHAIR.get(), RenderCoralChair::new);
        BlockEntityRendererRegistry.register(WCBlockEntities.CLASSIC_ROTOR.get(), RenderClassicRotor::new);
        BlockEntityRendererRegistry.register(WCBlockEntities.CLASSIC_DOORS.get(), RenderClassicDoors::new);
        BlockEntityRendererRegistry.register(WCBlockEntities.TOYOTA_ROTOR.get(), RenderToyotaRotor::new);
        BlockEntityRendererRegistry.register(WCBlockEntities.WHIRLYGIG.get(), RenderWhirlyGig::new);
    }
}
