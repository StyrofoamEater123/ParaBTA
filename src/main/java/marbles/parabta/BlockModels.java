package marbles.parabta;

import net.minecraft.client.render.block.model.*;
import turniplabs.halplibe.helper.ModelHelper;


public class BlockModels {
	public void initBlockModels(BlockModelDispatcher dispatcher){
		ModelHelper.setBlockModel(InitBasicBlocks.MUD_POLISHED, () -> new BlockModelStandard(InitBasicBlocks.MUD_POLISHED).setTex(0,"parabta:block/mud_polished"));
	}
}
