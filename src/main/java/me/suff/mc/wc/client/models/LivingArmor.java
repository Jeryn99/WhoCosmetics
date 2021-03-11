package me.suff.mc.wc.client.models;

import net.minecraft.entity.LivingEntity;

public interface LivingArmor {
        void setLiving(LivingEntity entity);

        LivingEntity getLiving();
}
