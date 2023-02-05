package mc.craig.software.cosmetics.common.blockentity;

import mc.craig.software.cosmetics.common.WCBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class ClassicDoorsBlockEntity extends BlockEntity {

    public AnimationState ANIM_OPEN = new AnimationState(), ANIM_CLOSE = new AnimationState();

    public ClassicDoorsBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(WCBlockEntities.CLASSIC_DOORS.get(), blockPos, blockState);
    }



}
