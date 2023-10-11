package net.whit3mar3.rpg_ttw.potion;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.whit3mar3.rpg_ttw.effect.ModEffects;
import net.whit3mar3.rpg_ttw.item.ModItemGroup;
import net.whit3mar3.rpg_ttw.mixin.Rpg_ttw;

public class ModPotions {

    public static final Potion LOW_HEAL_POTION = registerPotion("low_quality_heal_potion",
            new Potion(new StatusEffectInstance(ModEffects.LOW_HEAL,1)),new FabricItemSettings().group(ModItemGroup.RPG_TTW));
    public static final Potion MIDDLE_HEAL_POTION = registerPotion("heal_potion",
            new Potion(new StatusEffectInstance(ModEffects.AVERAGE_HEAL, 1)), new FabricItemSettings().group(ModItemGroup.RPG_TTW));
    public static final Potion HIGH_HEAL_POTION = registerPotion("high_quality_heal_potion",
            new Potion(new StatusEffectInstance(ModEffects.HIGH_HEAL, 1)), new FabricItemSettings().group(ModItemGroup.RPG_TTW));

    private static Potion registerPotion(String name, Potion potion, FabricItemSettings group) {
        return Registry.register(Registry.POTION, new Identifier(Rpg_ttw.MOD_ID, name), potion);
    }
    public static void registerPotions() {
        Rpg_ttw.LOGGER.info("Registering Potions for "+ Rpg_ttw.MOD_ID);
    }

}
