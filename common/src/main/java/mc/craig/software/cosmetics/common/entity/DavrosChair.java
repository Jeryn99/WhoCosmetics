package mc.craig.software.cosmetics.common.entity;

import com.mojang.math.Vector3d;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

public class DavrosChair extends Mob {

    public DavrosChair(EntityType entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes().
                add(Attributes.FOLLOW_RANGE, 35D).
                add(Attributes.MOVEMENT_SPEED, 0.23F).
                add(Attributes.ATTACK_DAMAGE, 3F).
                add(Attributes.MAX_HEALTH, 20D).
                add(Attributes.ARMOR, 2.0D);
    }



    @Override
    public AttributeMap getAttributes() {
        return new AttributeMap(createAttributes().build());
    }

    @Nullable
    @Override
    public Entity getControllingPassenger() {
        return this.getFirstPassenger();
    }

    @Override
    protected InteractionResult mobInteract(Player player, InteractionHand hand) {
        if (!this.level.isClientSide) {
            return player.startRiding(this) ? InteractionResult.CONSUME : InteractionResult.PASS;
        }
        return super.mobInteract(player, hand);
    }

    @Override
    public void tick() {
        super.tick();
    }

    @Override
    public void travel(Vec3 travelVector) {

        Entity entity = getControllingPassenger();
        if (isVehicle() && entity instanceof Player) {
            setYRot(entity.getYRot());
            yRotO = getYRot();
            setXRot(entity.getXRot() * 0.5F);
            setRot(getYRot(), getXRot());
            yBodyRot = getYRot();
            yHeadRot = getYRot();
            maxUpStep = 1.0F;
            flyingSpeed = getSpeed() * 0.1F;

            if (isControlledByLocalInstance()) {

                float forward = ((Player) entity).zza;
                if (forward <= 0.0F) {
                    forward *= 0.25F;
                }

                setSpeed(0.2F);
                super.travel(new Vec3(0, getDeltaMovement().y, forward));

            } else {
                calculateEntityAnimation(this, false);
                setDeltaMovement(Vec3.ZERO);
            }

            tryCheckInsideBlocks();
        } else {
            maxUpStep = 0.5F;
            flyingSpeed = 0.02F;
            super.travel(travelVector);
        }
    }


    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return SoundEvents.IRON_GOLEM_HURT;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {

    }

    @Override
    public boolean isVehicle() {
        return true;
    }


}
