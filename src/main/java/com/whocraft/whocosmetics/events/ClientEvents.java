package com.whocraft.whocosmetics.events;

import com.whocraft.whocosmetics.common.items.ClothingItem;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Predicate;

import static com.whocraft.whocosmetics.WhoCosmetics.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    private static Predicate<Item> isColoredWc = item -> item instanceof ClothingItem && item.getRegistryName().getNamespace().equals(MODID);

    @SubscribeEvent
    public static void registerItemColor(ColorHandlerEvent.Item event) {
        for (Item item : ForgeRegistries.ITEMS.getValues()) {
            if (isColoredWc.test(item)) {
                ClothingItem coloredItem = (ClothingItem) item;
                if (coloredItem.isColored()) {
                    DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> event.getItemColors().register((p_getColor_1_, p_getColor_2_) -> p_getColor_2_ > 0 ? -1 : ((IDyeableArmorItem) p_getColor_1_.getItem()).getColor(p_getColor_1_), item));
                }
            }
        }
    }


}
