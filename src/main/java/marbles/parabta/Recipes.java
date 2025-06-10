package marbles.parabta;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.data.registry.recipe.RecipeRegistry;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryRepairable;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class Recipes implements RecipeEntrypoint {
	public static final RecipeGroup<RecipeEntryCrafting<?, ?>> WORKBENCH = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Blocks.WORKBENCH)));



	@Override
	public void onRecipesReady() {
		RecipeBuilder.Shaped(ParaBTA.MOD_ID) //MUD BRICKS RECIPE
			.setShape("MM","MM")
			.addInput('M', Blocks.MUD_BAKED)
			.create("baked_mud_bricks", new ItemStack(InitBasicBlocks.MUD_BRICKS, 4));

		RecipeBuilder.Shaped(ParaBTA.MOD_ID) //MUD TILES RECIPE
			.setShape("M","M")
			.addInput('M', Blocks.MUD_BAKED)
			.create("baked_mud_polished", new ItemStack(InitBasicBlocks.MUD_POLISHED, 2));
	}

	@Override
	public void initNamespaces() {
		RecipeNamespace PARARECIPES = new RecipeNamespace();
		PARARECIPES.register("workbench", WORKBENCH);
		Registries.RECIPES.register("parabta", PARARECIPES);
	}
}
