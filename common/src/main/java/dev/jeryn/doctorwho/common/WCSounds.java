package dev.jeryn.doctorwho.common;

import dev.jeryn.doctorwho.DoctorWhoDeco;
import dev.jeryn.doctorwho.registry.DeferredRegistry;
import dev.jeryn.doctorwho.registry.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class WCSounds {

    public static final DeferredRegistry<SoundEvent> SOUNDS = DeferredRegistry.create(DoctorWhoDeco.MOD_ID, Registries.SOUND_EVENT);

    public static final RegistrySupplier<SoundEvent> UMBRELLA_OPEN = SOUNDS.register("umbrella_open", () -> setUpSound("umbrella_open"));
    public static final RegistrySupplier<SoundEvent> SONIC = SOUNDS.register("sonic", () -> setUpSound("sonic"));
    public static final RegistrySupplier<SoundEvent> CLASSIC_DOORS = SOUNDS.register("classic_doors", () -> setUpSound("classic_doors"));

    private static SoundEvent setUpSound(String soundName) {
        return  SoundEvent.createFixedRangeEvent(new ResourceLocation(DoctorWhoDeco.MOD_ID, soundName), 1F);
    }

}
