package dev.jeryn.doctorwho.common;

import dev.jeryn.doctorwho.WhoCosmetics;
import dev.jeryn.doctorwho.registry.DeferredRegistry;
import dev.jeryn.doctorwho.registry.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class WCSounds {

    public static final DeferredRegistry<SoundEvent> SOUNDS = DeferredRegistry.create(WhoCosmetics.MOD_ID, Registries.SOUND_EVENT);

    public static final RegistrySupplier<SoundEvent> UMBRELLA_OPEN = SOUNDS.register("umbrella_open", () -> setUpSound("umbrella_open"));
    public static final RegistrySupplier<SoundEvent> SONIC = SOUNDS.register("sonic", () -> setUpSound("sonic"));

    private static SoundEvent setUpSound(String soundName) {
        return  SoundEvent.createFixedRangeEvent(new ResourceLocation(WhoCosmetics.MOD_ID, soundName), 1F);
    }

}
