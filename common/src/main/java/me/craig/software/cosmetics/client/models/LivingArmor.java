package me.craig.software.cosmetics.client.models;


import net.minecraft.world.entity.LivingEntity;

public interface LivingArmor {
    void setLiving(LivingEntity entity);

    LivingEntity getLiving();
}
