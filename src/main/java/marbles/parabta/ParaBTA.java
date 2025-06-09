package marbles.parabta;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.block.model.BlockModelTorch;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicTorch;
import net.minecraft.core.block.material.Material;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class ParaBTA implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint {
    public static final String MOD_ID = "parabta";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Block mudBricks;
	public static Block mudPolished;

    @Override
    public void onInitialize() {
        LOGGER.info("ParaBTA Core initialized.");



    }

	@Override
	public void onRecipesReady() {

	}

	@Override
	public void initNamespaces() {

	}

	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {

	}
}
