package umpaz.brewinandchewin;

import umpaz.brewinandchewin.client.BCClientSetup;
import umpaz.brewinandchewin.common.BCCommonSetup;
import umpaz.brewinandchewin.common.registry.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(BrewinAndChewin.MODID)
public class BrewinAndChewin
{
	public static final String MODID = "brewinandchewin";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
	public static final RecipeBookType RECIPE_TYPE_FERMENTING = RecipeBookType.create("FERMENTING");

	public BrewinAndChewin() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		modEventBus.addListener(BCCommonSetup::init);
		modEventBus.addListener(BCClientSetup::init);

		//ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, FRConfiguration.COMMON_CONFIG);

		// sounds
		BCBlocks.BLOCKS.register(modEventBus);
		BCEffects.EFFECTS.register(modEventBus);
		// particles
		BCItems.ITEMS.register(modEventBus);
		// entities
		// enchantments
		BCBlockEntityTypes.TILES.register(modEventBus);
		BCMenuTypes.MENU_TYPES.register(modEventBus);
		BCRecipeTypes.RECIPE_TYPES.register(modEventBus);
		BCRecipeSerializers.RECIPE_SERIALIZERS.register(modEventBus);
		// Features
		BCCreativeTabs.CREATIVE_TABS.register(modEventBus);
		// Placement Modifiers
		// biome modifier
		// loot functions
		// loot modifiers

		MinecraftForge.EVENT_BUS.register(this);
	}
}
