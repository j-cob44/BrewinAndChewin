package umpaz.brewinandchewin.common.integrations.jei;

import umpaz.brewinandchewin.BrewinAndChewin;
import umpaz.brewinandchewin.common.crafting.KegRecipe;


import net.minecraftforge.registries.RegistryObject;
import mezz.jei.api.recipe.RecipeType;


public class JEIModRecipeTypes {
    public static final RecipeType<KegRecipe> FERMENTING = RecipeType.create(BrewinAndChewin.MODID, "fermenting", KegRecipe.class);
}
