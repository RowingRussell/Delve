package rusty.delve.init;

import net.minecraftforge.oredict.OreDictionary;

public class OreDict {

	public static void registerOres() {
		OreDictionary.registerOre("oreAdamantiumSmall", DelveItems.SMALL_ADAMANTINE);
		OreDictionary.registerOre("oreAdamantiumPoor", DelveItems.POOR_ADAMANTINE);
		OreDictionary.registerOre("oreAdamantiumNormal", DelveItems.NORMAL_ADAMANTINE);
		OreDictionary.registerOre("oreAdamantiumRich", DelveItems.RICH_ADAMANTINE);
		
		OreDictionary.registerOre("oreCobaltSmall", DelveItems.SMALL_COBALTITE);
		OreDictionary.registerOre("oreCobaltPoor", DelveItems.POOR_COBALTITE);
		OreDictionary.registerOre("oreCobaltNormal", DelveItems.NORMAL_COBALTITE);
		OreDictionary.registerOre("oreCobaltRich", DelveItems.RICH_COBALTITE);

		OreDictionary.registerOre("oreCobaltSmall", DelveItems.SMALL_ERYTHRITE);
		OreDictionary.registerOre("oreCobaltPoor", DelveItems.POOR_ERYTHRITE);
		OreDictionary.registerOre("oreCobaltNormal", DelveItems.NORMAL_ERYTHRITE);
		OreDictionary.registerOre("oreCobaltRich", DelveItems.RICH_ERYTHRITE);

		OreDictionary.registerOre("oreArditeSmall", DelveItems.SMALL_NATIVE_ARDITE);
		OreDictionary.registerOre("oreArditePoor", DelveItems.POOR_NATIVE_ARDITE);
		OreDictionary.registerOre("oreArditeNormal", DelveItems.NORMAL_NATIVE_ARDITE);
		OreDictionary.registerOre("oreArditeRich", DelveItems.RICH_NATIVE_ARDITE);

		OreDictionary.registerOre("oreGravititeSmall", DelveItems.SMALL_GRAVITITE);
		OreDictionary.registerOre("oreGravititePoor", DelveItems.POOR_GRAVITITE);
		OreDictionary.registerOre("oreGravititeNormal", DelveItems.NORMAL_GRAVITITE);
		OreDictionary.registerOre("oreGravititeRich", DelveItems.RICH_GRAVITITE);

		OreDictionary.registerOre("oreVibraniumSmall", DelveItems.SMALL_VIBRANTINE);
		OreDictionary.registerOre("oreVibraniumPoor", DelveItems.POOR_VIBRANTINE);
		OreDictionary.registerOre("oreVibraniumNormal", DelveItems.NORMAL_VIBRANTINE);
		OreDictionary.registerOre("oreVibraniumRich", DelveItems.RICH_VIBRANTINE);
	}
}
