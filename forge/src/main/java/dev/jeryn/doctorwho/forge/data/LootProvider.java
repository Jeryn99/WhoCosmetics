package dev.jeryn.doctorwho.forge.data;

import dev.jeryn.doctorwho.WhoCosmetics;
import dev.jeryn.doctorwho.common.WCBlocks;
import dev.jeryn.doctorwho.registry.RegistrySupplier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LootProvider extends LootTableProvider {

    public LootProvider(DataGenerator dataGenerator) {
        super(dataGenerator.getPackOutput(), Set.of(), List.of(new LootTableProvider.SubProviderEntry(ModBlockLoot::new, LootContextParamSets.BLOCK)));
    }


    public static class ModBlockLoot extends BlockLootSubProvider {
        protected ModBlockLoot() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
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