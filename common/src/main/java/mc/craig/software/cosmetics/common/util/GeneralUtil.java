package mc.craig.software.cosmetics.common.util;

import mc.craig.software.cosmetics.Platform;
import mc.craig.software.cosmetics.common.WCItems;
import mc.craig.software.cosmetics.registry.RegistrySupplier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.RecipeType;

import java.util.ArrayList;

public class GeneralUtil {

    public static void checkAllRecipes(){
        ArrayList<Item> arrayList = new ArrayList<Item>();
        for (RegistrySupplier<Item> itemsEntry : WCItems.ITEMS.getEntries()) {
            Item item = itemsEntry.get();
            boolean result = checkRecipe(item);
            if(!result){
                arrayList.add(item);
            }
        }
        System.out.println(arrayList);
    }

    public static boolean checkRecipe(Item item) {
        for (CraftingRecipe craftingRecipe : Platform.getServer().getRecipeManager().getAllRecipesFor(RecipeType.CRAFTING)) {
            if(craftingRecipe.getResultItem().getItem() == item){
                return true;
            }
        }
        return false;
    }

}
