package com.whocraft.whocosmetics.proxy;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface IProxy {

    World getClientWorld();

    PlayerEntity getClientPlayer();

    void playRecord(SoundEvent soundEvent, BlockPos pos);

    void stopSound(SoundEvent soundEvent, SoundCategory soundCategory, BlockPos blockPos);
}
