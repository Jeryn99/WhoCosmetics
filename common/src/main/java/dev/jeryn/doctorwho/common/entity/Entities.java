package dev.jeryn.doctorwho.common.entity;

import dev.jeryn.doctorwho.DoctorWhoDeco;
import dev.jeryn.doctorwho.registry.DeferredRegistry;
import dev.jeryn.doctorwho.registry.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import java.util.function.Supplier;

public class Entities {

    public static final DeferredRegistry<EntityType<?>> ENTITY_TYPES = DeferredRegistry.create(DoctorWhoDeco.MOD_ID, Registries.ENTITY_TYPE);

    public static final RegistrySupplier<EntityType<DavrosChair>> DAVROS_CHAIR = ENTITY_TYPES.register("davros_chair", () -> EntityType.Builder.of(DavrosChair::new, MobCategory.MISC).sized(0.9F, 0.9F).build(DoctorWhoDeco.MOD_ID + ":davros_chair"));
    public static final RegistrySupplier<EntityType<Chair>> CHAIR = ENTITY_TYPES.register("chair", () -> EntityType.Builder.of(Chair::new, MobCategory.MISC).sized(0.9F, 0.9F).build(DoctorWhoDeco.MOD_ID + ":chair"));
    public static final RegistrySupplier<EntityType<Grenade>> GRENADE = ENTITY_TYPES.register("grenade", () -> EntityType.Builder.<Grenade>of(Grenade::new, MobCategory.MISC).sized(0.9F, 0.9F).build(DoctorWhoDeco.MOD_ID + ":grenade"));
    public static final RegistrySupplier<EntityType<Nitro9Entity>> NITRO_9 = ENTITY_TYPES.register("nitro_9", () -> EntityType.Builder.<Nitro9Entity>of((entityType, level) -> new Nitro9Entity(level), MobCategory.MISC).sized(0.9F, 0.9F).build(DoctorWhoDeco.MOD_ID + ":nitro_9"));

    public static <T extends Entity> RegistrySupplier<EntityType<T>> register(String id, Supplier<EntityType.Builder<T>> builderSupplier) {
        return ENTITY_TYPES.register(id, () -> builderSupplier.get().build(DoctorWhoDeco.MOD_ID + ":" + id));
    }


}
