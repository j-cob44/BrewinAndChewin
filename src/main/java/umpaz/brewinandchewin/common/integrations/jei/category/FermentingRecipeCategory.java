package umpaz.brewinandchewin.common.integrations.jei.category;

import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.crafting.Ingredient;
import umpaz.brewinandchewin.common.integrations.jei.JEIModRecipeTypes;
import umpaz.brewinandchewin.common.utility.BCTextUtils;
import umpaz.brewinandchewin.common.utility.RecipeUtils;
import vectorwing.farmersdelight.common.utility.ClientRenderUtils;
import vectorwing.farmersdelight.common.utility.TextUtils;

import umpaz.brewinandchewin.BrewinAndChewin;
import umpaz.brewinandchewin.common.crafting.KegRecipe;
import umpaz.brewinandchewin.common.registry.BCBlocks;
import umpaz.brewinandchewin.common.registry.BCItems;


import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.constants.VanillaTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FermentingRecipeCategory implements IRecipeCategory<KegRecipe> {
    protected final IDrawableAnimated arrow;
    private final Component title;
    private final IDrawable background;
    private final IDrawable icon;
    private final IDrawable frigid;
    private final IDrawable cold;
    private final IDrawable warm;
    private final IDrawable hot;

    public FermentingRecipeCategory(IGuiHelper helper) {
        title = BCTextUtils.getTranslation("jei.fermenting");
        ResourceLocation backgroundImage = new ResourceLocation(BrewinAndChewin.MODID, "textures/gui/jei/keg.png");
        background = helper.createDrawable(backgroundImage, 29, 16, 117, 57);
        icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(BCItems.KEG.get()));
        arrow = helper.drawableBuilder(backgroundImage, 176, 28, 33, 9)
                .buildAnimated(200, IDrawableAnimated.StartDirection.LEFT, false);
        frigid = helper.createDrawable(backgroundImage, 176, 0, 6, 3);
        cold = helper.createDrawable(backgroundImage, 182, 0, 7, 3);
        warm = helper.createDrawable(backgroundImage, 195, 0, 7, 3);
        hot = helper.createDrawable(backgroundImage, 202, 0, 7, 3);
    }

    @Override
    public RecipeType<KegRecipe> getRecipeType() {
        return JEIModRecipeTypes.FERMENTING;
    }

    @Override
    public Component getTitle() {
        return this.title;
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    // new and
    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, KegRecipe recipe, IFocusGroup focusGroup) {

        int totalIngredients = recipe.getIngredients().size();
        Ingredient liquid = recipe.getIngredients().get(totalIngredients-1);

        for(int i = 1; i < totalIngredients; i++)
        {
            if(i == 1)
                builder.addSlot(RecipeIngredientRole.INPUT, 4, 12).addIngredients(recipe.getIngredients().get(0));
            else if (i == 2)
                builder.addSlot(RecipeIngredientRole.INPUT, 22, 12).addIngredients(recipe.getIngredients().get(1));
            else if (i == 3)
                builder.addSlot(RecipeIngredientRole.INPUT, 4, 30).addIngredients(recipe.getIngredients().get(2));
            else if (i == 4)
                builder.addSlot(RecipeIngredientRole.INPUT, 22, 30).addIngredients(recipe.getIngredients().get(3));

        }

        builder.addSlot(RecipeIngredientRole.INPUT, 56, 2).addIngredients(liquid); // Liquid
        builder.addSlot(RecipeIngredientRole.OUTPUT, 93, 7).addItemStack(RecipeUtils.getResultItem(recipe));
    }

    @Override
    public void draw(KegRecipe recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics gui, double mouseX, double mouseY) {
        arrow.draw(gui, 48, 28);
        if (recipe.getTemperature().equals("frigid")) {
            frigid.draw(gui, 48, 23);
            cold.draw(gui, 54, 23);
        }
        if (recipe.getTemperature().equals("cold")) {
            cold.draw(gui, 54, 23);
        }
        if (recipe.getTemperature().equals("warm")) {
            warm.draw(gui, 67, 23);
        }
        if (recipe.getTemperature().equals("hot")) {
            hot.draw(gui, 74, 23);
            warm.draw(gui, 67, 23);
        }
    }
}