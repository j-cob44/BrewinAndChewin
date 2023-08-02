package umpaz.brewinandchewin.common.registry;

import umpaz.brewinandchewin.BrewinAndChewin;
import umpaz.brewinandchewin.common.block.*;

import net.minecraft.world.level.block.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class BCBlocks
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BrewinAndChewin.MODID);

	// Workstations
	public static final RegistryObject<Block> KEG = BLOCKS.register("keg", KegBlock::new);


	// Food Blocks
	public static final RegistryObject<Block> CHEESE_PIZZA = BLOCKS.register("cheese_pizza", () -> new
			PizzaBlock(BCItems.CHEESE_PIZZA_SLICE, Block.Properties.copy(Blocks.CAKE)));

	public static final RegistryObject<Block> SUPREME_PIZZA = BLOCKS.register("supreme_pizza", () -> new
			PizzaBlock(BCItems.SUPREME_PIZZA_SLICE, Block.Properties.copy(Blocks.CAKE)));

	public static final RegistryObject<Block> FLAXEN_CHEESE_WHEEL = BLOCKS.register("flaxen_cheese_wheel", () -> new
			CheeseWheelBlock(BCItems.FLAXEN_CHEESE_WEDGE, Block.Properties.copy(Blocks.CAKE)));

	public static final RegistryObject<Block> SCARLET_CHEESE_WHEEL = BLOCKS.register("scarlet_cheese_wheel", () -> new
			CheeseWheelBlock(BCItems.SCARLET_CHEESE_WEDGE, Block.Properties.copy(Blocks.CAKE)));

	public static final RegistryObject<Block> UNRIPE_FLAXEN_CHEESE_WHEEL = BLOCKS.register("unripe_flaxen_cheese_wheel", () -> new
			UnripeCheeseWheelBlock(BCBlocks.FLAXEN_CHEESE_WHEEL, Block.Properties.copy(Blocks.CAKE)));

	public static final RegistryObject<Block> UNRIPE_SCARLET_CHEESE_WHEEL = BLOCKS.register("unripe_scarlet_cheese_wheel", () -> new
			UnripeCheeseWheelBlock(BCBlocks.SCARLET_CHEESE_WHEEL, Block.Properties.copy(Blocks.CAKE)));
}
