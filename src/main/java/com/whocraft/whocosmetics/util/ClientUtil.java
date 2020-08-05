package com.whocraft.whocosmetics.util;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Map;

public class ClientUtil {


    public static boolean isSteve(PlayerEntity player) {
        Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> map = Minecraft.getInstance().getSkinManager().loadSkinFromCache(player.getGameProfile());
        if (map.isEmpty()) {
            map = Minecraft.getInstance().getSessionService().getTextures(Minecraft.getInstance().getSessionService().fillProfileProperties(player.getGameProfile(), false), false);
        }
        MinecraftProfileTexture profile = map.get(MinecraftProfileTexture.Type.SKIN);
        return profile.getMetadata("model") == null;
    }

}
