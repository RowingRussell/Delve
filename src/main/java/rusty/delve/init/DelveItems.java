package rusty.delve.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import rusty.delve.items.ItemBase;

@SideOnly(Side.CLIENT)
@EventBusSubscriber
public class DelveItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Ore items
	public static final Item SMALL_ADAMANTINE = new ItemBase("ore/small/adamantine");
	public static final Item POOR_ADAMANTINE = new ItemBase("ore/poor/adamantine");
	public static final Item NORMAL_ADAMANTINE = new ItemBase("ore/adamantine");
	public static final Item RICH_ADAMANTINE = new ItemBase("ore/rich/adamantine");
	public static final Item SMALL_COBALTITE = new ItemBase("ore/small/cobaltite");
	public static final Item POOR_COBALTITE = new ItemBase("ore/poor/cobaltite");
	public static final Item NORMAL_COBALTITE = new ItemBase("ore/cobaltite");
	public static final Item RICH_COBALTITE = new ItemBase("ore/rich/cobaltite");
	public static final Item SMALL_ERYTHRITE = new ItemBase("ore/small/erythrite");
	public static final Item POOR_ERYTHRITE = new ItemBase("ore/poor/erythrite");
	public static final Item NORMAL_ERYTHRITE = new ItemBase("ore/erythrite");
	public static final Item RICH_ERYTHRITE = new ItemBase("ore/rich/erythrite");
	public static final Item SMALL_GRAVITITE = new ItemBase("ore/small/gravitite");
	public static final Item POOR_GRAVITITE = new ItemBase("ore/poor/gravitite");
	public static final Item NORMAL_GRAVITITE = new ItemBase("ore/gravitite");
	public static final Item RICH_GRAVITITE = new ItemBase("ore/rich/gravitite");
	public static final Item SMALL_NATIVE_ARDITE = new ItemBase("ore/small/native_ardite");
	public static final Item POOR_NATIVE_ARDITE = new ItemBase("ore/poor/native_ardite");
	public static final Item NORMAL_NATIVE_ARDITE = new ItemBase("ore/native_ardite");
	public static final Item RICH_NATIVE_ARDITE = new ItemBase("ore/rich/native_ardite");
	public static final Item SMALL_VIBRANTINE = new ItemBase("ore/small/vibrantine");
	public static final Item POOR_VIBRANTINE = new ItemBase("ore/poor/vibrantine");
	public static final Item NORMAL_VIBRANTINE = new ItemBase("ore/vibrantine");
	public static final Item RICH_VIBRANTINE = new ItemBase("ore/rich/vibrantine");
	

	public static final Item AMBROSINE = new ItemBase("ore/ambrosine");
	public static final Item AMBROSINE_CHUNK = new ItemBase("ambrosine_chunk");
	public static final Item AMBROSINE_CRYSTAL = new ItemBase("ambrosine_crystal");
	
	//Powders
	public static final Item AETHERFLUX = new ItemBase("powder/aetherflux");
	public static final Item AETHERFLUX_CRYSTAL = new ItemBase("aetherflux");
	public static final Item AMBROSINE_DUST = new ItemBase("powder/ambrosine");
	public static final Item RIME_DUST = new ItemBase("powder/rime");
	public static final Item ZANITE_DUST = new ItemBase("powder/zanite");
    
	/*@SubscribeEvent // Variants for different metal blooms
	public static void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(new ItemBloom(true), 0, new ModelResourceLocation("tfc:bloom/refined/", "inventory"));
		ModelLoader.setCustomModelResourceLocation(new ItemBloom(false), 0, new ModelResourceLocation("tfc:bloom/unrefined/", "inventory"));
		
		ArrayList<String> blooms = new ArrayList<String>();
		blooms.add("adamantine");
		blooms.add("aluminium");
		blooms.add("ardite");
		blooms.add("cobalt");
		blooms.add("osmium");
		blooms.add("wrought_iron");
		
		ArrayList<ModelResourceLocation> refinedBlooms = new ArrayList<ModelResourceLocation>();
		ArrayList<ModelResourceLocation> unrefinedBlooms = new ArrayList<ModelResourceLocation>();
		
		for(String bloom : blooms) {
			ModelResourceLocation refined = new ModelResourceLocation(new ResourceLocation("tfc:bloom/refined" + bloom), "inventory");
			ModelResourceLocation unrefined = new ModelResourceLocation(new ResourceLocation("tfc:bloom/unrefined" + bloom), "inventory");
			refinedBlooms.add(refined);
			unrefinedBlooms.add(unrefined);
		}
		
		//ModelBakery.registerItemVariants(new ItemBloom(true), refinedBlooms.toArray(new ModelResourceLocation[blooms.size()]));
		//ModelBakery.registerItemVariants(new ItemBloom(false), unrefinedBlooms.toArray(new ModelResourceLocation[blooms.size()]));
		
		for(ResourceLocation bloom : refinedBlooms) { System.out.println(bloom.getPath()); }
		for(ResourceLocation bloom : unrefinedBlooms) { System.out.println(bloom.getPath()); }
	}*/
	
	
}