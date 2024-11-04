package mc.craig.software.cosmetics.forge.data;

import com.mojang.datafixers.util.Pair;
import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.common.WCBlocks;
import mc.craig.software.cosmetics.registry.RegistrySupplier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.packs.VanillaBlockLoot;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LootProvider extends LootTableProvider {



    public LootProvider(DataGenerator dataGenerator) {
        super(dataGenerator.getPackOutput(), Set.of(), List.of(new LootTableProvider.SubProviderEntry(ModBlockLoot::new, LootContextParamSets.BLOCK)));
    }


    public static class ModBlockLoot extends BlockLootSubProvider {
        protected ModBlockLoot() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags(), );
        }

        @Override
        protected void generate() {
            for (Block block : getKnownBlocks()) {
                dropSelf(block);
            }
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            ArrayList<@NotNull Block> blocks = new ArrayList<>();
            for (RegistrySupplier<Block> entry : WCBlocks.BLOCKS.getEntries()) {
                ResourceLocation blockId = BuiltInRegistries.BLOCK.getKey(entry.get());
                if (blockId.toString().contains(WhoCosmetics.MOD_ID)) {
                    blocks.add(entry.get());
                }
            }
            return blocks;
        }
    }

}