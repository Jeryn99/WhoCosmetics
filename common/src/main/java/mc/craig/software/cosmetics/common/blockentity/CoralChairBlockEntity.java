package mc.craig.software.cosmetics.common.blockentity;

import mc.craig.software.cosmetics.common.WCBlockEntities;
import mc.craig.software.cosmetics.common.blocks.CoralChairBlock;
import mc.craig.software.cosmetics.common.entity.Chair;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CoralChairBlockEntity extends BlockEntity {

    public Chair chairEntity = null;

    public CoralChairBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(WCBlockEntities.CORAL_CHAIR.get(), blockPos, blockState);
    }

    public Chair getChairEntity() {
        return chairEntity;
    }

    public void setChairEntity(Chair chairEntity) {
        this.chairEntity = chairEntity;

        if (level.getBlockState(getBlockPos()).hasProperty(CoralChairBlock.FACING)) {
            Direction rotation = level.getBlockState(getBlockPos()).getValue(CoralChairBlock.FACING);
            this.chairEntity.setYBodyRot(rotation.toYRot());
        }
    }


}
