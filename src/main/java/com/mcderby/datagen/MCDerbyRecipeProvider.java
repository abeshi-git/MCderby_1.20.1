package com.mcderby.datagen;

import com.mcderby.block.MCDerbyBlocks;
import com.mcderby.item.MCDerbyItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.level.ItemLike;

import java.util.function.Consumer;

public class MCDerbyRecipeProvider extends RecipeProvider {
    public MCDerbyRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pRecipeOutput) {
        nineBlockStorageRecipes(pRecipeOutput, RecipeCategory.MISC,
                MCDerbyItems.SHORT_WHIP.get(),
                RecipeCategory.BUILDING_BLOCKS,
                MCDerbyBlocks.WESTERN_TURF.get());
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> pRecipeOutput,
                                                  RecipeCategory pUnpackedCategory,
                                                  ItemLike pUnpacked,
                                                  RecipeCategory pPackedCategory,
                                                  ItemLike pPacked) {
        ShapelessRecipeBuilder.shapeless(pUnpackedCategory, pUnpacked, 9)
                .requires(pPacked).unlockedBy(getHasName(pPacked), has(pPacked)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(pPackedCategory, pPacked).define('#', pUnpacked)
                .pattern("###").pattern("###").pattern("###")
                .unlockedBy(getHasName(pUnpacked), has(pUnpacked)).save(pRecipeOutput);
    }
}
