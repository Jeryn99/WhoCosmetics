package com.whocraft.whocosmetics.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.JukeboxBlock;
import net.minecraft.block.material.Material;

public class GramophoneBlock extends JukeboxBlock {
    public GramophoneBlock() {
        super(Block.Properties.create(Material.WOOD));
    }

    @Override
    public BlockRenderType getRenderType(BlockState p_149645_1_) {
        return BlockRenderType.MODEL;
    }

}
