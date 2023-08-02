package umpaz.brewinandchewin.common.integrations.jei;

import umpaz.brewinandchewin.BrewinAndChewin;
import umpaz.brewinandchewin.client.gui.KegScreen;
import umpaz.brewinandchewin.common.block.entity.container.KegMenu;
import umpaz.brewinandchewin.common.crafting.KegRecipe;
import umpaz.brewinandchewin.common.registry.BCItems;
import umpaz.brewinandchewin.common.registry.BCMenuTypes;
import umpaz.brewinandchewin.common.registry.BCRecipeTypes;
import umpaz.brewinandchewin.common.integrations.jei.category.FermentingRecipeCategory;

import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.registration.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.stream.Collectors;

@JeiPlugin
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
@SuppressWarnings("unused")
public class JEIPlugin implements IModPlugin {
    private static final ResourceLocation ID = new ResourceLocation(BrewinAndChewin.MODID, "jei_plugin");
    private static final Minecraft MC = Minecraft.getInstance();

    @Override
    public void registerCategories(IRecipeCategoryRegistration registry) {
        registry.addRecipeCategories(new FermentingRecipeCategory(registry.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        JEIModRecipes allRecipes = new JEIModRecipes();
        registration.addRecipes(JEIModRecipeTypes.FERMENTING, allRecipes.getKegRecipes());
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(BCItems.KEG.get()), JEIModRecipeTypes.FERMENTING);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(KegScreen.class, 78, 45, 31, 7, JEIModRecipeTypes.FERMENTING);
    }

    @Override
    public void registerRecipeTransferHandlers(IRecipeTransferRegistration registration) {
        //registration.addRecipeTransferHandler(KegContainer.class, BCRecipeTypes.FERMENTING, 0, 5, 7, 36);
    }

    @Override
    public ResourceLocation getPluginUid() {
        return ID;
    }
}
