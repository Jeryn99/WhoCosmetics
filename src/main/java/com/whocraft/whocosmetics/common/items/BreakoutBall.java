package com.whocraft.whocosmetics.common.items;

import net.minecraft.command.impl.TeleportCommand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingFallEvent;

import static net.minecraft.block.Blocks.AIR;
import static net.minecraft.block.Blocks.TNT;

public class BreakoutBall extends Item {
    public BreakoutBall(Properties properties) {
        super(properties);
    }

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        super.inventoryTick(stack, worldIn, entityIn, itemSlot, isSelected);
            if(entityIn instanceof PlayerEntity){
                PlayerEntity playerEntity = (PlayerEntity) entityIn;
                playerEntity.noClip = isSelected;

                if(isSelected){
                    if(playerEntity.collidedHorizontally){
                        BlockPos pos = playerEntity.getPosition();
                        playerEntity.setMotion(new Vector3d(0,0,0));

                    }
                }
            }
    }
}
