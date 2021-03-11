package com.whocraft.whocosmetics.util;

import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.entity.LivingEntity;

public class ClientUtil {


    public static boolean isSteve(LivingEntity livingEntity) {
        if (livingEntity instanceof AbstractClientPlayerEntity) {
            AbstractClientPlayerEntity player = (AbstractClientPlayerEntity) livingEntity;
            return player.getSkinType().isEmpty();
        }
        return false;
    }

}
