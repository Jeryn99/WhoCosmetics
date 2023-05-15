package mc.craig.software.cosmetics.common;

import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.common.blockentity.ClassicRotorBlockEntity;
import mc.craig.software.cosmetics.common.blockentity.ToyotaRotorBlockEntity;
import mc.craig.software.cosmetics.common.blockentity.WhirlygigBlockEntity;
import mc.craig.software.cosmetics.common.blocks.*;
import mc.craig.software.cosmetics.registry.DeferredRegistry;
import mc.craig.software.cosmetics.registry.RegistrySupplier;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.Supplier;

import static mc.craig.software.cosmetics.common.WCItems.MAIN;

public class WCBlocks {

    public static final DeferredRegistry<Block> BLOCKS = DeferredRegistry.create(WhoCosmetics.MOD_ID, Registry.BLOCK_REGISTRY);

    public static final RegistrySupplier<Block> CORAL_CHAIR = register("coral_chair", () -> new CoralChairBlock(BlockBehaviour.Properties.of(Material.STONE)), MAIN);
    public static final RegistrySupplier<Block> ROUNDEL_BLACK = register("roundel_black", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(2.0F).sound(SoundType.BONE_BLOCK)), MAIN);
    public static final RegistrySupplier<Block> ROUNDEL_BLACK_ELECTRICAL = register("roundel_black_electrical", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(2.0F).sound(SoundType.BONE_BLOCK)), MAIN);
    public static final RegistrySupplier<Block> ROUNDEL_ELECTRICAL = register("roundel_electrical", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(2.0F).sound(SoundType.BONE_BLOCK)), MAIN);
    public static final RegistrySupplier<Block> ROUNDEL_FIRE = register("roundel_fire", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(2.0F).sound(SoundType.BONE_BLOCK)), MAIN);
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_BOXED = register("roundel_gold_boxed", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(2.0F).sound(SoundType.BONE_BLOCK)), MAIN);
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_HEX = register("roundel_gold_hex", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(2.0F).sound(SoundType.BONE_BLOCK)), MAIN);
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_INNER = register("roundel_gold_inner", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(2.0F).sound(SoundType.BONE_BLOCK)), MAIN);
    public static final RegistrySupplier<Block> ROUNDEL_GREY = register("roundel_grey", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(2.0F).sound(SoundType.BONE_BLOCK)), MAIN);
    public static final RegistrySupplier<Block> ROUNDEL_GREY_CIRCULAR = register("roundel_grey_circurlar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(2.0F).sound(SoundType.BONE_BLOCK)), MAIN);
    public static final RegistrySupplier<Block> ROUNDEL_GREY_CIRCULAR_2 = register("roundel_grey_circurlar_2", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(2.0F).sound(SoundType.BONE_BLOCK)), MAIN);
    public static final RegistrySupplier<Block> ROUNDEL_GREY_HEX = register("roundel_grey_hex", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(2.0F).sound(SoundType.BONE_BLOCK)), MAIN);
    public static final RegistrySupplier<Block> ROUNDEL_TIME = register("roundel_time", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(2.0F).sound(SoundType.BONE_BLOCK)), MAIN);
    public static final RegistrySupplier<Block> ROUNDEL_CORAL = register("roundel_coral", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(2.0F).sound(SoundType.BONE_BLOCK)), MAIN);
    public static final RegistrySupplier<Block> ROUNDEL_CRYSTAL = register("roundel_crystal", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(2.0F).sound(SoundType.BONE_BLOCK)), MAIN);
    public static final RegistrySupplier<Block> ROUNDEL_CLASSIC = register("roundel_classic", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(2.0F).sound(SoundType.BONE_BLOCK)), MAIN);

    public static final RegistrySupplier<Block> ROUNDEL_CLASSIC_HALF = register("roundel_classic_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).strength(2.0F).sound(SoundType.BONE_BLOCK)), MAIN);

    public static final RegistrySupplier<Block> CLASSIC_DOORS = register("classic_doors", () -> new ClassicDoorsBlock(BlockBehaviour.Properties.of(Material.STONE)), MAIN);

    public static final RegistrySupplier<Block> TOYOTA_ROTOR = register("toyota_rotor", () -> new FacingEntityBlock(BlockBehaviour.Properties.of(Material.STONE), ToyotaRotorBlockEntity::new), MAIN);
    public static final RegistrySupplier<Block> CLASSIC_ROTOR = register("classic_rotor", () -> new FacingEntityBlock(BlockBehaviour.Properties.of(Material.STONE), ClassicRotorBlockEntity::new), MAIN);
    public static final RegistrySupplier<Block> WHIRLY_GIG = register("whirlygig", () -> new FacingEntityBlock(BlockBehaviour.Properties.of(Material.STONE), WhirlygigBlockEntity::new), MAIN);

    public static final RegistrySupplier<Block> VICTORIAN_MONITOR = register("victorian_monitor", () -> new MonitorBlock(BlockBehaviour.Properties.of(Material.DECORATION)), MAIN);
    public static final RegistrySupplier<Block> TUBE_LIGHT = register("tube_light", () -> new HorizontalBlockWC(BlockBehaviour.Properties.of(Material.DECORATION).noOcclusion()), MAIN);
    public static final RegistrySupplier<Block> NITRO_9 = register("nitro_9", () -> new Nitro9Block(BlockBehaviour.Properties.of(Material.DECORATION).noOcclusion()), MAIN);


    /**
     * Registers a Block and BlockItem to the ItemGroup of your choice
     */
    private static <T extends Block> RegistrySupplier<T> register(String id, Supplier<T> blockSupplier, CreativeModeTab itemGroup) {
        RegistrySupplier<T> RegistrySupplier = BLOCKS.register(id, blockSupplier);
        WCItems.ITEMS.register(id, () -> new BlockItem(RegistrySupplier.get(), new Item.Properties().tab(itemGroup)));
        return RegistrySupplier;
    }



    /**
     * Registers a Block without a BlockItem
     * <br> Use when you need a special BlockItem. The BlockItem should be registered in RItems with the same registry name as the block
     */
    private static <T extends Block> RegistrySupplier<T> registerBlockOnly(String id, Supplier<T> blockSupplier) {
        return BLOCKS.register(id, blockSupplier);
    }

    /**
     * Registers a Block and BlockItem into the Main ItemGroup
     */
    private static <T extends Block> RegistrySupplier<T> register(String id, Supplier<T> blockSupplier) {
        RegistrySupplier<T> RegistrySupplier = BLOCKS.register(id, blockSupplier);
        WCItems.ITEMS.register(id, () -> new BlockItem(RegistrySupplier.get(), new Item.Properties().tab(MAIN)));
        return RegistrySupplier;
    }

}
