package umpaz.brewinandchewin.common.tag;

import net.minecraftforge.registries.ForgeRegistries;
import umpaz.brewinandchewin.BrewinAndChewin;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;

public class BCTags {
    public static class Items {
        public static TagKey<Item> CHEESE = tag("cheese");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(BrewinAndChewin.MODID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
