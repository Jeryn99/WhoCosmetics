package mc.craig.software.cosmetics.common.blockentity;

import mc.craig.software.cosmetics.common.WCBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ToyotaRotorBlockEntity extends BlockEntity implements AnimatedBlockEntityBase {

    public ToyotaRotorBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(WCBlockEntities.TOYOTA_ROTOR.get(), blockPos, blockState);
    }

    public AnimationState FLY = new AnimationState();

    @Override
    public void tick(Level level, BlockPos blockPos, BlockState blockState, BlockEntity blockEntity) {
        if (level.getBestNeighborSignal(blockPos) > 0) {
            if (!FLY.isStarted()) {
                FLY.start(8);
            }
            return;
        }
        FLY.stop();
    }

}
