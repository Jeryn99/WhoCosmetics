package dev.jeryn.doctorwho.common;

import dev.jeryn.doctorwho.DoctorWhoDeco;
import dev.jeryn.doctorwho.common.blockentity.*;
import dev.jeryn.doctorwho.registry.DeferredRegistry;
import dev.jeryn.doctorwho.registry.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class WCBlockEntities {

    public static final DeferredRegistry<BlockEntityType<?>> TILES = DeferredRegistry.create(DoctorWhoDeco.MOD_ID, Registries.BLOCK_ENTITY_TYPE);

    public static final RegistrySupplier<BlockEntityType<CoralChairBlockEntity>> CORAL_CHAIR = TILES.register("coral_chair", () -> registerTiles(CoralChairBlockEntity::new, WCBlocks.CORAL_CHAIR.get()));
    public static final RegistrySupplier<BlockEntityType<ClassicDoorsBlockEntity>> CLASSIC_DOORS = TILES.register("classic_doors", () -> registerTiles(ClassicDoorsBlockEntity::new, WCBlocks.CLASSIC_DOORS.get(), WCBlocks.CLASSIC_DOORS_BLACK.get(), WCBlocks.CLASSIC_DOORS_GREY.get(), WCBlocks.CLASSIC_DOORS_HARTNELL.get(), WCBlocks.CLASSIC_DOORS_MASTER.get(), WCBlocks.CLASSIC_DOORS_VICTORIAN.get() , WCBlocks.CLASSIC_DOORS_WARGAMES.get(), WCBlocks.CLASSIC_DOORS_ROUNDEL_SOLID.get(), WCBlocks.CLASSIC_DOORS_ROUNDEL_GREY_CIRCULAR.get(), WCBlocks.CLASSIC_DOORS_ROUNDEL_GOLD_INNER.get()));
    public static final RegistrySupplier<BlockEntityType<ToyotaRotorBlockEntity>> TOYOTA_ROTOR = TILES.register("toyota_rotor", () -> registerTiles(ToyotaRotorBlockEntity::new, WCBlocks.TOYOTA_ROTOR.get()));
    public static final RegistrySupplier<BlockEntityType<ClassicRotorBlockEntity>> CLASSIC_ROTOR = TILES.register("classic_rotor", () -> registerTiles(ClassicRotorBlockEntity::new, WCBlocks.CLASSIC_ROTOR.get()));
    public static final RegistrySupplier<BlockEntityType<WhirlygigBlockEntity>> WHIRLYGIG = TILES.register("whirlygig", () -> registerTiles(WhirlygigBlockEntity::new, WCBlocks.WHIRLY_GIG.get()));


    private static <T extends BlockEntity> BlockEntityType<T> registerTiles(BlockEntityType.BlockEntitySupplier<T> tile, Block... validBlock) {
        return BlockEntityType.Builder.of(tile, validBlock).build(null);
    }

}
