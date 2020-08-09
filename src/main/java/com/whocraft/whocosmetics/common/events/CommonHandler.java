package com.whocraft.whocosmetics.common.events;

import com.whocraft.whocosmetics.WhoCosmetics;
import com.whocraft.whocosmetics.common.blocks.GramophoneBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.stats.Stats;
import net.minecraftforge.client.event.sound.PlayStreamingSourceEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CommonHandler {

    @SubscribeEvent
    public static void fixRecord(PlayerInteractEvent.RightClickBlock event) {
        ItemStack stack = event.getItemStack();
        BlockState block = event.getWorld().getBlockState(event.getPos());
        if (stack.getItem() instanceof MusicDiscItem && block.getBlock() instanceof GramophoneBlock) {
            MusicDiscItem musicDiscItem = (MusicDiscItem) stack.getItem();
            GramophoneBlock gramophoneBlock = (GramophoneBlock) block.getBlock();
            gramophoneBlock.insertRecord(event.getWorld(), event.getPos(), block, stack.copy());
            stack.shrink(1);
            WhoCosmetics.PROXY.playRecord(musicDiscItem.getSound(), event.getPos());
            PlayerEntity playerEntity = event.getPlayer();
            if (playerEntity != null) {
                playerEntity.addStat(Stats.PLAY_RECORD);
            }
        }
    }

}
