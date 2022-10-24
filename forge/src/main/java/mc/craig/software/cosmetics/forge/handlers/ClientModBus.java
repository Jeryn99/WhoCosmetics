package mc.craig.software.cosmetics.forge.handlers;

import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.client.ArmorModelManager;
import mc.craig.software.cosmetics.client.ClientUtil;
import mc.craig.software.cosmetics.client.models.forge.ModelRegistrationImpl;
import mc.craig.software.cosmetics.common.WCItems;
import mc.craig.software.cosmetics.common.items.ClothingItem;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WhoCosmetics.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
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
    }

    @SubscribeEvent
    public static void event(EntityRenderersEvent.RegisterLayerDefinitions event) {
        ModelRegistrationImpl.registerToGame(event);
    }


}
