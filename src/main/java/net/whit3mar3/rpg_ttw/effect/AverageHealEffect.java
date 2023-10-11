package net.whit3mar3.rpg_ttw.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;


public class AverageHealEffect extends StatusEffect {
    protected AverageHealEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }
    @Override
        public void onApplied(LivingEntity newentity, AttributeContainer attributes, int amplifier) {
        newentity.heal(2);
            super.onApplied(newentity, attributes, amplifier);
        }
    }
