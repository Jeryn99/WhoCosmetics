package mc.craig.software.cosmetics.common.entity;

import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.registry.DeferredRegistry;
import mc.craig.software.cosmetics.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import java.util.function.Supplier;

public class Entities {

    public static final DeferredRegistry<EntityType<?>> ENTITY_TYPES = DeferredRegistry.create(WhoCosmetics.MOD_ID, Registry.ENTITY_TYPE_REGISTRY);

    public static final RegistrySupplier<EntityType<DavrosChair>> DAVROS_CHAIR = ENTITY_TYPES.register("davros_chair", () -> EntityType.Builder.of(DavrosChair::new, MobCategory.CREATURE).sized(0.9F, 0.9F).build(WhoCosmetics.MOD_ID + ":davros_chair"));

    public static <T extends Entity> RegistrySupplier<EntityType<T>> register(String id, Supplier<EntityType.Builder<T>> builderSupplier) {
        return ENTITY_TYPES.register(id, () -> builderSupplier.get().build(WhoCosmetics.MOD_ID + ":" + id));
    }


}
