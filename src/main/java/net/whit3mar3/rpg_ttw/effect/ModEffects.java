package net.whit3mar3.rpg_ttw.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.whit3mar3.rpg_ttw.mixin.Rpg_ttw;

public class ModEffects {

    public static final StatusEffect LOW_HEAL = registerStatusEffects("low_heal", new LowHealEffect(StatusEffectCategory.BENEFICIAL,3093151));
    public static final StatusEffect AVERAGE_HEAL = registerStatusEffects("average_heal", new AverageHealEffect(StatusEffectCategory.BENEFICIAL,3093151));
    public static final StatusEffect HIGH_HEAL = registerStatusEffects("high_heal", new HighHealEffect(StatusEffectCategory.BENEFICIAL,3093151));

    private static StatusEffect registerStatusEffects (String name, StatusEffect statusEffect) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(Rpg_ttw.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        Rpg_ttw.LOGGER.info("Registering Mod Effects for " + Rpg_ttw.MOD_ID );
    }
}
