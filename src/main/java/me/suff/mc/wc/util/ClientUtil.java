package me.suff.mc.wc.util;

import me.suff.mc.wc.WhoCosmetics;
import me.suff.mc.wc.client.ClothingManager;
import me.suff.mc.wc.common.WCItems;
import me.suff.mc.wc.common.items.ClothingItem;
import me.suff.mc.wc.common.items.UmbrellaItem;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Predicate;

public class ClientUtil {


    public static boolean isSteve(LivingEntity livingEntity) {
        if (livingEntity instanceof AbstractClientPlayerEntity) {
            AbstractClientPlayerEntity player = (AbstractClientPlayerEntity) livingEntity;
            if(player.getSkinType().isEmpty()){
                return true;
            }
            if(player.getSkinType().equals("slim")){
                return false;
            }
        }
        return true;
    }

    private static final Predicate< Item > isColoredWc = item -> item instanceof ClothingItem && item.getRegistryName().getNamespace().equals(WhoCosmetics.MODID);

    public static void doItemColor(final ColorHandlerEvent.Item event) {
        for (Item item : ForgeRegistries.ITEMS.getValues()) {
            if (isColoredWc.test(item)) {
                ClothingItem coloredItem = (ClothingItem) item;
                if (coloredItem.isColored()) {
                    DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> event.getItemColors().register((p_getColor_1_, p_getColor_2_) -> p_getColor_2_ > 0 ? -1 : ((IDyeableArmorItem) p_getColor_1_.getItem()).getColor(p_getColor_1_), item));
                }
            }
        }
    }

    public static void doClientStuff(final FMLClientSetupEvent event) {
        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
            ClothingManager.setup();
            ItemModelsProperties.registerProperty(WCItems.UMBRELLA.get(), new ResourceLocation("whocosmetics:is_open"), new IItemPropertyGetter() {
                @Override
                public float call(ItemStack itemStack, ClientWorld clientWorld, LivingEntity livingEntity) {
                    return UmbrellaItem.getIsOpen(itemStack) ? 1 : 0;
                }
            });
        });
    }

}
