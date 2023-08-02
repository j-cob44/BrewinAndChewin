package umpaz.brewinandchewin.common.integrations.jei;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.item.crafting.RecipeManager;
import umpaz.brewinandchewin.common.crafting.KegRecipe;
import umpaz.brewinandchewin.common.registry.BCRecipeTypes;

import java.util.List;

public class JEIModRecipes {
    private final RecipeManager recipeManager;

    public JEIModRecipes() {
        Minecraft minecraft = Minecraft.getInstance();
        ClientLevel level = minecraft.level;

        if (level != null) {
            this.recipeManager = level.getRecipeManager();
        } else {
            throw new NullPointerException("minecraft world must not be null.");
        }
    }

    public List<KegRecipe> getKegRecipes() {
        return recipeManager.getAllRecipesFor(BCRecipeTypes.FERMENTING.get()).stream().toList();
    }
}
