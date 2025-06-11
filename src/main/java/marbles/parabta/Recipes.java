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

		RecipeBuilder.Shaped(ParaBTA.MOD_ID) //BONE BLOCK RECIPE
			.setShape("BB","BB")
			.addInput('B', Items.BONE)
			.create("bone_pile", new ItemStack(InitBasicBlocks.BONE_PILE, 4));

		RecipeBuilder.Shaped(ParaBTA.MOD_ID) //BONE FENCE RECIPE
			.setShape("PBP","PBP")
			.addInput('B', Items.BONE)
			.addInput('P', InitBasicBlocks.BONE_PILE)
			.create("bone_fence", new ItemStack(InitBasicBlocks.BONE_FENCE, 6));

		RecipeBuilder.Shaped(ParaBTA.MOD_ID) //MUD STAIRS RECIPE
			.setShape("  M"," MM","MMM")
			.addInput('M', InitBasicBlocks.MUD_BRICKS)
			.create("mud_stairs", new ItemStack(InitBasicBlocks.MUD_STAIRS, 6));
		RecipeBuilder.Shaped(ParaBTA.MOD_ID) //MUD SLAB RECIPE
			.setShape("MMM")
			.addInput('M', InitBasicBlocks.MUD_BRICKS)
			.create("mud_slab", new ItemStack(InitBasicBlocks.MUD_SLAB, 6));

		RecipeBuilder.Shaped(ParaBTA.MOD_ID) //STONE PILLAR RECIPE
			.setShape("S","S","S")
			.addInput('S', Blocks.STONE_POLISHED)
			.create("stone_pillar", new ItemStack(InitBasicBlocks.STONE_PILLAR, 3));
		RecipeBuilder.Shaped(ParaBTA.MOD_ID) //STONE Fence RECIPE
			.setShape("SCS","SCS")
			.addInput('S', Blocks.STONE_POLISHED)
			.addInput('C', Blocks.COBBLE_STONE)
			.create("stone_fence", new ItemStack(InitBasicBlocks.STONE_FENCE, 6));


		RecipeBuilder.Shaped(ParaBTA.MOD_ID) //Glowstone Torch RECIPE
			.setShape("G","S")
			.addInput('S', Items.STICK)
			.addInput('G', Items.DUST_GLOWSTONE)
			.create("glowstone_torch", new ItemStack(InitBasicBlocks.TORCH_GLOWSTONE, 4));
		RecipeBuilder.Shaped(ParaBTA.MOD_ID) //Glowstone Torch RECIPE
			.setShape("C","B")
			.addInput('B', Items.BONE)
			.addInput('C', Items.COAL)
			.create("glowstone_torch", new ItemStack(InitBasicBlocks.TORCH_BONE, 4));
	}

	@Override
	public void initNamespaces() {
		RecipeNamespace PARARECIPES = new RecipeNamespace();
		PARARECIPES.register("workbench", WORKBENCH);
		Registries.RECIPES.register("parabta", PARARECIPES);
	}
}
