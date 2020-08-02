package com.whocraft.whocosmetics.data;

import com.whocraft.whocosmetics.common.WCItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.tags.BlockTags;

import java.util.function.Consumer;

public class RecipeCreation extends RecipeProvider {
    public RecipeCreation(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        for (Block entry : BlockTags.WOOL.getAllElements()) {
            System.out.println(entry);
            ShapedRecipeBuilder.shapedRecipe(WCItems.FEZ.get()).patternLine("GGG").patternLine("G G").patternLine("G G").key('G', entry).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
        }
    }

}