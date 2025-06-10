package marbles.parabta;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;
import net.fabricmc.api.ClientModInitializer;

public class ParaBTA implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint, ClientModInitializer{
    public static final String MOD_ID = "parabta";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



    @Override
    public void onInitialize() {
        LOGGER.info("ParaBTA Core initialized.");

		new InitBasicBlocks().initBlocks();// Calls the initBasicBlocks class, initializing the blocks.

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

	@Override
	public void onInitializeClient() {
		new BlockModels();
	}
}
