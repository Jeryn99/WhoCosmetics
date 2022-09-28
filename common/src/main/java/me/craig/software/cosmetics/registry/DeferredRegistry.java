package me.craig.software.cosmetics.registry;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;

import java.util.Collection;
import java.util.function.Supplier;

public abstract class DeferredRegistry<T> {

    public abstract void register();

    public abstract <R extends T> RegistrySupplier<R> register(String id, Supplier<R> supplier);

    public abstract Collection<RegistrySupplier<T>> getEntries();

    public static <T> DeferredRegistry<T> create(String modid, CustomRegistry<T> registry) {
        return create(modid, registry.getRegistryKey());
    }

    @ExpectPlatform
    public static <T> DeferredRegistry<T> create(String modid, ResourceKey<? extends Registry<T>> resourceKey) {
        throw new AssertionError();
    }

}
