package com.whocraft.whocosmetics.proxy;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ServerProxy implements IProxy {

    @Override
    public World getClientWorld() {
        return null;
    }

    @Override
    public PlayerEntity getClientPlayer() {
        return null;
    }

    @Override
    public void playRecord(SoundEvent soundEvent, BlockPos pos) {

    }

    @Override
    public void stopSound(SoundEvent soundEvent, SoundCategory soundCategory, BlockPos blockPos) {

    }

}
