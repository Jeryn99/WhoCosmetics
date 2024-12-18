package dev.jeryn.doctorwho.common;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.SculkShriekerBlockEntity;
import net.minecraft.world.level.block.piston.PistonBaseBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.gameevent.GameEvent;

import static net.minecraft.world.level.block.PoweredRailBlock.POWERED;


public class SonicHandler {

    public static InteractionResult onSonic(Player serverPlayer, Level level, BlockPos blockPos) {
        BlockState blockState = level.getBlockState(blockPos);
        BlockEntity blockEntity = level.getBlockEntity(blockPos);

        //Disable for release
      /*  if(true) {
            return InteractionResult.FAIL;
        }*/

        if (isWood(blockState)) {
            return InteractionResult.FAIL;
        }

        if (blockState.getBlock() instanceof DispenserBlock dispenserBlock) {
            if(!level.isClientSide) {
                dispenserBlock.dispenseFrom((ServerLevel) level, blockPos);
            }
            return InteractionResult.SUCCESS;
        }

        if (blockState.getBlock() instanceof DoorBlock doorBlock) {
            boolean open = doorBlock.isOpen(blockState);
            doorBlock.setOpen(serverPlayer, level, blockState, blockPos, !open);
            return InteractionResult.SUCCESS;
        }

        if (blockState.getBlock() instanceof TntBlock tntBlock) {
            level.removeBlock(blockPos, false);
            TntBlock.explode(level, blockPos);
            return InteractionResult.SUCCESS;
        }

      /*  if (blockEntity instanceof JukeboxBlockEntity jukeboxBlockEntity) {
            ItemStack disk = jukeboxBlockEntity.getRecord();
            if (disk != null && !disk.isEmpty()) {
                jukeboxBlockEntity.playRecord();
                level.gameEvent(GameEvent.JUKEBOX_PLAY, blockPos, GameEvent.Context.of(blockState));
                return InteractionResult.SUCCESS;
            }
        }*/

        if (blockEntity instanceof SculkShriekerBlockEntity sculkShriekerBlockEntity) {
            if (!level.isClientSide) sculkShriekerBlockEntity.shriek((ServerLevel) level, serverPlayer);
            return InteractionResult.SUCCESS;
        }

        if(blockState.getBlock() instanceof PoweredRailBlock poweredRailBlock){
            level.setBlock(blockPos, blockState.setValue(POWERED, true), Block.UPDATE_ALL);
            return InteractionResult.SUCCESS;
        }

        if (blockState.getBlock() instanceof SculkSensorBlock) {
            level.gameEvent(serverPlayer, GameEvent.BLOCK_ACTIVATE, blockPos);
            return InteractionResult.SUCCESS;
        }

        if(blockState.getBlock() instanceof PistonBaseBlock block){
            block.triggerEvent(blockState, level, blockPos, 1, 2);
            return InteractionResult.SUCCESS;
        }

        Property<?>[] props = new Property<?>[]{
                BlockStateProperties.POWER,
                BlockStateProperties.OPEN,
                BlockStateProperties.POWERED,
                BlockStateProperties.ENABLED,
                BlockStateProperties.LIT,
        };

        for (Property<?> prop : props) {
            if (blockState.hasProperty(prop)) {
                if (!level.isClientSide) level.setBlock(blockPos, blockState.cycle(prop), Block.UPDATE_ALL);
                return InteractionResult.SUCCESS;
            }
        }

        return InteractionResult.FAIL;
    }

    private static boolean isWood(BlockState blockState) {
        return blockState.is(BlockTags.WOODEN_BUTTONS)
                || blockState.is(BlockTags.WOODEN_DOORS)
                || blockState.is(BlockTags.WOODEN_STAIRS)
                || blockState.is(BlockTags.WOODEN_SLABS)
                || blockState.is(BlockTags.WOODEN_FENCES)
                || blockState.is(BlockTags.WOODEN_PRESSURE_PLATES)
                || blockState.is(BlockTags.WOODEN_TRAPDOORS)
                || blockState.is(BlockTags.LOGS)
                || blockState.is(BlockTags.PLANKS)
                || blockState.is(BlockTags.WOODEN_PRESSURE_PLATES)
                || blockState.is(BlockTags.WOODEN_SLABS)
                || blockState.is(BlockTags.WOODEN_STAIRS)
                || blockState.is(BlockTags.WOODEN_TRAPDOORS)
                || blockState.is(BlockTags.WOODEN_FENCES)
                || blockState.is(BlockTags.SAPLINGS)
                || blockState.is(BlockTags.WOODEN_BUTTONS)
                || blockState.is(BlockTags.WOODEN_DOORS);
    }


}
