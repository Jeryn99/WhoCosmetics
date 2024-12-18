package dev.jeryn.doctorwho.common.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class Nitro9Entity extends PrimedTnt {
    public Nitro9Entity(EntityType<? extends Nitro9Entity> entityType, Level level) {
        super(entityType, level);
    }

    public Nitro9Entity(Level level, double d, double e, double f, @Nullable LivingEntity livingEntity) {
        this(Entities.NITRO_9.get(), level);
        this.setPos(d, e, f);
        double g = level.random.nextDouble() * 6.2831854820251465;
        this.setDeltaMovement(-Math.sin(g) * 0.02, 0.20000000298023224, -Math.cos(g) * 0.02);
        this.setFuse(80);
        this.xo = d;
        this.yo = e;
        this.zo = f;

    }

    public Nitro9Entity(Level level) {
        super(Entities.NITRO_9.get(), level);
    }


}
