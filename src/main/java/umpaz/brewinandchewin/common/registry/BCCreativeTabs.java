package umpaz.brewinandchewin.common.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import umpaz.brewinandchewin.BrewinAndChewin;

public class BCCreativeTabs {

    public static DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BrewinAndChewin.MODID);
    public static final RegistryObject<CreativeModeTab> TAB_BREWINANDCHEWIN = CREATIVE_TABS.register("bccreativetab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemgroup."+ BrewinAndChewin.MODID + ".bccreativetab"))
                    .icon(() -> new ItemStack(BCItems.KEG.get()))
                    .displayItems((displayParams, output) -> {
                        BCItems.ITEMS.getEntries().forEach(Item -> output.accept(Item.get()));
                    })
                    .build()
    );
}
