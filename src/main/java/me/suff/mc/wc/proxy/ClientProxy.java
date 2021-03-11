package me.suff.mc.wc.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ClientProxy extends ServerProxy {
    @Override
    public PlayerEntity getClientPlayer() {
        return Minecraft.getInstance().player;
    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }

    @Override
    public void playRecord(SoundEvent soundEvent, BlockPos pos) {
        Minecraft.getInstance().worldRenderer.playRecord(soundEvent, pos);
    }

    @Override
    public void stopSound(SoundEvent soundEvent, SoundCategory soundCategory, BlockPos pos) {
    /*    WorldRenderer worldRender = Minecraft.getInstance().worldRenderer;
    //    ISound isound = worldRender.mapSoundPositions.get(pos);
        if (isound != null) {
            Minecraft.getInstance().getSoundHandler().stop(isound);
           // worldRender.mapSoundPositions.remove(pos);
        }*/
    }
}
