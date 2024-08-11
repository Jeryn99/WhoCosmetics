package mc.craig.software.cosmetics.common.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
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


    private static final EntityDataAccessor<Integer> DATA_VARIANT_ID = SynchedEntityData.defineId(DavrosChair.class, EntityDataSerializers.INT);

    @Override
    protected void positionRider(Entity entity, MoveFunction moveFunction) {
        if (this.hasPassenger(entity)) {
            double d = this.getY() + this.getPassengersRidingOffset() + entity.getMyRidingOffset();
            entity.setPos(position().x, d, position().z);
        }
    }

    public DavrosChair(EntityType entityType, Level level) {
        super(entityType, level);
    }

    public enum Variant {
        GOLD("davros_chair_gold"), BLACK("davros_chair");

        private final String texture;

        Variant(String texture) {
            this.texture = texture;
        }

        public String getTexture() {
            return texture;
        }
    }

    public int getVariant() {
        return Mth.clamp(this.entityData.get(DATA_VARIANT_ID), 0, 1);
    }

    public Variant getVariantEnum() {
        return Variant.values()[getVariant()];
    }

    public void setVariant(Variant variant) {
        this.entityData.set(DATA_VARIANT_ID, variant.ordinal());
    }

    public void setVariant(int variant) {
        this.entityData.set(DATA_VARIANT_ID, variant);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putInt("Variant", this.getVariant());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        this.setVariant(compound.getInt("Variant"));
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_VARIANT_ID, random.nextBoolean() ? Variant.GOLD.ordinal() : Variant.BLACK.ordinal());
    }


    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes().
                add(Attributes.FOLLOW_RANGE, 35D).
                add(Attributes.MOVEMENT_SPEED, 0.20F).
                add(Attributes.ATTACK_DAMAGE, 3F).
                add(Attributes.MAX_HEALTH, 20D).
                add(Attributes.ARMOR, 2.0D);
    }


    @Override
    public AttributeMap getAttributes() {
        return new AttributeMap(createAttributes().build());
    }

    @Override
    public LivingEntity getControllingPassenger() {
        Entity firstPassenger = this.getFirstPassenger();
        if (firstPassenger instanceof LivingEntity) {
            return (LivingEntity) firstPassenger;
        } else {
            return null;
        }
    }


    @Override
    protected InteractionResult mobInteract(Player player, InteractionHand hand) {
        if (!this.level().isClientSide) {
            return player.startRiding(this) ? InteractionResult.CONSUME : InteractionResult.PASS;
        }
        return super.mobInteract(player, hand);
    }

    @Override
    public void tick() {

        Level level = level();

        super.tick();
        if (getHealth() < 5) {
            level.addParticle(ParticleTypes.FLAME, this.getRandomX(0.5), this.getRandomY(), this.getRandomZ(0.5), 0, 0, 0);
            level.addParticle(ParticleTypes.SMOKE, this.getRandomX(0.5), this.getRandomY(), this.getRandomZ(0.5), 0, 0, 0);

            if (this.random.nextInt(24) == 0 && !this.isSilent()) {
                level.playLocalSound(this.getX() + 0.5, this.getY() + 0.5, this.getZ() + 0.5, SoundEvents.BLAZE_BURN, this.getSoundSource(), 1.0F + this.random.nextFloat(), this.random.nextFloat() * 0.7F + 0.3F, false);
            }
        }
    }

    @Override
    public float maxUpStep() {
        return 1;
    }

    @Override
    public void travel(Vec3 travelVector) {

        if (this.isAlive()) {
            LivingEntity livingEntity = getControllingPassenger();
                if (this.isVehicle() && livingEntity != null) {
                    this.setYRot(livingEntity.getYRot());
                    this.yRotO = this.getYRot();
                    this.setXRot(livingEntity.getXRot() * 0.5F);
                    this.setRot(this.getYRot(), this.getXRot());
                    this.yBodyRot = this.getYRot();
                    this.yHeadRot = this.yBodyRot;
                    float horizontalSpeed = livingEntity.xxa * 0.5F;
                    float verticalSpeed = livingEntity.zza;

                    if (verticalSpeed <= 0.0F) {
                        verticalSpeed *= 0.25F;
                    }

                    //TODO? this.flyingSpeed = this.getSpeed() * 0.1F;
                    if (this.isControlledByLocalInstance()) {
                        this.setSpeed((float) this.getAttributeValue(Attributes.MOVEMENT_SPEED));
                        super.travel(new Vec3(horizontalSpeed, travelVector.y, verticalSpeed));
                    } else if (livingEntity instanceof Player) {
                        this.setDeltaMovement(Vec3.ZERO);
                    }

                    this.calculateEntityAnimation(false);
                    this.tryCheckInsideBlocks();
                } else {
                   //TODO? this.flyingSpeed = 0.02F;
                    super.travel(travelVector);
                }
        }
    }


    // Closest Vanilla sound to a Dalek being hit, should find some custom ones though as other mods also do this
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
