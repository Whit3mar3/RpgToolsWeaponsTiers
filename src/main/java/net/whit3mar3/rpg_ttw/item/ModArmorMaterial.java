package net.whit3mar3.rpg_ttw.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {

    //LVL of Armor --> fabric/leather/copper/iron/netherite/dragon/warden/platinum/divinium

    FABRIC("fabric", 5, new int[]{1, 1, 1, 1}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.COPPER_INGOT});
    }),
    DRAGON_SCALE("dragon_scale", 37, new int[]{4, 8, 10, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.5F, 0.2F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.DRAGON_SCALE});
    }),
    WARDEN_SHELL("warden_shell", 40, new int[]{3, 7, 9, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.5F, 0.2F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.WARDEN_SHELL});
    }),
    PLATINUM("platinum", 50, new int[]{4, 8, 10, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.5F, 0.2F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.PLATINUM_INGOT});
    }),
    DIVINIUM("divinium", 80, new int[]{5, 9, 11, 5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0F, 0.3F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.DIVINIUM});
    });


    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterial(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }


    @Override
    public int getDurability(EquipmentSlot slot) {
        return 0;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound() {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
