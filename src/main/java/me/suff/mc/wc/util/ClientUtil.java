package me.suff.mc.wc.util;

import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.entity.LivingEntity;

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

}
