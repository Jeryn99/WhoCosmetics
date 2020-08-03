package com.whocraft.whocosmetics.data;

import com.whocraft.whocosmetics.common.WCItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.tags.ItemTags;

import java.io.IOException;
import java.util.function.Consumer;

public class RecipeCreation extends RecipeProvider {
    public RecipeCreation(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(WCItems.FEZ.get()).patternLine("GGG").patternLine("G G").patternLine("G G").key('G', ItemTags.WOOL).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(WCItems.STETSON.get()).patternLine("BBB").patternLine("GGG").patternLine("B B").key('B', Blocks.BROWN_WOOL).key('G', Blocks.BLACK_WOOL).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
    }

    @Override
    public void act(DirectoryCache p_200398_1_) throws IOException {
        super.act(p_200398_1_);
    }
}