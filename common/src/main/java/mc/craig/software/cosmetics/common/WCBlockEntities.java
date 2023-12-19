package mc.craig.software.cosmetics.common;

import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.common.blockentity.*;
import mc.craig.software.cosmetics.registry.DeferredRegistry;
import mc.craig.software.cosmetics.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class WCBlockEntities {

    public static final DeferredRegistry<BlockEntityType<?>> TILES = DeferredRegistry.create(WhoCosmetics.MOD_ID, Registry.BLOCK_ENTITY_TYPE_REGISTRY);

    public static final RegistrySupplier<BlockEntityType<CoralChairBlockEntity>> CORAL_CHAIR = TILES.register("coral_chair", () -> registerTiles(CoralChairBlockEntity::new, WCBlocks.CORAL_CHAIR.get()));
    public static final RegistrySupplier<BlockEntityType<ClassicDoorsBlockEntity>> CLASSIC_DOORS = TILES.register("classic_doors", () -> registerTiles(ClassicDoorsBlockEntity::new, WCBlocks.CLASSIC_DOORS.get()));
    public static final RegistrySupplier<BlockEntityType<ToyotaRotorBlockEntity>> TOYOTA_ROTOR = TILES.register("toyota_rotor", () -> registerTiles(ToyotaRotorBlockEntity::new, WCBlocks.TOYOTA_ROTOR.get()));
    public static final RegistrySupplier<BlockEntityType<ClassicRotorBlockEntity>> CLASSIC_ROTOR = TILES.register("classic_rotor", () -> registerTiles(ClassicRotorBlockEntity::new, WCBlocks.CLASSIC_ROTOR.get()));
    public static final RegistrySupplier<BlockEntityType<WhirlygigBlockEntity>> WHIRLYGIG = TILES.register("whirlygig", () -> registerTiles(WhirlygigBlockEntity::new, WCBlocks.WHIRLY_GIG.get()));


    private static <T extends BlockEntity> BlockEntityType<T> registerTiles(BlockEntityType.BlockEntitySupplier<T> tile, Block validBlock) {
        return BlockEntityType.Builder.of(tile, validBlock).build(null);
    }

}
