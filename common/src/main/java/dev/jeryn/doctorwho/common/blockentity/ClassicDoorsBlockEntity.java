package dev.jeryn.doctorwho.common.blockentity;

import dev.jeryn.doctorwho.common.WCBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ClassicDoorsBlockEntity extends BlockEntity {

    public AnimationState ANIM_OPEN = new AnimationState(), ANIM_CLOSE = new AnimationState();

    public ClassicDoorsBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(WCBlockEntities.CLASSIC_DOORS.get(), blockPos, blockState);
    }



}
