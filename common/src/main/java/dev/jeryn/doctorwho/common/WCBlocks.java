package dev.jeryn.doctorwho.common;

import dev.jeryn.doctorwho.WhoCosmetics;
import dev.jeryn.doctorwho.common.blockentity.ClassicRotorBlockEntity;
import dev.jeryn.doctorwho.common.blockentity.ToyotaRotorBlockEntity;
import dev.jeryn.doctorwho.common.blockentity.WhirlygigBlockEntity;
import dev.jeryn.doctorwho.common.blocks.*;
import dev.jeryn.doctorwho.registry.DeferredRegistry;
import dev.jeryn.doctorwho.registry.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class WCBlocks {

    public static final DeferredRegistry<Block> BLOCKS = DeferredRegistry.create(WhoCosmetics.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> CORAL_CHAIR = register("coral_chair", () -> new CoralChairBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistrySupplier<Block> ROUNDEL_BLACK = register("roundel_black", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_BLACK_ELECTRICAL = register("roundel_black_electrical", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_ELECTRICAL = register("roundel_electrical", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_FIRE = register("roundel_fire", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_BOXED = register("roundel_gold_boxed", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_HEX = register("roundel_gold_hex", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_INNER = register("roundel_gold_inner", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY = register("roundel_grey", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_CIRCULAR = register("roundel_grey_circurlar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_CIRCULAR_2 = register("roundel_grey_circurlar_2", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_HEX = register("roundel_grey_hex", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_TIME = register("roundel_time", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_CORAL = register("roundel_coral", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_CRYSTAL = register("roundel_crystal", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_CLASSIC = register("roundel_classic", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_WARGAMES = register("roundel_wargames", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_HARTNELL = register("roundel_hartnell", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_VICTORIAN = register("roundel_victorian", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));


    public static final RegistrySupplier<Block> ROUNDEL_CLASSIC_HALF = register("roundel_classic_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_WARGAMES_HALF = register("roundel_wargames_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_BLACK_HALF = register("roundel_black_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_BLACK_ELECTRICAL_HALF = register("roundel_black_electrical_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_ELECTRICAL_HALF = register("roundel_electrical_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_FIRE_HALF = register("roundel_fire_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_BOXED_HALF = register("roundel_gold_boxed_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_HEX_HALF = register("roundel_gold_hex_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_INNER_HALF = register("roundel_gold_inner_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_HALF = register("roundel_grey_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_CIRCULAR_HALF = register("roundel_grey_circurlar_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_CIRCULAR_2_HALF = register("roundel_grey_circurlar_2_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_HEX_HALF = register("roundel_grey_hex_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_TIME_HALF = register("roundel_time_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_CORAL_HALF = register("roundel_coral_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_CRYSTAL_HALF = register("roundel_crystal_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_HARTNELL_HALF = register("roundel_hartnell_half", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));

    public static final RegistrySupplier<Block> ROUNDEL_WARGAMES_ENDCAP = register("roundel_wargames_endcap", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_BLACK_ENDCAP = register("roundel_black_endcap", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_BLACK_ELECTRICAL_ENDCAP = register("roundel_black_electrical_endcap", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_BOXED_ENDCAP = register("roundel_gold_boxed_endcap", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_HEX_ENDCAP = register("roundel_gold_hex_endcap", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_INNER_ENDCAP = register("roundel_gold_inner_endcap", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_ENDCAP = register("roundel_grey_endcap", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_CIRCULAR_ENDCAP = register("roundel_grey_circurlar_endcap", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_CIRCULAR_2_ENDCAP = register("roundel_grey_circurlar_2_endcap", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_HEX_ENDCAP = register("roundel_grey_hex_endcap", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_TIME_ENDCAP = register("roundel_time_endcap", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_CORAL_ENDCAP = register("roundel_coral_endcap", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_CRYSTAL_ENDCAP = register("roundel_crystal_endcap", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_HARTNELL_HALF_ENDCAP = register("roundel_hartnell_half_endcap", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));


    public static final RegistrySupplier<Block> ROUNDEL_BLACK_SLAB = register("roundel_black_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_BLACK_ELECTRICAL_SLAB = register("roundel_black_electrical_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_ELECTRICAL_SLAB = register("roundel_electrical_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_FIRE_SLAB = register("roundel_fire_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_BOXED_SLAB = register("roundel_gold_boxed_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_HEX_SLAB = register("roundel_gold_hex_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_INNER_SLAB = register("roundel_gold_inner_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_SLAB = register("roundel_grey_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_CIRCULAR_SLAB = register("roundel_grey_circurlar_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_CIRCULAR_2_SLAB = register("roundel_grey_circurlar_2_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_HEX_SLAB = register("roundel_grey_hex_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_TIME_SLAB = register("roundel_time_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_CORAL_SLAB = register("roundel_coral_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_CRYSTAL_SLAB = register("roundel_crystal_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_CLASSIC_SLAB = register("roundel_classic_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_WARGAMES_SLAB = register("roundel_wargames_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_HARTNELL_SLAB = register("roundel_hartnell_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));

    public static final RegistrySupplier<Block> ROUNDEL_BLACK_SLAB_TOP_HALF = register("roundel_black_top_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_BLACK_ELECTRICAL_TOP_HALF = register("roundel_black_electrical_top_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_ELECTRICAL_TOP_HALF = register("roundel_electrical_top_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_FIRE_TOP_HALF = register("roundel_fire_top_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_BOXED_TOP_HALF = register("roundel_gold_boxed_top_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_HEX_TOP_HALF = register("roundel_gold_hex_top_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_INNER_TOP_HALF = register("roundel_gold_inner_top_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_TOP_HALF = register("roundel_grey_top_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_CIRCULAR_TOP_HALF = register("roundel_grey_circular_top_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_CIRCULAR_2_TOP_HALF = register("roundel_grey_circular_2_top_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_HEX_TOP_HALF = register("roundel_grey_hex_top_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_TIME_TOP_HALF = register("roundel_time_top_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_CORAL_TOP_HALF = register("roundel_coral_top_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_CRYSTAL_TOP_HALF = register("roundel_crystal_top_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_CLASSIC_TOP_HALF = register("roundel_classic_top_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_WARGAMES_TOP_HALF = register("roundel_wargames_top_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_HARTNELL_TOP_HALF = register("roundel_hartnell_top_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));

    public static final RegistrySupplier<Block> ROUNDEL_BLACK_SLAB_BOTTOM_HALF = register("roundel_black_bottom_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_BLACK_ELECTRICAL_BOTTOM_HALF = register("roundel_black_electrical_bottom_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_ELECTRICAL_BOTTOM_HALF = register("roundel_electrical_bottom_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_FIRE_BOTTOM_HALF = register("roundel_fire_bottom_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_BOXED_BOTTOM_HALF = register("roundel_gold_boxed_bottom_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_HEX_BOTTOM_HALF = register("roundel_gold_hex_bottom_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GOLD_INNER_BOTTOM_HALF = register("roundel_gold_inner_bottom_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_BOTTOM_HALF = register("roundel_grey_bottom_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_CIRCULAR_BOTTOM_HALF = register("roundel_grey_circular_bottom_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_CIRCULAR_2_BOTTOM_HALF = register("roundel_grey_circular_2_bottom_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_GREY_HEX_BOTTOM_HALF = register("roundel_grey_hex_bottom_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_TIME_BOTTOM_HALF = register("roundel_time_bottom_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_CORAL_BOTTOM_HALF = register("roundel_coral_bottom_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_CRYSTAL_BOTTOM_HALF = register("roundel_crystal_bottom_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_CLASSIC_BOTTOM_HALF = register("roundel_classic_bottom_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_WARGAMES_BOTTOM_HALF = register("roundel_wargames_bottom_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));
    public static final RegistrySupplier<Block> ROUNDEL_HARTNELL_BOTTOM_HALF = register("roundel_hartnell_bottom_half", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F).sound(SoundType.BONE_BLOCK)));


    public static final RegistrySupplier<Block> CLASSIC_DOORS = register("classic_doors", () -> new ClassicDoorsBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noCollission()));
    public static final RegistrySupplier<Block> CLASSIC_DOORS_BLACK = register("classic_doors_black", () -> new ClassicDoorsBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noCollission()));
    public static final RegistrySupplier<Block> CLASSIC_DOORS_GREY = register("classic_doors_grey", () -> new ClassicDoorsBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noCollission()));
    public static final RegistrySupplier<Block> CLASSIC_DOORS_HARTNELL = register("classic_doors_hartnell", () -> new ClassicDoorsBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noCollission()));
    public static final RegistrySupplier<Block> CLASSIC_DOORS_MASTER = register("classic_doors_master", () -> new ClassicDoorsBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noCollission()));
    public static final RegistrySupplier<Block> CLASSIC_DOORS_VICTORIAN = register("classic_doors_victorian", () -> new ClassicDoorsBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noCollission()));
    public static final RegistrySupplier<Block> CLASSIC_DOORS_WARGAMES = register("classic_doors_wargames", () -> new ClassicDoorsBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noCollission()));

    public static final RegistrySupplier<Block> TOYOTA_ROTOR = register("toyota_rotor", () -> new FacingEntityBlock(BlockBehaviour.Properties.copy(Blocks.STONE), ToyotaRotorBlockEntity::new));
    public static final RegistrySupplier<Block> CLASSIC_ROTOR = register("classic_rotor", () -> new FacingEntityBlock(BlockBehaviour.Properties.copy(Blocks.STONE), ClassicRotorBlockEntity::new));
    public static final RegistrySupplier<Block> WHIRLY_GIG = register("whirlygig", () -> new FacingEntityBlock(BlockBehaviour.Properties.copy(Blocks.STONE), WhirlygigBlockEntity::new));

    public static final RegistrySupplier<Block> VICTORIAN_MONITOR = register("victorian_monitor", () -> new MonitorBlock(BlockBehaviour.Properties.of()));
    public static final RegistrySupplier<Block> TUBE_LIGHT = register("tube_light", () -> new HorizontalBlockWC(BlockBehaviour.Properties.of().noOcclusion().lightLevel(value -> 15)));
    public static final RegistrySupplier<Block> NITRO_9 = register("nitro_9", () -> new Nitro9Block(BlockBehaviour.Properties.of().noOcclusion()));


    /**
     * Registers a Block and BlockItem to the ItemGroup of your choice
     */
    private static <T extends Block> RegistrySupplier<T> register(String id, Supplier<T> blockSupplier, CreativeModeTab itemGroup) {
        RegistrySupplier<T> RegistrySupplier = BLOCKS.register(id, blockSupplier);
        WCItems.ITEMS.register(id, () -> new BlockItem(RegistrySupplier.get(), new Item.Properties()));
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
        WCItems.ITEMS.register(id, () -> new BlockItem(RegistrySupplier.get(), new Item.Properties()));
        return RegistrySupplier;
    }

}
