package com.whocraft.whocosmetics.common.blocks;

import com.whocraft.whocosmetics.WhoCosmetics;
import com.whocraft.whocosmetics.common.WCTiles;
import com.whocraft.whocosmetics.common.tiles.GramphoneTile;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.JukeboxBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class GramophoneBlock extends JukeboxBlock {
    public GramophoneBlock() {
        super(Block.Properties.create(Material.WOOD));
    }

    @Override
    public BlockRenderType getRenderType(BlockState p_149645_1_) {
        return BlockRenderType.MODEL;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return WCTiles.GRAMOPHONE.get().create();
    }

    @Override
    public boolean onBlockActivated(BlockState p_220051_1_, World p_220051_2_, BlockPos p_220051_3_, PlayerEntity p_220051_4_, Hand p_220051_5_, BlockRayTraceResult p_220051_6_) {
        stopMusic(p_220051_2_.getTileEntity(p_220051_3_));
        return super.onBlockActivated(p_220051_1_, p_220051_2_, p_220051_3_, p_220051_4_, p_220051_5_, p_220051_6_);
    }

    @Override
    public void onReplaced(BlockState p_196243_1_, World p_196243_2_, BlockPos p_196243_3_, BlockState p_196243_4_, boolean p_196243_5_) {
        super.onReplaced(p_196243_1_, p_196243_2_, p_196243_3_, p_196243_4_, p_196243_5_);
    }

    public void stopMusic(TileEntity tileEntity){
        if(tileEntity instanceof GramphoneTile) {
            GramphoneTile gramphoneTile = (GramphoneTile) tileEntity;
            MusicDiscItem musicDiscItem = (MusicDiscItem) gramphoneTile.getRecord().getItem();
            WhoCosmetics.PROXY.stopSound(musicDiscItem.getSound(), SoundCategory.RECORDS, gramphoneTile.getPos());
        }
    }
}
