package mc.craig.software.cosmetics.forge.data;

import mc.craig.software.cosmetics.WhoCosmetics;
import mc.craig.software.cosmetics.common.WCBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class ModelProviderBlock extends BlockStateProvider {

    public ModelProviderBlock(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, WhoCosmetics.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        for (Block value : ForgeRegistries.BLOCKS.getValues()) {
            if(ForgeRegistries.BLOCKS.getKey(value).getNamespace().matches(WhoCosmetics.MOD_ID)){
                simpleBlock(value);
            }
        }
    }


}