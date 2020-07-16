package rusty.delve.tfc;

import static net.dries007.tfc.TerraFirmaCraft.MOD_ID;

import net.dries007.tfc.api.capability.metal.CapabilityMetalItem;
import net.dries007.tfc.api.capability.metal.MetalItemHandler;
import net.dries007.tfc.api.recipes.AlloyRecipe;
import net.dries007.tfc.api.recipes.BlastFurnaceRecipe;
import net.dries007.tfc.api.recipes.BloomeryRecipe;
import net.dries007.tfc.api.registries.TFCRegistries;
import net.dries007.tfc.api.registries.TFCRegistryEvent;
import net.dries007.tfc.api.types.Metal;
import net.dries007.tfc.objects.inventory.ingredient.IIngredient;
import net.dries007.tfc.types.DefaultMetals;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import rusty.delve.init.DelveItems;
import tfcmetallum.util.RegistryHandler;

@EventBusSubscriber 
public class DelveMetals {
	
	//Metal, tier, specific heat, melt temp, color, tool material, armor material
	public static final ResourceLocation CELESTINE = new ResourceLocation(MOD_ID, "celestine");
	
	public static final ResourceLocation ADAMANTIUM = new ResourceLocation(MOD_ID, "adamantium");
	public static final ResourceLocation ADAMANTINE = new ResourceLocation(MOD_ID, "adamantine");
	public static final ResourceLocation MANYULLYN = new ResourceLocation(MOD_ID, "manyullyn");
	
	public static final ResourceLocation MITHRIL = new ResourceLocation(MOD_ID, "mithril");
	public static final ResourceLocation NEPTUNIUM = new ResourceLocation(MOD_ID, "neptunium");
	public static final ResourceLocation PHOENIUM = new ResourceLocation(MOD_ID, "phoenium");
	public static final ResourceLocation TEMPORUM = new ResourceLocation(MOD_ID, "temporum");

	public static final ResourceLocation AURUM = new ResourceLocation(MOD_ID, "aurum");
	public static final ResourceLocation LEVIUM = new ResourceLocation(MOD_ID, "levium");
	
	public static final ResourceLocation COBALT = new ResourceLocation(MOD_ID, "cobalt");
	public static final ResourceLocation CHLOROPHYTE = new ResourceLocation(MOD_ID, "chlorophyte");
	public static final ResourceLocation ORICHALCUM = new ResourceLocation(MOD_ID, "orichalcum");
	public static final ResourceLocation TITANIRON = new ResourceLocation(MOD_ID, "titan_iron");

	public static final ResourceLocation ARDITE = new ResourceLocation(MOD_ID, "ardite");
	public static final ResourceLocation GRAVITITE = new ResourceLocation(MOD_ID, "gravitite");
	public static final ResourceLocation LUMIUM = new ResourceLocation(MOD_ID, "lumium");

	public static final ResourceLocation VIBRANIUM = new ResourceLocation(MOD_ID, "vibranium");
	
	@SubscribeEvent //Registers metals
    public static void onPreRegisterMetal(TFCRegistryEvent.RegisterPreBlock<Metal> event)
    {
        IForgeRegistry<Metal> r = event.getRegistry();
        r.registerAll(
        		//T7
                new Metal(CELESTINE, Metal.Tier.TIER_VI, true, 0.5f, 5000, 0xFFFFFFFF, null, null),
                //T6
                new Metal(ADAMANTINE, Metal.Tier.TIER_VI, true, 0.99f, 5000, 0xFFFF2433, null, null), 
                new Metal(ADAMANTIUM, Metal.Tier.TIER_VI, true, 0.99f, 5000, 0xFFFF2433, null, null), 
                new Metal(MANYULLYN, Metal.Tier.TIER_IV, true, 0.5f, 5000, 0xFF9220DF, null, null),
                //T5
                new Metal(MITHRIL, Metal.Tier.TIER_V, true, 0.5f, 5000, 0xFF50AAAB, null, null), 
                new Metal(NEPTUNIUM, Metal.Tier.TIER_V, true, 0.5f, 5000, 0xFF3D5BBE, null, null), 
                new Metal(PHOENIUM, Metal.Tier.TIER_V, true, 0.5f, 5000, 0xFFDD782A, null, null), 
                new Metal(TEMPORUM, Metal.Tier.TIER_V, true, 0.5f, 5000, 0xFF20CF51, null, null),
                //T4
                new Metal(AURUM, Metal.Tier.TIER_IV, true, 0.5f, 5000, 0xFFF4F928, null, null), 
                new Metal(LEVIUM, Metal.Tier.TIER_IV, true, 0.5f, 5000, 0xFFFF23F9, null, null), 
                //T3
                new Metal(COBALT, Metal.Tier.TIER_III, true, 0.5f, 5000, 0xFF278CC5, null, null),
                new Metal(CHLOROPHYTE, Metal.Tier.TIER_III, true, 0.5f, 5000, 0xFF0E9E29, null, null), 
                new Metal(ORICHALCUM, Metal.Tier.TIER_III, true, 0.5f, 5000, 0xFF783EA5, null, null),
                new Metal(TITANIRON, Metal.Tier.TIER_III, true, 0.5f, 5000, 0xFF3E8B99, null, null),
                //T2
                new Metal(ARDITE, Metal.Tier.TIER_II, true, 0.5f, 3000, 0xFFD7A80D, null, null),
                new Metal(GRAVITITE, Metal.Tier.TIER_II, true, 0.5f, 3000, 0xFFFF55C9, null, null), 
                new Metal(LUMIUM, Metal.Tier.TIER_II, true, 0.5f, 5000, 0xFFCDBF37, null, null),
                //T1
                new Metal(VIBRANIUM, Metal.Tier.TIER_I, true, 0.5f, 5000, 0xFF7CC2AC, null, null)
        );
    }
	
