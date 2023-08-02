package umpaz.brewinandchewin.common.registry;

import umpaz.brewinandchewin.BrewinAndChewin;
import umpaz.brewinandchewin.common.effect.*;

import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class BCEffects {

    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BrewinAndChewin.MODID);

    // Effects
    public static final RegistryObject<MobEffect> TIPSY = EFFECTS.register("tipsy", TipsyEffect::new);
    public static final RegistryObject<MobEffect> SWEET_HEART = EFFECTS.register("sweet_heart", SweetHeartEffect::new);
    public static final RegistryObject<MobEffect> SATISFACTION = EFFECTS.register("satisfaction", SatisfactionEffect::new);

}