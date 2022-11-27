package mc.craig.software.cosmetics.common;

import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.common.blocks.CoralChairBlock;
import mc.craig.software.cosmetics.registry.DeferredRegistry;
import mc.craig.software.cosmetics.registry.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import java.util.function.Supplier;

import static mc.craig.software.cosmetics.common.WCItems.MAIN;

public class WCBlocks {

    public static final DeferredRegistry<Block> BLOCKS = DeferredRegistry.create(WhoCosmetics.MOD_ID, Registry.BLOCK_REGISTRY);

    public static final RegistrySupplier<Block> CORAL_CHAIR = register("coral_chair", () -> new CoralChairBlock(BlockBehaviour.Properties.of(Material.STONE)), MAIN);


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