	public static void registerOreValues() { //Ore -> Metal
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.SMALL_ADAMANTINE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(ADAMANTINE), 10, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.POOR_ADAMANTINE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(ADAMANTINE), 15, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.NORMAL_ADAMANTINE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(ADAMANTINE), 25, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.RICH_ADAMANTINE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(ADAMANTINE), 35, true));
        
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.SMALL_GRAVITITE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(GRAVITITE), 10, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.POOR_GRAVITITE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(GRAVITITE), 15, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.NORMAL_GRAVITITE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(GRAVITITE), 25, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.RICH_GRAVITITE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(GRAVITITE), 35, true));
        
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.SMALL_VIBRANTINE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(VIBRANIUM), 10, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.POOR_VIBRANTINE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(VIBRANIUM), 15, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.NORMAL_VIBRANTINE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(VIBRANIUM), 25, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.RICH_VIBRANTINE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(VIBRANIUM), 35, true));
        
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.SMALL_COBALTITE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(RegistryHandler.COBALT), 10, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.POOR_COBALTITE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(RegistryHandler.COBALT), 15, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.NORMAL_COBALTITE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(RegistryHandler.COBALT), 25, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.RICH_COBALTITE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(RegistryHandler.COBALT), 35, true));
        
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.SMALL_ERYTHRITE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(RegistryHandler.COBALT), 10, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.POOR_ERYTHRITE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(RegistryHandler.COBALT), 15, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.NORMAL_ERYTHRITE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(RegistryHandler.COBALT), 25, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.RICH_ERYTHRITE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(RegistryHandler.COBALT), 35, true));
        
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.SMALL_NATIVE_ARDITE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(RegistryHandler.ARDITE), 10, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.POOR_NATIVE_ARDITE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(RegistryHandler.ARDITE), 15, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.NORMAL_NATIVE_ARDITE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(RegistryHandler.ARDITE), 25, true));
        CapabilityMetalItem.CUSTOM_METAL_ITEMS.put(IIngredient.of(DelveItems.RICH_NATIVE_ARDITE), () -> new MetalItemHandler(TFCRegistries.METALS.getValue(RegistryHandler.ARDITE), 35, true));
    }
	
	@SubscribeEvent //Alloys
    public static void onRegisterAlloyRecipe(RegistryEvent.Register<AlloyRecipe> event) {
        IForgeRegistry<AlloyRecipe> r = event.getRegistry();
        r.registerAll(
                new AlloyRecipe.Builder(MANYULLYN).add(COBALT, 0.2, 0.3).add(ARDITE, 0.2, 0.3).add(ORICHALCUM, 0.2, 0.3).add(DefaultMetals.BLACK_STEEL, 0.2, 0.3).build(),
                new AlloyRecipe.Builder(LEVIUM).add(GRAVITITE, 0.3, 0.4).add(DefaultMetals.LEAD, 0.3, 0.4).add(MITHRIL, 0.2, 0.3).build(),
                new AlloyRecipe.Builder(PHOENIUM).add(ARDITE, 0.2, 0.3).add(DefaultMetals.RED_STEEL, 0.2, 0.3).add(TEMPORUM, 0.1, 0.2).add(MITHRIL, 0.3, 0.4).build(),
                new AlloyRecipe.Builder(NEPTUNIUM).add(COBALT, 0.2, 0.3).add(DefaultMetals.BLUE_STEEL, 0.2, 0.3).add(TEMPORUM, 0.1, 0.2).add(MITHRIL, 0.3, 0.4).build(),
                new AlloyRecipe.Builder(TEMPORUM).add(VIBRANIUM, 0.2, 0.3).add(CHLOROPHYTE, 0.1, 0.2).add(MITHRIL, 0.3, 0.4).add(DefaultMetals.BISMUTH, 0.2, 0.3).build(),
                new AlloyRecipe.Builder(AURUM).add(LUMIUM, 0.0, 0.0).add(MITHRIL, 0.0, 0.0).add(RegistryHandler.OSMIUM, 0.0, 0.0).build(),
                new AlloyRecipe.Builder(TITANIRON).add(DefaultMetals.STEEL, 0.5, 0.6).add(RegistryHandler.ALUMINIUM, 0.2, 0.3).add(RegistryHandler.TITANIUM, 0.15, 0.2).add(RegistryHandler.TUNGSTEN, 0.05, 0.1).build()
        );
    }
	
	@SubscribeEvent //Bloomery
	public static void onRegisterBloomeryRecipeEvent(RegistryEvent.Register<BloomeryRecipe> event) {
        IForgeRegistry<BloomeryRecipe> registry = event.getRegistry();
        
        registry.register(new BloomeryRecipe(TFCRegistries.METALS.getValue(ADAMANTIUM), IIngredient.of(DelveItems.AMBROSINE_CHUNK)));
    }
	
	@SubscribeEvent //Blast Furnace
	public static void onRegisterBlastFurnaceRecipeEvent(RegistryEvent.Register<BlastFurnaceRecipe> event) {
        IForgeRegistry<BlastFurnaceRecipe> registry = event.getRegistry();
        
        registry.register(new BlastFurnaceRecipe(TFCRegistries.METALS.getValue(ADAMANTIUM), TFCRegistries.METALS.getValue(ADAMANTINE), IIngredient.of(DelveItems.AETHERFLUX)));
        registry.register(new BlastFurnaceRecipe(TFCRegistries.METALS.getValue(MITHRIL), TFCRegistries.METALS.getValue(TITANIRON), IIngredient.of(DelveItems.AETHERFLUX)));
    }
}
