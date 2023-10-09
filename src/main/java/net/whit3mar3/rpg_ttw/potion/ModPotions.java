package net.whit3mar3.rpg_ttw.potion;

import net.minecraft.entity.effect.InstantStatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.whit3mar3.rpg_ttw.effect.ModEffects;
import net.whit3mar3.rpg_ttw.mixin.Rpg_ttw;

public class ModPotions {

    public static final Potion LOW_HEAL_POTION = registerPotion("low_quality_heal_potion",
            new Potion(new StatusEffectInstance(ModEffects.LOW_HEAL,1)));
    public static final Potion MIDDLE_HEAL_POTION = registerPotion("heal_potion",
            new Potion(new StatusEffectInstance(ModEffects.AVERAGE_HEAL, 1)));
    public static final Potion HIGH_HEAL_POTION = registerPotion("high_quality_heal_potion",
            new Potion(new StatusEffectInstance(ModEffects.HIGH_HEAL, 1)));

    private static Potion registerPotion(String name, Potion potion) {
        return Registry.register(Registry.POTION, new Identifier(Rpg_ttw.MOD_ID, name), potion);
    }
    public static void registerPotions() {
        Rpg_ttw.LOGGER.info("Registering Potions for "+ Rpg_ttw.MOD_ID);
    }

}
