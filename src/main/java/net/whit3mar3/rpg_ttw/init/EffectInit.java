package net.whit3mar3.rpg_ttw.init;


import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.registry.Registry;
import net.whit3mar3.rpg_ttw.effect.BleedEffect;
import net.whit3mar3.rpg_ttw.effect.StunEffect;

public class EffectInit {

    public static final StatusEffect STUN_EFFECT = new StunEffect(StatusEffectCategory.HARMFUL, 12221440);
    public static final StatusEffect BLEED_EFFECT = new BleedEffect(StatusEffectCategory.HARMFUL, 10303293);

    public static void init() {
        Registry.register(Registry.STATUS_EFFECT, "rpg_ttw:stun", STUN_EFFECT);
        Registry.register(Registry.STATUS_EFFECT, "rpg_ttw:bleed", BLEED_EFFECT);
    }

}