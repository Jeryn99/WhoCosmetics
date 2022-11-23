package mc.craig.software.cosmetics.common.blockentity;

import mc.craig.software.cosmetics.common.WCBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CoralChairBlockEntity extends BlockEntity {

    public CoralChairBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(WCBlockEntities.CORAL_CHAIR.get(), blockPos, blockState);
    }
}
