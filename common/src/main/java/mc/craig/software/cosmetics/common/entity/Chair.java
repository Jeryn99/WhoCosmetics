package mc.craig.software.cosmetics.common.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.level.Level;

import java.util.Iterator;

public class Chair extends Entity {

    private static int MAX_PASSENGERS = 3;


    public Chair(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected boolean canAddPassenger(Entity passenger) {
        return getPassengers().size() < MAX_PASSENGERS;
    }

    @Override
    protected void defineSynchedData() {

    }

    @Override
    protected void readAdditionalSaveData(CompoundTag compound) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundTag compound) {

    }


    @Override
    public void positionRider(Entity passenger) {
        double mountOffset = this.getY() + this.getPassengersRidingOffset() + passenger.getMyRidingOffset();

        Direction rotation = getDirection();
        BlockPos leftPos = blockPosition().relative(rotation.getClockWise());
        BlockPos rightPos = blockPosition().relative(rotation.getCounterClockWise());


        if (getPassengers().size() > 0 && getPassengers().get(0) == passenger) {
            super.positionRider(passenger);
        }
        if (getPassengers().size() > 1 && getPassengers().get(1) == passenger) {
            passenger.setPos(leftPos.getX() + 0.5, mountOffset, leftPos.getZ() + 0.5);
        }
        if (getPassengers().size() > 2 && getPassengers().get(2) == passenger) {
            passenger.setPos(rightPos.getX() + 0.5, mountOffset, rightPos.getZ() + 0.5);
        }

    }

    @Override
    public void tick() {
        super.tick();
        if (getPassengers().isEmpty()) {
            remove(RemovalReason.DISCARDED);
        }
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return new ClientboundAddEntityPacket(this);
    }
}
