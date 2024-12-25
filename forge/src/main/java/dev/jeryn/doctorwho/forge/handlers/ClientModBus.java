package dev.jeryn.doctorwho.forge.handlers;

import dev.jeryn.doctorwho.DoctorWhoDeco;
import dev.jeryn.doctorwho.client.ArmorModelManager;
import dev.jeryn.doctorwho.client.models.forge.ModelRegistrationImpl;
import dev.jeryn.doctorwho.client.renderer.*;
import dev.jeryn.doctorwho.common.WCBlockEntities;
import dev.jeryn.doctorwho.common.WCItems;
import dev.jeryn.doctorwho.common.entity.Entities;
import dev.jeryn.doctorwho.common.items.ClothingItem;
import dev.jeryn.doctorwho.common.items.JSONClothingItem;
import dev.jeryn.doctorwho.common.items.UmbrellaItem;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.NoopRenderer;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DoctorWhoDeco.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModBus {

    @SubscribeEvent
    public static void reloadRegisterClient(RegisterClientReloadListenersEvent e) {
        e.registerReloadListener(new ArmorModelManager());
    }

    @SubscribeEvent
    public static void onItemColors(RegisterColorHandlersEvent.Item item){
        item.register((arg, index) -> {
            if (arg.getItem() instanceof ClothingItem clothingItem && index == 0) {
                if (clothingItem.isColored()) {
                    return clothingItem.getColor(arg);
                }
            }
            return -1;
        }, WCItems.BOW_TIE.get(), WCItems.FEZ.get());

        item.register((arg, index) -> {
            if (arg.getItem() instanceof JSONClothingItem clothingItem && index == 0) {
                if (clothingItem.isColored()) {
                    return clothingItem.getColor(arg);
                }
            }
            return -1;
        }, WCItems.TOP_HAT.get());

        ItemProperties.register(WCItems.UMBRELLA.get(), new ResourceLocation("whocosmetics:is_open"), (itemStack, clientWorld, livingEntity, unused) -> UmbrellaItem.getIsOpen(itemStack) ? 1 : 0);
        ItemProperties.register(WCItems.UMBRELLA_MISSY.get(), new ResourceLocation("whocosmetics:is_open"), (itemStack, clientWorld, livingEntity, unused) -> UmbrellaItem.getIsOpen(itemStack) ? 1 : 0);
    }

    @SubscribeEvent
    public static void event(EntityRenderersEvent.RegisterLayerDefinitions event) {
        ModelRegistrationImpl.registerToGame(event);

        EntityRenderers.register(Entities.DAVROS_CHAIR.get(), RenderDavrosChair::new);
        EntityRenderers.register(Entities.CHAIR.get(), NoopRenderer::new);
        EntityRenderers.register(Entities.GRENADE.get(), RenderGrenade::new);
        EntityRenderers.register(Entities.NITRO_9.get(), RenderNitro9::new);
        BlockEntityRenderers.register(WCBlockEntities.CORAL_CHAIR.get(), RenderCoralChair::new);
        BlockEntityRenderers.register(WCBlockEntities.CLASSIC_ROTOR.get(), RenderClassicRotor::new);
        BlockEntityRenderers.register(WCBlockEntities.CLASSIC_DOORS.get(), RenderClassicDoors::new);
        BlockEntityRenderers.register(WCBlockEntities.TOYOTA_ROTOR.get(), RenderToyotaRotor::new);
        BlockEntityRenderers.register(WCBlockEntities.WHIRLYGIG.get(), RenderWhirlyGig::new);
    }

}
