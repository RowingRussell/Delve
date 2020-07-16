package rusty.delve.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import rusty.delve.aether.enchanter.ContainerEnchanter;
import rusty.delve.aether.enchanter.GuiEnchanter;
import rusty.delve.aether.enchanter.TileEntityEnchanter;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == Reference.GUI_ENCHANTER) return new ContainerEnchanter(player.inventory, (TileEntityEnchanter)world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == Reference.GUI_ENCHANTER) return new GuiEnchanter(player.inventory, (TileEntityEnchanter)world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}
}
