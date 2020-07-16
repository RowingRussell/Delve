package rusty.delve;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import rusty.delve.init.OreDict;
import rusty.delve.tfc.DelveMetals;
import rusty.delve.util.CommonProxy;
import rusty.delve.util.GuiHandler;
import rusty.delve.util.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Delve {
	
	@Instance
	public static Delve instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		DelveMetals.registerOreValues();
		OreDict.registerOres();
		NetworkRegistry.INSTANCE.registerGuiHandler(Delve.instance, new GuiHandler());
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
}
