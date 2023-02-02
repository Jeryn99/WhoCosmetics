package mc.craig.software.cosmetics.forge.data;

import mc.craig.software.cosmetics.common.WCBlocks;
import mc.craig.software.cosmetics.common.WCItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class RecipeProvider extends net.minecraft.data.recipes.RecipeProvider {
    public RecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(WCItems.FEZ.get()).pattern("GGG").pattern("G G").pattern("G G").define('G', ItemTags.WOOL).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.ASTRAKHAN.get()).pattern("BBB").pattern("B B").pattern("BBB").define('B', Blocks.BLACK_WOOL).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.BOW_TIE.get()).pattern("   ").pattern("BBB").pattern("   ").define('B', ItemTags.WOOL).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.RAINBOW_SCARF.get()).pattern("B B").pattern("B B").pattern("B B").define('B', ItemTags.WOOL).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.STRAW_HAT.get()).pattern("SSS").pattern("TTT").pattern("SSS").define('T', Tags.Items.STRING).define('S', Blocks.HAY_BLOCK).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);

        ShapedRecipeBuilder.shaped(WCItems.MONDAS.get()).pattern("IGI").pattern("I I").pattern("I I").define('I', Items.IRON_INGOT).define('G', Blocks.GLOWSTONE).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.SATCHEL.get()).pattern(" L ").pattern("LSL").pattern(" S ").define('L', Items.LEATHER).define('S', Items.STRING).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.THREED_GLASSES.get()).pattern("P P").pattern("BPR").pattern("   ").define('P', Items.PAPER).define('B', Blocks.BLUE_STAINED_GLASS_PANE).define('R', Blocks.RED_STAINED_GLASS_PANE).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.SCARF.get()).pattern("WWW").pattern("WSW").pattern("W W").define('W', Blocks.WHITE_WOOL).define('S', Items.STRING).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.UMBRELLA.get()).pattern("BBB").pattern(" R ").pattern(" R ").define('B', Blocks.BLACK_WOOL).define('R', Items.STICK).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.MAGNOLI.get()).pattern("S S").pattern("BSB").pattern("   ").define('S', Items.STICK).define('B', Blocks.GLASS_PANE).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.STETSON.get()).pattern(" S ").pattern("SSS").pattern("BBB").define('S', Blocks.BROWN_WOOL).define('B', Blocks.BLACK_WOOL).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.CRICKET_JACKET.get()).pattern("ZZZ").pattern("ZAZ").pattern("A A").define('Z', Blocks.YELLOW_WOOL).define('A', Items.RED_DYE).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.VELVET_COAT.get()).pattern("ZZZ").pattern("ZAZ").pattern("A A").define('Z', Blocks.GREEN_WOOL).define('A', Items.GREEN_DYE).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.FEATHER_HAT.get()).pattern(" F ").pattern("ZZZ").pattern("Z Z").define('F', Items.FEATHER).define('Z', ItemTags.WOOL).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.FRUIT_HAT.get()).pattern(" F ").pattern("ZZZ").pattern("Z Z").define('F', Items.APPLE).define('Z', ItemTags.WOOL).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.SASH.get()).pattern("GIG").pattern(" I ").pattern(" G ").define('G', Items.GOLD_INGOT).define('I', Items.IRON_INGOT).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.TENTH_COAT.get()).pattern("B B").pattern("BBB").pattern("B B").define('B', Blocks.BROWN_WOOL).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.RED_SCARF.get()).pattern("XXX").pattern("XSX").pattern("X X").define('X', Blocks.RED_WOOL).define('S', Items.STRING).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.SPACE_HELMET.get()).pattern("XXX").pattern("XSX").pattern("XXX").define('X', Items.IRON_INGOT).define('S', Blocks.GLASS_PANE).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.SPACE_CHEST.get()).pattern("S S").pattern("XXX").pattern("XXX").define('S', Items.IRON_INGOT).define('X', Blocks.RED_WOOL).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.SPACE_LEGS.get()).pattern("XXX").pattern("X X").pattern("S S").define('S', Items.IRON_INGOT).define('X', Blocks.RED_WOOL).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.SPACE_FEET.get()).pattern("X X").pattern("S S").pattern("   ").define('S', Items.IRON_INGOT).define('X', Blocks.RED_WOOL).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        //TODO ShapedRecipeBuilder.shaped(WCBlocks.WARDROBE.get()).pattern("WWW").pattern("D D").pattern("WWW").define('W', ItemTags.PLANKS).define('D', ItemTags.WOODEN_DOORS).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.GASMASK.get()).pattern("WWW").pattern("WWW").pattern("WDW").define('W', ItemTags.WOOL).define('D', Items.LEATHER).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);


        ShapedRecipeBuilder.shaped(WCBlocks.CORAL_CHAIR.get()).pattern("LWL").pattern(" L ").pattern(" I ").define('W', ItemTags.PLANKS).define('L', Items.LEATHER).define('I', Items.IRON_INGOT).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.RAINBOW_COAT.get()).pattern("W W").pattern("WWW").pattern("WWW").define('W', ItemTags.WOOL).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.UMBRELLA_MISSY.get()).pattern(" W ").pattern("WSW").pattern(" S ").define('S', Items.STICK).define('W', ItemTags.WOOL).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.ACES_BAT.get()).pattern(" I ").pattern(" I ").pattern(" G ").define('I', Items.IRON_INGOT).define('G', Items.STICK).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.SONIC_10.get()).pattern(" G ").pattern(" C ").pattern(" I ").define('I', Items.IRON_INGOT).define('G', Blocks.BLUE_STAINED_GLASS).define('C', Blocks.SANDSTONE).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.ANTLERS.get()).pattern("   ").pattern("B B").pattern("BOB").define('B', Items.BONE).define('O', Blocks.BONE_BLOCK).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.SONIC_13.get()).pattern("   ").pattern(" IO").pattern("I  ").define('I', Items.IRON_INGOT).define('O', Blocks.SHROOMLIGHT).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.SONIC_TROWEL.get()).pattern(" S ").pattern("BR ").pattern(" I ").define('I', Items.IRON_INGOT).define('R', Blocks.REDSTONE_WIRE).define('S', Items.STONE_SHOVEL).define('B', ItemTags.BUTTONS).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);

        ShapedRecipeBuilder.shaped(WCItems.SONIC_RIVER.get()).pattern(" G ").pattern(" S ").pattern(" V ").define('G', Blocks.RED_STAINED_GLASS).define('S', WCItems.SONIC_10.get()).define('V', Items.GOLD_INGOT).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.SECOND_JACKET.get()).pattern("W W").pattern("WSW").pattern("WWW").define('W', ItemTags.WOOL).define('S', Items.LEAD).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.TOP_HAT.get()).pattern("   ").pattern(" B ").pattern("CRC").define('B', Blocks.BLACK_WOOL).define('R', Blocks.RED_WOOL).define('C', Blocks.BLACK_CARPET).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.SONIC_12.get()).pattern(" G ").pattern(" L ").pattern(" V ").define('G', Items.BLUE_STAINED_GLASS).define('L', Items.LAPIS_LAZULI).define('V', Items.GOLD_INGOT).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);


        ShapedRecipeBuilder.shaped(WCItems.DAVROS_BLACK.get()).pattern(" I ").pattern("LIC").pattern("III").define('I', Items.IRON_INGOT).define('L', Blocks.LEVER).define('C', Items.LEATHER).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCItems.DAVROS_GOLD.get()).pattern(" I ").pattern("LIC").pattern("III").define('I', Items.GOLD_INGOT).define('L', Blocks.LEVER).define('C', Items.LEATHER).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(WCItems.EYE_STALK.get()).requires(Blocks.REDSTONE_WIRE).requires(Items.IRON_HELMET).requires(Items.SPYGLASS).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(WCItems.CELERY.get()).requires(ItemTags.SAPLINGS).requires(Items.STICK).requires(Items.STRING).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(WCItems.UNIT_BERRET_R.get()).requires(Ingredient.of(Items.STRING), 2).requires(Items.RED_WOOL, 2).requires(Items.BLACK_WOOL, 2).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(WCItems.UNIT_BERRET_G.get()).requires(Ingredient.of(Items.STRING), 2).requires(Items.GREEN_WOOL, 2).requires(Items.BLACK_WOOL, 2).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(WCItems.UNIT_BERRET_B.get()).requires(Ingredient.of(Items.STRING), 2).requires(Items.BLUE_WOOL, 2).requires(Items.BLACK_WOOL, 2).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);

        ShapedRecipeBuilder.shaped(WCBlocks.ROUNDEL_GREY.get(), 8).pattern("XXX").pattern("XSX").pattern("XXX").define('X', Blocks.QUARTZ_SLAB).define('S', Blocks.WHITE_CONCRETE).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCBlocks.ROUNDEL_GOLD_INNER.get(), 8).pattern("XXX").pattern("XSX").pattern("XXX").define('X', Blocks.SANDSTONE_SLAB).define('S', Blocks.WHITE_CONCRETE).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCBlocks.ROUNDEL_FIRE.get(), 8).pattern("XXX").pattern("XSX").pattern("XXX").define('X', Items.GOLD_NUGGET).define('S', Blocks.WHITE_CONCRETE).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCBlocks.ROUNDEL_BLACK_ELECTRICAL.get(), 8).pattern("XXX").pattern("XSX").pattern("XXX").define('X', Items.GOLD_NUGGET).define('S', Blocks.GRAY_CONCRETE).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCBlocks.ROUNDEL_BLACK.get(), 8).pattern("XXX").pattern("XSX").pattern("XXX").define('X', Blocks.QUARTZ_SLAB).define('S', Blocks.GRAY_CONCRETE).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCBlocks.ROUNDEL_CORAL.get(), 8).pattern("XXX").pattern("XSX").pattern("XXX").define('X', Items.GLOWSTONE_DUST).define('S', Blocks.SANDSTONE).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCBlocks.ROUNDEL_CRYSTAL.get(), 8).pattern("BBB").pattern("B B").pattern("BBB").define('B', Blocks.POLISHED_BLACKSTONE).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCBlocks.ROUNDEL_GREY_HEX.get(), 5).pattern(" A ").pattern("AAA").pattern(" A ").define('A', WCBlocks.ROUNDEL_GREY.get()).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCBlocks.ROUNDEL_GOLD_HEX.get(), 5).pattern(" A ").pattern("AAA").pattern(" A ").define('A', WCBlocks.ROUNDEL_GOLD_INNER.get()).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCBlocks.ROUNDEL_GOLD_BOXED.get(), 5).pattern(" A ").pattern("AAA").pattern(" A ").define('A', WCBlocks.ROUNDEL_FIRE.get()).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCBlocks.ROUNDEL_GREY_CIRCULAR.get(), 4).pattern(" A ").pattern("A A").pattern(" A ").define('A', WCBlocks.ROUNDEL_GREY.get()).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCBlocks.ROUNDEL_GREY_CIRCULAR_2.get(), 5).pattern("A A").pattern(" A ").pattern("A A").define('A', WCBlocks.ROUNDEL_GREY.get()).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCBlocks.ROUNDEL_ELECTRICAL.get(), 6).pattern("A A").pattern("A A").pattern("A A").define('A', WCBlocks.ROUNDEL_BLACK_ELECTRICAL.get()).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCBlocks.ROUNDEL_TIME.get(), 6).pattern("A A").pattern("A A").pattern("A A").define('A', WCBlocks.ROUNDEL_FIRE.get()).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
      /*  ShapedRecipeBuilder.shaped(WCBlocks.CLASSIC_DOORS.get(), 8).pattern("AA ").pattern("AA ").pattern("AA ").define('A', WCBlocks.ROUNDEL_GREY.get()).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
        ShapedRecipeBuilder.shaped(WCBlocks.TOYOTA_ROTOR.get(), 8).pattern(" W ").pattern(" A ").pattern(" W ").define('A', Blocks.ORANGE_STAINED_GLASS).define('W', Blocks.LIGHT_GRAY_CONCRETE).unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE)).save(consumer);
*/

    }
}