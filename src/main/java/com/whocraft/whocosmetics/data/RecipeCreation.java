package com.whocraft.whocosmetics.data;

import com.whocraft.whocosmetics.common.WCItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;

import java.io.IOException;
import java.util.function.Consumer;

public class RecipeCreation extends RecipeProvider {
    public RecipeCreation(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(WCItems.FEZ.get()).patternLine("GGG").patternLine("G G").patternLine("G G").key('G', ItemTags.WOOL).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(WCItems.ASTRAKHAN.get()).patternLine("BBB").patternLine("B B").patternLine("BBB").key('B', Blocks.BLACK_WOOL).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(WCItems.BOW_TIE.get()).patternLine("   ").patternLine("BBB").patternLine("   ").key('B', ItemTags.WOOL).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(WCItems.RAINBOW_SCARF.get()).patternLine("B B").patternLine("B B").patternLine("B B").key('B', ItemTags.WOOL).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(WCItems.STRAW_HAT.get()).patternLine("SSS").patternLine("TTT").patternLine("SSS").key('T', Tags.Items.STRING).key('S', Blocks.HAY_BLOCK).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(WCItems.WINGS.get()).patternLine("S S").patternLine("SSS").patternLine(" S ").key('S', ItemTags.STONE_BRICKS).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(WCItems.MONDAS.get()).patternLine("IGI").patternLine("I I").patternLine("I I").key('I', Items.IRON_INGOT).key('G', Blocks.GLOWSTONE).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(WCItems.SATCHEL.get()).patternLine(" L ").patternLine("LSL").patternLine(" S ").key('L', Items.LEATHER).key('S', Items.STRING).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(WCItems.THREED_GLASSES.get()).patternLine("P P").patternLine("BPR").patternLine("   ").key('P', Items.PAPER).key('B', Blocks.BLUE_STAINED_GLASS_PANE).key('R', Blocks.RED_STAINED_GLASS_PANE).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(WCItems.SCARF.get()).patternLine("WWW").patternLine("WSW").patternLine("W W").key('W', Blocks.WHITE_WOOL).key('S', Items.STRING).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(WCItems.UMBRELLA.get()).patternLine("BBB").patternLine(" R ").patternLine(" R ").key('B', Blocks.BLACK_WOOL).key('R', Items.STICK).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(WCItems.MAGNOLI.get()).patternLine("S S").patternLine("BSB").patternLine("   ").key('S', Items.STICK).key('B', Blocks.GLASS_PANE).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(WCItems.STETSON.get()).patternLine(" S ").patternLine("SSS").patternLine("BBB").key('S', Blocks.BROWN_WOOL).key('B', Blocks.BLACK_WOOL).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(WCItems.CRICKET_JACKET.get()).patternLine("ZZZ").patternLine("ZAZ").patternLine("A A").key('Z', Blocks.YELLOW_WOOL).key('A', Items.RED_DYE).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(WCItems.CELERY.get()).addIngredient(ItemTags.SAPLINGS).addIngredient(Items.STICK).addIngredient(Items.STRING).addCriterion("has_crafting_table", this.hasItem(Blocks.CRAFTING_TABLE)).build(consumer);
    }

    @Override
    public void act(DirectoryCache cache) throws IOException {
        super.act(cache);
    }
}