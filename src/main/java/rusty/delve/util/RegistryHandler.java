package rusty.delve.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import rusty.delve.Delve;
import rusty.delve.init.DelveBlocks;
import rusty.delve.init.DelveItems;
import rusty.delve.init.OreBlocks;

@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		
		event.getRegistry().registerAll(DelveItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		
		event.getRegistry().registerAll(OreBlocks.BLOCKS.toArray(new Block[0]));
		event.getRegistry().registerAll(DelveBlocks.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		
		for(Item item : DelveItems.ITEMS)
		{
			Delve.proxy.registerItemRenderer(item, 0, "inventory");
		}
		
		for(Block block : OreBlocks.BLOCKS)
		{
			Delve.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
		}
	}
}