package net.whit3mar3.rpg_ttw.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;


public class HighHealEffect extends StatusEffect {
    protected HighHealEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }
    @Override
        public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
            entity.heal(4);
            super.onApplied(entity, attributes, amplifier);
        }
    }
