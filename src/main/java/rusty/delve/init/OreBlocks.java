package rusty.delve.init;

import java.util.ArrayList;
import java.util.List;

import com.legacy.aether.items.ItemsAether;
import net.dries007.tfc.api.registries.TFCRegistries;
import net.dries007.tfc.objects.items.metal.ItemOreTFC;
import net.dries007.tfc.types.DefaultMetals;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import rusty.delve.blocks.ore.AetherBase;
import rusty.delve.blocks.ore.EnderBase;
import rusty.delve.blocks.ore.NetherBase;
import tfcmetallum.util.RegistryHandler;
//import logictechcorp.netherex.init.NetherExItems;

public class OreBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block POOR_HOLYSTONE_ADAMANTINE = new AetherBase("poor_holystone_adamantine", Material.ROCK);
	public static final Block NORM_HOLYSTONE_ADAMANTINE = new AetherBase("norm_holystone_adamantine", Material.ROCK);
	public static final Block RICH_HOLYSTONE_ADAMANTINE = new AetherBase("rich_holystone_adamantine", Material.ROCK);
	public static final Block POOR_HOLYSTONE_COBALTITE = new AetherBase("poor_holystone_cobaltite", Material.ROCK);
	public static final Block NORM_HOLYSTONE_COBALTITE = new AetherBase("norm_holystone_cobaltite", Material.ROCK);
	public static final Block RICH_HOLYSTONE_COBALTITE = new AetherBase("rich_holystone_cobaltite", Material.ROCK);
	public static final Block POOR_HOLYSTONE_GRAVITITE = new AetherBase("poor_holystone_gravitite", Material.ROCK);
	public static final Block NORM_HOLYSTONE_GRAVITITE = new AetherBase("norm_holystone_gravitite", Material.ROCK);
	public static final Block RICH_HOLYSTONE_GRAVITITE = new AetherBase("rich_holystone_gravitite", Material.ROCK);
	public static final Block POOR_HOLYSTONE_HEMATITE = new AetherBase("poor_holystone_hematite", Material.ROCK);
	public static final Block NORM_HOLYSTONE_HEMATITE = new AetherBase("norm_holystone_hematite", Material.ROCK);
	public static final Block RICH_HOLYSTONE_HEMATITE = new AetherBase("rich_holystone_hematite", Material.ROCK);
	public static final Block POOR_HOLYSTONE_LIMONITE = new AetherBase("poor_holystone_limonite", Material.ROCK);
	public static final Block NORM_HOLYSTONE_LIMONITE = new AetherBase("norm_holystone_limonite", Material.ROCK);
	public static final Block RICH_HOLYSTONE_LIMONITE = new AetherBase("rich_holystone_limonite", Material.ROCK);
	public static final Block POOR_HOLYSTONE_MALACHITE = new AetherBase("poor_holystone_malachite", Material.ROCK);
	public static final Block NORM_HOLYSTONE_MALACHITE = new AetherBase("norm_holystone_malachite", Material.ROCK);
	public static final Block RICH_HOLYSTONE_MALACHITE = new AetherBase("rich_holystone_malachite", Material.ROCK);
	public static final Block POOR_HOLYSTONE_NATIVE_COPPER = new AetherBase("poor_holystone_native_copper", Material.ROCK);
	public static final Block NORM_HOLYSTONE_NATIVE_COPPER = new AetherBase("norm_holystone_native_copper", Material.ROCK);
	public static final Block RICH_HOLYSTONE_NATIVE_COPPER = new AetherBase("rich_holystone_native_copper", Material.ROCK);
	public static final Block POOR_HOLYSTONE_NATIVE_GOLD = new AetherBase("poor_holystone_native_gold", Material.ROCK);
	public static final Block NORM_HOLYSTONE_NATIVE_GOLD = new AetherBase("norm_holystone_native_gold", Material.ROCK);
	public static final Block RICH_HOLYSTONE_NATIVE_GOLD = new AetherBase("rich_holystone_native_gold", Material.ROCK);
	public static final Block POOR_HOLYSTONE_NATIVE_PLATINUM = new AetherBase("poor_holystone_native_platinum", Material.ROCK);
	public static final Block NORM_HOLYSTONE_NATIVE_PLATINUM = new AetherBase("norm_holystone_native_platinum", Material.ROCK);
	public static final Block RICH_HOLYSTONE_NATIVE_PLATINUM = new AetherBase("rich_holystone_native_platinum", Material.ROCK);
	public static final Block POOR_HOLYSTONE_NATIVE_SILVER = new AetherBase("poor_holystone_native_silver", Material.ROCK);
	public static final Block NORM_HOLYSTONE_NATIVE_SILVER = new AetherBase("norm_holystone_native_silver", Material.ROCK);
	public static final Block RICH_HOLYSTONE_NATIVE_SILVER = new AetherBase("rich_holystone_native_silver", Material.ROCK);
	public static final Block POOR_HOLYSTONE_RUTILE = new AetherBase("poor_holystone_rutile", Material.ROCK);
	public static final Block NORM_HOLYSTONE_RUTILE = new AetherBase("norm_holystone_rutile", Material.ROCK);
	public static final Block RICH_HOLYSTONE_RUTILE = new AetherBase("rich_holystone_rutile", Material.ROCK);
	public static final Block POOR_HOLYSTONE_VIBRANTINE = new AetherBase("poor_holystone_vibrantine", Material.ROCK);
	public static final Block NORM_HOLYSTONE_VIBRANTINE = new AetherBase("norm_holystone_vibrantine", Material.ROCK);
	public static final Block RICH_HOLYSTONE_VIBRANTINE = new AetherBase("rich_holystone_vibrantine", Material.ROCK);
	public static final Block HOLYSTONE_AMBROSINE = new AetherBase("holystone_ambrosine", Material.ROCK);
	public static final Block HOLYSTONE_RIME = new AetherBase("holystone_rime", Material.ROCK);
	public static final Block HOLYSTONE_ZANITE = new AetherBase("holystone_zanite", Material.ROCK);
	
	public static final Block POOR_NETHERRACK_NATIVE_ARDITE = new NetherBase("poor_netherrack_native_ardite", Material.ROCK);
	public static final Block NORM_NETHERRACK_NATIVE_ARDITE = new NetherBase("norm_netherrack_native_ardite", Material.ROCK);
	public static final Block RICH_NETHERRACK_NATIVE_ARDITE = new NetherBase("rich_netherrack_native_ardite", Material.ROCK);
	public static final Block POOR_NETHERRACK_ERYTHRITE = new NetherBase("poor_netherrack_erythrite", Material.ROCK);
	public static final Block NORM_NETHERRACK_ERYTHRITE = new NetherBase("norm_netherrack_erythrite", Material.ROCK);
	public static final Block RICH_NETHERRACK_ERYTHRITE = new NetherBase("rich_netherrack_erythrite", Material.ROCK);
	public static final Block POOR_NETHERRACK_RUTILE = new NetherBase("poor_netherrack_rutile", Material.ROCK);
	public static final Block NORM_NETHERRACK_RUTILE = new NetherBase("norm_netherrack_rutile", Material.ROCK);
	public static final Block RICH_NETHERRACK_RUTILE = new NetherBase("rich_netherrack_rutile", Material.ROCK);
	public static final Block POOR_NETHERRACK_GARNIERITE = new NetherBase("poor_netherrack_garnierite", Material.ROCK);
	public static final Block NORM_NETHERRACK_GARNIERITE = new NetherBase("norm_netherrack_garnierite", Material.ROCK);
	public static final Block RICH_NETHERRACK_GARNIERITE = new NetherBase("rich_netherrack_garnierite", Material.ROCK);
	public static final Block POOR_NETHERRACK_MAGNETITE = new NetherBase("poor_netherrack_magnetite", Material.ROCK);
	public static final Block NORM_NETHERRACK_MAGNETITE = new NetherBase("norm_netherrack_magnetite", Material.ROCK);
	public static final Block RICH_NETHERRACK_MAGNETITE = new NetherBase("rich_netherrack_magnetite", Material.ROCK);
	public static final Block POOR_NETHERRACK_HEMATITE = new NetherBase("poor_netherrack_hematite", Material.ROCK);
	public static final Block NORM_NETHERRACK_HEMATITE = new NetherBase("norm_netherrack_hematite", Material.ROCK);
	public static final Block RICH_NETHERRACK_HEMATITE = new NetherBase("rich_netherrack_hematite", Material.ROCK);
	public static final Block POOR_NETHERRACK_NATIVE_GOLD = new NetherBase("poor_netherrack_native_gold", Material.ROCK);
	public static final Block NORM_NETHERRACK_NATIVE_GOLD = new NetherBase("norm_netherrack_native_gold", Material.ROCK);
	public static final Block RICH_NETHERRACK_NATIVE_GOLD = new NetherBase("rich_netherrack_native_gold", Material.ROCK);
	public static final Block NETHERRACK_QUARTZ = new NetherBase("netherrack_quartz", Material.ROCK);
	public static final Block NETHERRACK_SULFUR = new NetherBase("netherrack_sulfur", Material.ROCK);
	
	public static final Block POOR_FIERY_NETHERRACK_ADAMANTINE = new NetherBase("poor_fiery_netherrack_adamantine", Material.ROCK);
	public static final Block NORM_FIERY_NETHERRACK_ADAMANTINE = new NetherBase("norm_fiery_netherrack_adamantine", Material.ROCK);
	public static final Block RICH_FIERY_NETHERRACK_ADAMANTINE = new NetherBase("rich_fiery_netherrack_adamantine", Material.ROCK);
	public static final Block POOR_FIERY_NETHERRACK_ERYTHRITE = new NetherBase("poor_fiery_netherrack_erythrite", Material.ROCK);
	public static final Block NORM_FIERY_NETHERRACK_ERYTHRITE = new NetherBase("norm_fiery_netherrack_erythrite", Material.ROCK);
	public static final Block RICH_FIERY_NETHERRACK_ERYTHRITE = new NetherBase("rich_fiery_netherrack_erythrite", Material.ROCK);
	public static final Block POOR_FIERY_NETHERRACK_GARNIERITE = new NetherBase("poor_fiery_netherrack_garnierite", Material.ROCK);
	public static final Block NORM_FIERY_NETHERRACK_GARNIERITE = new NetherBase("norm_fiery_netherrack_garnierite", Material.ROCK);
	public static final Block RICH_FIERY_NETHERRACK_GARNIERITE = new NetherBase("rich_fiery_netherrack_garnierite", Material.ROCK);
	public static final Block POOR_FIERY_NETHERRACK_HEMATITE = new NetherBase("poor_fiery_netherrack_hematite", Material.ROCK);
	public static final Block NORM_FIERY_NETHERRACK_HEMATITE = new NetherBase("norm_fiery_netherrack_hematite", Material.ROCK);
	public static final Block RICH_FIERY_NETHERRACK_HEMATITE = new NetherBase("rich_fiery_netherrack_hematite", Material.ROCK);
	public static final Block POOR_FIERY_NETHERRACK_MAGNETITE = new NetherBase("poor_fiery_netherrack_magnetite", Material.ROCK);
	public static final Block NORM_FIERY_NETHERRACK_MAGNETITE = new NetherBase("norm_fiery_netherrack_magnetite", Material.ROCK);
	public static final Block RICH_FIERY_NETHERRACK_MAGNETITE = new NetherBase("rich_fiery_netherrack_magnetite", Material.ROCK);
	public static final Block POOR_FIERY_NETHERRACK_NATIVE_PLATINUM = new NetherBase("poor_fiery_netherrack_native_platinum", Material.ROCK);
	public static final Block NORM_FIERY_NETHERRACK_NATIVE_PLATINUM = new NetherBase("norm_fiery_netherrack_native_platinum", Material.ROCK);
	public static final Block RICH_FIERY_NETHERRACK_NATIVE_PLATINUM = new NetherBase("rich_fiery_netherrack_native_platinum", Material.ROCK);
	public static final Block POOR_FIERY_NETHERRACK_RUTILE = new NetherBase("poor_fiery_netherrack_rutile", Material.ROCK);
	public static final Block NORM_FIERY_NETHERRACK_RUTILE = new NetherBase("norm_fiery_netherrack_rutile", Material.ROCK);
	public static final Block RICH_FIERY_NETHERRACK_RUTILE = new NetherBase("rich_fiery_netherrack_rutile", Material.ROCK);
	public static final Block FIERY_NETHERRACK_GRAPHITE = new NetherBase("fiery_netherrack_graphite", Material.ROCK);
	public static final Block FIERY_NETHERRACK_QUARTZ = new NetherBase("fiery_netherrack_quartz", Material.ROCK);
	public static final Block FIERY_NETHERRACK_SALTPETER = new NetherBase("fiery_netherrack_saltpeter", Material.ROCK);
	public static final Block FIERY_NETHERRACK_SULFUR = new NetherBase("fiery_netherrack_sulfur", Material.ROCK);
	public static final Block FIERY_NETHERRACK_SYLVITE = new NetherBase("fiery_netherrack_sylvite", Material.ROCK);
	
	public static final Block POOR_LIVELY_NETHERRACK_ERYTHRITE = new NetherBase("poor_lively_netherrack_erythrite", Material.ROCK);
	public static final Block NORM_LIVELY_NETHERRACK_ERYTHRITE = new NetherBase("norm_lively_netherrack_erythrite", Material.ROCK);
	public static final Block RICH_LIVELY_NETHERRACK_ERYTHRITE = new NetherBase("rich_lively_netherrack_erythrite", Material.ROCK);
	public static final Block POOR_LIVELY_NETHERRACK_GARNIERITE = new NetherBase("poor_lively_netherrack_garnierite", Material.ROCK);
	public static final Block NORM_LIVELY_NETHERRACK_GARNIERITE = new NetherBase("norm_lively_netherrack_garnierite", Material.ROCK);
	public static final Block RICH_LIVELY_NETHERRACK_GARNIERITE = new NetherBase("rich_lively_netherrack_garnierite", Material.ROCK);
	public static final Block POOR_LIVELY_NETHERRACK_HEMATITE = new NetherBase("poor_lively_netherrack_hematite", Material.ROCK);
	public static final Block NORM_LIVELY_NETHERRACK_HEMATITE = new NetherBase("norm_lively_netherrack_hematite", Material.ROCK);
	public static final Block RICH_LIVELY_NETHERRACK_HEMATITE = new NetherBase("rich_lively_netherrack_hematite", Material.ROCK);
	public static final Block POOR_LIVELY_NETHERRACK_NATIVE_ARDITE = new NetherBase("poor_lively_netherrack_native_ardite", Material.ROCK);
	public static final Block NORM_LIVELY_NETHERRACK_NATIVE_ARDITE = new NetherBase("norm_lively_netherrack_native_ardite", Material.ROCK);
	public static final Block RICH_LIVELY_NETHERRACK_NATIVE_ARDITE = new NetherBase("rich_lively_netherrack_native_ardite", Material.ROCK);
	public static final Block LIVELY_NETHERRACK_KAOLINITE = new NetherBase("lively_netherrack_kaolinite", Material.ROCK);
	public static final Block LIVELY_NETHERRACK_LIGNITE = new NetherBase("lively_netherrack_lignite", Material.ROCK);
	public static final Block LIVELY_NETHERRACK_QUARTZ = new NetherBase("lively_netherrack_quartz", Material.ROCK);
	public static final Block LIVELY_NETHERRACK_SULFUR = new NetherBase("lively_netherrack_sulfur", Material.ROCK);
	public static final Block LIVELY_NETHERRACK_SYLVITE = new NetherBase("lively_netherrack_sylvite", Material.ROCK);
	
	public static final Block POOR_GLOOMY_NETHERRACK_ERYTHRITE = new NetherBase("poor_gloomy_netherrack_erythrite", Material.ROCK);
	public static final Block NORM_GLOOMY_NETHERRACK_ERYTHRITE = new NetherBase("norm_gloomy_netherrack_erythrite", Material.ROCK);
	public static final Block RICH_GLOOMY_NETHERRACK_ERYTHRITE = new NetherBase("rich_gloomy_netherrack_erythrite", Material.ROCK);
	public static final Block POOR_GLOOMY_NETHERRACK_GARNIERITE = new NetherBase("poor_gloomy_netherrack_garnierite", Material.ROCK);
	public static final Block NORM_GLOOMY_NETHERRACK_GARNIERITE = new NetherBase("norm_gloomy_netherrack_garnierite", Material.ROCK);
	public static final Block RICH_GLOOMY_NETHERRACK_GARNIERITE = new NetherBase("rich_gloomy_netherrack_garnierite", Material.ROCK);
	public static final Block POOR_GLOOMY_NETHERRACK_HEMATITE = new NetherBase("poor_gloomy_netherrack_hematite", Material.ROCK);
	public static final Block NORM_GLOOMY_NETHERRACK_HEMATITE = new NetherBase("norm_gloomy_netherrack_hematite", Material.ROCK);
	public static final Block RICH_GLOOMY_NETHERRACK_HEMATITE = new NetherBase("rich_gloomy_netherrack_hematite", Material.ROCK);
	public static final Block POOR_GLOOMY_NETHERRACK_NATIVE_ARDITE = new NetherBase("poor_gloomy_netherrack_native_ardite", Material.ROCK);
	public static final Block NORM_GLOOMY_NETHERRACK_NATIVE_ARDITE = new NetherBase("norm_gloomy_netherrack_native_ardite", Material.ROCK);
	public static final Block RICH_GLOOMY_NETHERRACK_NATIVE_ARDITE = new NetherBase("rich_gloomy_netherrack_native_ardite", Material.ROCK);
	public static final Block GLOOMY_NETHERRACK_BORAX = new NetherBase("gloomy_netherrack_borax", Material.ROCK);
	public static final Block GLOOMY_NETHERRACK_KAOLINITE = new NetherBase("gloomy_netherrack_kaolinite", Material.ROCK);
	public static final Block GLOOMY_NETHERRACK_QUARTZ = new NetherBase("gloomy_netherrack_quartz", Material.ROCK);
	public static final Block GLOOMY_NETHERRACK_SULFUR = new NetherBase("gloomy_netherrack_sulfur", Material.ROCK);
	
	public static final Block POOR_ICY_NETHERRACK_BISMUTHINITE = new NetherBase("poor_icy_netherrack_bismuthinite", Material.ROCK);
	public static final Block NORM_ICY_NETHERRACK_BISMUTHINITE = new NetherBase("norm_icy_netherrack_bismuthinite", Material.ROCK);
	public static final Block RICH_ICY_NETHERRACK_BISMUTHINITE = new NetherBase("rich_icy_netherrack_bismuthinite", Material.ROCK);
	public static final Block POOR_ICY_NETHERRACK_CASSITERITE = new NetherBase("poor_icy_netherrack_cassiterite", Material.ROCK);
	public static final Block NORM_ICY_NETHERRACK_CASSITERITE = new NetherBase("norm_icy_netherrack_cassiterite", Material.ROCK);
	public static final Block RICH_ICY_NETHERRACK_CASSITERITE = new NetherBase("rich_icy_netherrack_cassiterite", Material.ROCK);
	public static final Block POOR_ICY_NETHERRACK_NATIVE_ARDITE = new NetherBase("poor_icy_netherrack_native_ardite", Material.ROCK);
	public static final Block NORM_ICY_NETHERRACK_NATIVE_ARDITE = new NetherBase("norm_icy_netherrack_native_ardite", Material.ROCK);
	public static final Block RICH_ICY_NETHERRACK_NATIVE_ARDITE = new NetherBase("rich_icy_netherrack_native_ardite", Material.ROCK);
	public static final Block POOR_ICY_NETHERRACK_NATIVE_COPPER = new NetherBase("poor_icy_netherrack_native_copper", Material.ROCK);
	public static final Block NORM_ICY_NETHERRACK_NATIVE_COPPER = new NetherBase("norm_icy_netherrack_native_copper", Material.ROCK);
	public static final Block RICH_ICY_NETHERRACK_NATIVE_COPPER = new NetherBase("rich_icy_netherrack_native_copper", Material.ROCK);
	public static final Block POOR_ICY_NETHERRACK_NATIVE_GOLD = new NetherBase("poor_icy_netherrack_native_gold", Material.ROCK);
	public static final Block NORM_ICY_NETHERRACK_NATIVE_GOLD = new NetherBase("norm_icy_netherrack_native_gold", Material.ROCK);
	public static final Block RICH_ICY_NETHERRACK_NATIVE_GOLD = new NetherBase("rich_icy_netherrack_native_gold", Material.ROCK);
	public static final Block POOR_ICY_NETHERRACK_NATIVE_SILVER = new NetherBase("poor_icy_netherrack_native_silver", Material.ROCK);
	public static final Block NORM_ICY_NETHERRACK_NATIVE_SILVER = new NetherBase("norm_icy_netherrack_native_silver", Material.ROCK);
	public static final Block RICH_ICY_NETHERRACK_NATIVE_SILVER = new NetherBase("rich_icy_netherrack_native_silver", Material.ROCK);
	public static final Block POOR_ICY_NETHERRACK_SPHALERITE = new NetherBase("poor_icy_netherrack_sphalerite", Material.ROCK);
	public static final Block NORM_ICY_NETHERRACK_SPHALERITE = new NetherBase("norm_icy_netherrack_sphalerite", Material.ROCK);
	public static final Block RICH_ICY_NETHERRACK_SPHALERITE = new NetherBase("rich_icy_netherrack_sphalerite", Material.ROCK);
	public static final Block POOR_ICY_NETHERRACK_TETRAHEDRITE = new NetherBase("poor_icy_netherrack_tetrahedrite", Material.ROCK);
	public static final Block NORM_ICY_NETHERRACK_TETRAHEDRITE = new NetherBase("norm_icy_netherrack_tetrahedrite", Material.ROCK);
	public static final Block RICH_ICY_NETHERRACK_TETRAHEDRITE = new NetherBase("rich_icy_netherrack_tetrahedrite", Material.ROCK);
	public static final Block POOR_ICY_NETHERRACK_ERYTHRITE = new NetherBase("poor_icy_netherrack_erythrite", Material.ROCK);
	public static final Block NORM_ICY_NETHERRACK_ERYTHRITE = new NetherBase("norm_icy_netherrack_erythrite", Material.ROCK);
	public static final Block RICH_ICY_NETHERRACK_ERYTHRITE = new NetherBase("rich_icy_netherrack_erythrite", Material.ROCK);
	public static final Block ICY_NETHERRACK_RIME = new NetherBase("icy_netherrack_rime", Material.ROCK);
	public static final Block ICY_NETHERRACK_QUARTZ = new NetherBase("icy_netherrack_quartz", Material.ROCK);
	
	public static final Block POOR_END_STONE_ADAMANTINE = new EnderBase("poor_end_stone_adamantine", Material.ROCK);
	public static final Block NORM_END_STONE_ADAMANTINE = new EnderBase("norm_end_stone_adamantine", Material.ROCK);
	public static final Block RICH_END_STONE_ADAMANTINE = new EnderBase("rich_end_stone_adamantine", Material.ROCK);
	public static final Block POOR_END_STONE_BISMUTHINITE = new EnderBase("poor_end_stone_bismuthinite", Material.ROCK);
	public static final Block NORM_END_STONE_BISMUTHINITE = new EnderBase("norm_end_stone_bismuthinite", Material.ROCK);
	public static final Block RICH_END_STONE_BISMUTHINITE = new EnderBase("rich_end_stone_bismuthinite", Material.ROCK);
	public static final Block POOR_END_STONE_CASSITERITE = new EnderBase("poor_end_stone_cassiterite", Material.ROCK);
	public static final Block NORM_END_STONE_CASSITERITE = new EnderBase("norm_end_stone_cassiterite", Material.ROCK);
	public static final Block RICH_END_STONE_CASSITERITE = new EnderBase("rich_end_stone_cassiterite", Material.ROCK);
	public static final Block POOR_END_STONE_COBALTITE = new EnderBase("poor_end_stone_cobaltite", Material.ROCK);
	public static final Block NORM_END_STONE_COBALTITE = new EnderBase("norm_end_stone_cobaltite", Material.ROCK);
	public static final Block RICH_END_STONE_COBALTITE = new EnderBase("rich_end_stone_cobaltite", Material.ROCK);
	public static final Block POOR_END_STONE_ERYTHRITE = new EnderBase("poor_end_stone_erythrite", Material.ROCK);
	public static final Block NORM_END_STONE_ERYTHRITE = new EnderBase("norm_end_stone_erythrite", Material.ROCK);
	public static final Block RICH_END_STONE_ERYTHRITE = new EnderBase("rich_end_stone_erythrite", Material.ROCK);
	public static final Block POOR_END_STONE_GARNIERITE = new EnderBase("poor_end_stone_garnierite", Material.ROCK);
	public static final Block NORM_END_STONE_GARNIERITE = new EnderBase("norm_end_stone_garnierite", Material.ROCK);
	public static final Block RICH_END_STONE_GARNIERITE = new EnderBase("rich_end_stone_garnierite", Material.ROCK);
	public static final Block POOR_END_STONE_GRAVITITE = new EnderBase("poor_end_stone_gravitite", Material.ROCK);
	public static final Block NORM_END_STONE_GRAVITITE = new EnderBase("norm_end_stone_gravitite", Material.ROCK);
	public static final Block RICH_END_STONE_GRAVITITE = new EnderBase("rich_end_stone_gravitite", Material.ROCK);
	public static final Block POOR_END_STONE_HEMATITE = new EnderBase("poor_end_stone_hematite", Material.ROCK);
	public static final Block NORM_END_STONE_HEMATITE = new EnderBase("norm_end_stone_hematite", Material.ROCK);
	public static final Block RICH_END_STONE_HEMATITE = new EnderBase("rich_end_stone_hematite", Material.ROCK);
	public static final Block POOR_END_STONE_LIMONITE = new EnderBase("poor_end_stone_limonite", Material.ROCK);
	public static final Block NORM_END_STONE_LIMONITE = new EnderBase("norm_end_stone_limonite", Material.ROCK);
	public static final Block RICH_END_STONE_LIMONITE = new EnderBase("rich_end_stone_limonite", Material.ROCK);
	public static final Block POOR_END_STONE_MAGNETITE = new EnderBase("poor_end_stone_magnetite", Material.ROCK);
	public static final Block NORM_END_STONE_MAGNETITE = new EnderBase("norm_end_stone_magnetite", Material.ROCK);
	public static final Block RICH_END_STONE_MAGNETITE = new EnderBase("rich_end_stone_magnetite", Material.ROCK);
	public static final Block POOR_END_STONE_MALACHITE = new EnderBase("poor_end_stone_malachite", Material.ROCK);
	public static final Block NORM_END_STONE_MALACHITE = new EnderBase("norm_end_stone_malachite", Material.ROCK);
	public static final Block RICH_END_STONE_MALACHITE = new EnderBase("rich_end_stone_malachite", Material.ROCK);
	public static final Block POOR_END_STONE_NATIVE_ARDITE = new EnderBase("poor_end_stone_native_ardite", Material.ROCK);
	public static final Block NORM_END_STONE_NATIVE_ARDITE = new EnderBase("norm_end_stone_native_ardite", Material.ROCK);
	public static final Block RICH_END_STONE_NATIVE_ARDITE = new EnderBase("rich_end_stone_native_ardite", Material.ROCK);
	public static final Block POOR_END_STONE_NATIVE_COPPER = new EnderBase("poor_end_stone_native_copper", Material.ROCK);
	public static final Block NORM_END_STONE_NATIVE_COPPER = new EnderBase("norm_end_stone_native_copper", Material.ROCK);
	public static final Block RICH_END_STONE_NATIVE_COPPER = new EnderBase("rich_end_stone_native_copper", Material.ROCK);
	public static final Block POOR_END_STONE_NATIVE_GOLD = new EnderBase("poor_end_stone_native_gold", Material.ROCK);
	public static final Block NORM_END_STONE_NATIVE_GOLD = new EnderBase("norm_end_stone_native_gold", Material.ROCK);
	public static final Block RICH_END_STONE_NATIVE_GOLD = new EnderBase("rich_end_stone_native_gold", Material.ROCK);
	public static final Block POOR_END_STONE_NATIVE_PLATINUM = new EnderBase("poor_end_stone_native_platinum", Material.ROCK);
	public static final Block NORM_END_STONE_NATIVE_PLATINUM = new EnderBase("norm_end_stone_native_platinum", Material.ROCK);
	public static final Block RICH_END_STONE_NATIVE_PLATINUM = new EnderBase("rich_end_stone_native_platinum", Material.ROCK);
	public static final Block POOR_END_STONE_NATIVE_SILVER = new EnderBase("poor_end_stone_native_silver", Material.ROCK);
	public static final Block NORM_END_STONE_NATIVE_SILVER = new EnderBase("norm_end_stone_native_silver", Material.ROCK);
	public static final Block RICH_END_STONE_NATIVE_SILVER = new EnderBase("rich_end_stone_native_silver", Material.ROCK);
	public static final Block POOR_END_STONE_SPHALERITE = new EnderBase("poor_end_stone_sphalerite", Material.ROCK);
	public static final Block NORM_END_STONE_SPHALERITE = new EnderBase("norm_end_stone_sphalerite", Material.ROCK);
	public static final Block RICH_END_STONE_SPHALERITE = new EnderBase("rich_end_stone_sphalerite", Material.ROCK);
	public static final Block POOR_END_STONE_VIBRANTINE = new EnderBase("poor_end_stone_vibrantine", Material.ROCK);
	public static final Block NORM_END_STONE_VIBRANTINE = new EnderBase("norm_end_stone_vibrantine", Material.ROCK);
	public static final Block RICH_END_STONE_VIBRANTINE = new EnderBase("rich_end_stone_vibrantine", Material.ROCK);
	public static final Block END_STONE_BORAX = new EnderBase("end_stone_borax", Material.ROCK);
	public static final Block END_STONE_CINNABAR = new EnderBase("end_stone_cinnabar", Material.ROCK);
	public static final Block END_STONE_GRAPHITE = new EnderBase("end_stone_graphite", Material.ROCK);
	public static final Block END_STONE_KAOLINITE = new EnderBase("end_stone_kaolinite", Material.ROCK);
	
	public static ItemStack getOreDrop(String name) {

		if(name.indexOf("ambrosine") >= 0) {
			return new ItemStack(ItemsAether.ambrosium_shard);
		}
		else if(name.indexOf("cinnabar") >= 0) {
			return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.CINNABAR)));
		}
		else if(name.indexOf("chlorophyte") >= 0) {
			return new ItemStack(Items.COAL);
		}
		else if(name.indexOf("graphite") >= 0) {
			return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.GRAPHITE)));
		}
		else if(name.indexOf("kaolinite") >= 0) {
			return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.KAOLINITE)));
		}
		else if(name.indexOf("lignite") >= 0) {
			return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.LIGNITE)));
		}
		else if(name.indexOf("quartz") >= 0) {
			return new ItemStack(Items.QUARTZ);
		}
		else if(name.indexOf("rime") >= 0) {
			//return new ItemStack(NetherExItems.RIME_CRYSTAL);
			return new ItemStack(Items.COAL);
		}
		else if(name.indexOf("saltpeter") >= 0) {
			return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.SALTPETER)));
		}
		else if(name.indexOf("sulfur") >= 0) {
			return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.SULFUR)));
		}
		else if(name.indexOf("sylvite") >= 0) {
			return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.SYLVITE)));
		}
		else if(name.indexOf("zanite") >= 0) {
			return new ItemStack(ItemsAether.zanite_gemstone);
		}
		else if(name.indexOf("poor") == 0)
		{
			if(name.indexOf("adamantine") != -1) {
				return new ItemStack(DelveItems.POOR_ADAMANTINE);
			}
			else if(name.indexOf("cobaltite") != -1) {
				return new ItemStack(DelveItems.POOR_COBALTITE);
			}
			else if(name.indexOf("erythrite") != -1) {
				return new ItemStack(DelveItems.POOR_ERYTHRITE);
			}
			else if(name.indexOf("gravitite") != -1) {
				return new ItemStack(DelveItems.POOR_GRAVITITE);
			}
			else if(name.indexOf("ardite") != -1) {
				return new ItemStack(DelveItems.POOR_NATIVE_ARDITE);
			}
			else if(name.indexOf("rutile") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(RegistryHandler.RUTILE)), 1, 1);
			}
			else if(name.indexOf("vibrantine") != -1) {
				return new ItemStack(DelveItems.POOR_VIBRANTINE);
			}
			else if(name.indexOf("bismuthinite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.BISMUTHINITE)), 1, 1);
			}
			else if(name.indexOf("cassiterite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.CASSITERITE)), 1, 1);
			}
			else if(name.indexOf("copper") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.NATIVE_COPPER)), 1, 1);
			}
			else if(name.indexOf("galena") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.GALENA)), 1, 1);
			}
			else if(name.indexOf("garnierite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.GARNIERITE)), 1, 1);
			}
			else if(name.indexOf("gold") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.NATIVE_GOLD)), 1, 1);
			}
			else if(name.indexOf("hematite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.HEMATITE)), 1, 1);
			}
			else if(name.indexOf("limonite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.LIMONITE)), 1, 1);
			}
			else if(name.indexOf("magnetite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.MAGNETITE)), 1, 1);
			}
			else if(name.indexOf("malachite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.MALACHITE)), 1, 1);
			}
			else if(name.indexOf("platinum") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.NATIVE_PLATINUM)), 1, 1);
			}
			else if(name.indexOf("silver") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.NATIVE_SILVER)), 1, 1);
			}
			else if(name.indexOf("sphalerite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.SPHALERITE)), 1, 1);
			}
			else if(name.indexOf("tetrahedrite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.TETRAHEDRITE)), 1, 1);
			}
			else return new ItemStack(Items.IRON_INGOT);
		}
		else if(name.indexOf("norm") == 0)
		{
			if(name.indexOf("adamantine") != -1) {
				return new ItemStack(DelveItems.NORMAL_ADAMANTINE);
			}
			else if(name.indexOf("cobaltite") != -1) {
				return new ItemStack(DelveItems.NORMAL_COBALTITE);
			}
			else if(name.indexOf("erythrite") != -1) {
				return new ItemStack(DelveItems.NORMAL_ERYTHRITE);
			}
			else if(name.indexOf("gravitite") != -1) {
				return new ItemStack(DelveItems.NORMAL_GRAVITITE);
			}
			else if(name.indexOf("ardite") != -1) {
				return new ItemStack(DelveItems.NORMAL_NATIVE_ARDITE);
			}
			else if(name.indexOf("rutile") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(RegistryHandler.RUTILE)));
			}
			else if(name.indexOf("vibrantine") != -1) {
				return new ItemStack(DelveItems.NORMAL_VIBRANTINE);
			}
			else if(name.indexOf("bismuthinite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.BISMUTHINITE)));
			}
			else if(name.indexOf("cassiterite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.CASSITERITE)));
			}
			else if(name.indexOf("copper") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.NATIVE_COPPER)));
			}
			else if(name.indexOf("galena") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.GALENA)));
			}
			else if(name.indexOf("garnierite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.GARNIERITE)));
			}
			else if(name.indexOf("gold") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.NATIVE_GOLD)));
			}
			else if(name.indexOf("hematite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.HEMATITE)));
			}
			else if(name.indexOf("limonite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.LIMONITE)));
			}
			else if(name.indexOf("magnetite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.MAGNETITE)));
			}
			else if(name.indexOf("malachite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.MALACHITE)));
			}
			else if(name.indexOf("platinum") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.NATIVE_PLATINUM)));
			}
			else if(name.indexOf("silver") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.NATIVE_SILVER)));
			}
			else if(name.indexOf("sphalerite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.SPHALERITE)));
			}
			else if(name.indexOf("tetrahedrite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.TETRAHEDRITE)));
			}
			else return new ItemStack(Items.GOLD_INGOT);
		}
		else if(name.indexOf("rich") == 0)
		{
			if(name.indexOf("adamantine") != -1) {
				return new ItemStack(DelveItems.RICH_ADAMANTINE);
			}
			else if(name.indexOf("cobaltite") != -1) {
				return new ItemStack(DelveItems.RICH_COBALTITE);
			}
			else if(name.indexOf("erythrite") != -1) {
				return new ItemStack(DelveItems.RICH_ERYTHRITE);
			}
			else if(name.indexOf("gravitite") != -1) {
				return new ItemStack(DelveItems.RICH_GRAVITITE);
			}
			else if(name.indexOf("ardite") != -1) {
				return new ItemStack(DelveItems.RICH_NATIVE_ARDITE);
			}
			else if(name.indexOf("rutile") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(RegistryHandler.RUTILE)), 1, 2);
			}
			else if(name.indexOf("vibrantine") != -1) {
				return new ItemStack(DelveItems.RICH_VIBRANTINE);
			}
			else if(name.indexOf("bismuthinite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.BISMUTHINITE)), 1, 2);
			}
			else if(name.indexOf("cassiterite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.CASSITERITE)), 1, 2);
			}
			else if(name.indexOf("copper") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.NATIVE_COPPER)), 1, 2);
			}
			else if(name.indexOf("galena") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.GALENA)), 1, 2);
			}
			else if(name.indexOf("garnierite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.GARNIERITE)), 1, 2);
			}
			else if(name.indexOf("gold") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.NATIVE_GOLD)), 1, 2);
			}
			else if(name.indexOf("hematite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.HEMATITE)), 1, 2);
			}
			else if(name.indexOf("limonite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.LIMONITE)), 1, 2);
			}
			else if(name.indexOf("magnetite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.MAGNETITE)), 1, 2);
			}
			else if(name.indexOf("malachite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.MALACHITE)), 1, 2);
			}
			else if(name.indexOf("platinum") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.NATIVE_PLATINUM)), 1, 2);
			}
			else if(name.indexOf("silver") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.NATIVE_SILVER)), 1, 2);
			}
			else if(name.indexOf("sphalerite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.SPHALERITE)), 1, 2);
			}
			else if(name.indexOf("tetrahedrite") != -1) {
				return new ItemStack(ItemOreTFC.get(TFCRegistries.ORES.getValue(DefaultMetals.TETRAHEDRITE)), 1, 2);
			}
			else return new ItemStack(Items.DIAMOND);
		}
		else return new ItemStack(Items.REDSTONE);
	}
}