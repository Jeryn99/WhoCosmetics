package com.whocraft.whocosmetics.client;

import com.whocraft.whocosmetics.common.items.ClothingItem;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/* Created by Craig on 11/03/2021 */
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientEvent {

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onRender(RenderPlayerEvent.Pre event) {
        PlayerModel< AbstractClientPlayerEntity > model = event.getRenderer().getEntityModel();
        for (EquipmentSlotType equipmentSlotType : EquipmentSlotType.values()) {
            if(equipmentSlotType == EquipmentSlotType.MAINHAND || equipmentSlotType == EquipmentSlotType.OFFHAND){
                continue;
            }
            ItemStack stack = event.getPlayer().getItemStackFromSlot(equipmentSlotType);
            if(stack.getItem() instanceof ClothingItem){
                ClothingData data = ClothingManager.getDataForItem(stack.getItem());
                if(data.isHideWear()){
                    model.bipedRightLegwear.showModel = false;
                    model.bipedBodyWear.showModel = false;
                    model.bipedLeftLegwear.showModel = false;
                    model.bipedRightArmwear.showModel = false;
                    model.bipedLeftArmwear.showModel = false;
                }
            }
        }

    }

}
