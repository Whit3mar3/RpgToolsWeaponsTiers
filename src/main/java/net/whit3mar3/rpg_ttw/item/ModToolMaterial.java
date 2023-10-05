package net.whit3mar3.rpg_ttw.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {

    COOPER(2, 200, 3.0F, 1.0F, 13, () -> {return Ingredient.ofItems(new ItemConvertible[]{Items.COPPER_INGOT});}),
    DRAGON_CLAW(5, 3500, 10.0F, 6.0F, 25, () -> {return Ingredient.ofItems(new ItemConvertible[]{ModItems.DRAGON_CLAW});}),
    WARDEN_CRYSTAL(5, 3800, 11.0F, 7.0F, 25, () -> {return Ingredient.ofItems(new ItemConvertible[]{ModItems.WARDEN_CRYSTAL});}),
    PLATINUM(5, 4062, 12.0F, 8.0F, 10, () -> {return Ingredient.ofItems(new ItemConvertible[]{ModItems.PLATINUM_INGOT});}),
    DIVINIUM(5, 8062, 15.0F, 10.0F, 10, () -> {return Ingredient.ofItems(new ItemConvertible[]{ModItems.DIVINIUM});});

        private final int miningLevel;
        private final int itemDurability;
        private final float miningSpeed;
        private final float attackDamage;
        private final int enchantability;
        private final Lazy<Ingredient> repairIngredient;

        private ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
            this.miningLevel = miningLevel;
            this.itemDurability = itemDurability;
            this.miningSpeed = miningSpeed;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairIngredient = new Lazy(repairIngredient);
        }

        public int getDurability() {
            return this.itemDurability;
        }

        public float getMiningSpeedMultiplier() {
            return this.miningSpeed;
        }

        public float getAttackDamage() {
            return this.attackDamage;
        }

        public int getMiningLevel() {
            return this.miningLevel;
        }

        public int getEnchantability() {
            return this.enchantability;
        }

        public Ingredient getRepairIngredient() {
            return (Ingredient)this.repairIngredient.get();
        }
    }

