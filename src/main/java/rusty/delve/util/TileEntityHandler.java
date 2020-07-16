package rusty.delve.util;

import net.minecraftforge.fml.common.registry.GameRegistry;
import rusty.delve.aether.enchanter.TileEntityEnchanter;

public class TileEntityHandler {

	@SuppressWarnings("deprecation")
	public static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityEnchanter.class, "enchanter");
	}
}