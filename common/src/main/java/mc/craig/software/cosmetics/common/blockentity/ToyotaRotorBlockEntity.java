package mc.craig.software.cosmetics.common.blockentity;

import mc.craig.software.cosmetics.common.WCBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ToyotaRotorBlockEntity extends BlockEntity {

    public ToyotaRotorBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(WCBlockEntities.TOYOTA_ROTOR.get(), blockPos, blockState);
    }



}
