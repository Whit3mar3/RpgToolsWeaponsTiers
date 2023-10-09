package net.whit3mar3.rpg_ttw.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.whit3mar3.rpg_ttw.mixin.Rpg_ttw;

public class ModItems {


    //Items
    public static final Item DRAGON_SCALE = registerItem("dragon_scale",
            new Item(new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item DRAGON_CLAW = registerItem("dragon_claw",
            new Item(new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item WARDEN_SHELL = registerItem("warden_shell",
            new Item(new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item WARDEN_CRYSTAL = registerItem("warden_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item PLATINUM_SCRAP = registerItem("platinum_scrap",
            new Item(new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item DIVINIUM = registerItem("divinium",
            new Item(new FabricItemSettings().group(ModItemGroup.RPG_TTW)));

//Tools

    public static final Item COOPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterial.COOPER, 2, 2f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item COOPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterial.COOPER, 1, 1f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item COOPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterial.COOPER, 1, 1f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item COOPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterial.COOPER, 1, 1f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));

    public static final Item DRAGON_SWORD = registerItem("dragon_sword",
            new SwordItem(ModToolMaterial.DRAGON_CLAW, 2, 2f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item DRAGON_PICKAXE = registerItem("dragon_pickaxe",
            new PickaxeItem(ModToolMaterial.DRAGON_CLAW, 1, 1f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item DRAGON_SHOVEL = registerItem("dragon_shovel",
            new ShovelItem(ModToolMaterial.DRAGON_CLAW, 1, 1f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item DRAGON_AXE = registerItem("dragon_axe",
            new AxeItem(ModToolMaterial.DRAGON_CLAW, 1, 1f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));

    public static final Item WARDEN_SWORD = registerItem("warden_sword",
        new SwordItem(ModToolMaterial.WARDEN_CRYSTAL, 2, 2f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item WARDEN_PICKAXE = registerItem("warden_pickaxe",
            new PickaxeItem(ModToolMaterial.WARDEN_CRYSTAL, 1, 1f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item WARDEN_SHOVEL = registerItem("warden_shovel",
            new ShovelItem(ModToolMaterial.WARDEN_CRYSTAL, 1, 1f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item WARDEN_AXE = registerItem("warden_axe",
            new AxeItem(ModToolMaterial.WARDEN_CRYSTAL, 1, 1f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));

    public static final Item PLATINUM_SWORD = registerItem("platinum_sword",
            new SwordItem(ModToolMaterial.PLATINUM, 2, 2f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item PLATINUM_PICKAXE = registerItem("platinum_pickaxe",
            new PickaxeItem(ModToolMaterial.PLATINUM, 1, 1f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item PLATINUM_SHOVEL = registerItem("platinum_shovel",
            new ShovelItem(ModToolMaterial.PLATINUM, 1, 1f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item PLATINUM_AXE = registerItem("platinum_axe",
            new AxeItem(ModToolMaterial.PLATINUM, 1, 1f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));

    public static final Item DIVINIUM_SWORD = registerItem("divinium_sword",
            new SwordItem(ModToolMaterial.DIVINIUM, 2, 2f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item DIVINIUM_PICKAXE = registerItem("divinium_pickaxe",
            new PickaxeItem(ModToolMaterial.DIVINIUM, 1, 1f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item DIVINIUM_SHOVEL = registerItem("divinium_shovel",
            new ShovelItem(ModToolMaterial.DIVINIUM, 1, 1f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item DIVINIUM_AXE = registerItem("divinium_axe",
            new AxeItem(ModToolMaterial.DIVINIUM, 1, 1f, new FabricItemSettings().group(ModItemGroup.RPG_TTW)));

//Armors

    public static final Item COPPER_HELMET = registerItem("copper_helmet",
        new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.HEAD,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.CHEST,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.LEGS,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.FEET,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));

    public static final Item DRAGON_HELMET = registerItem("dragon_helmet",
        new ArmorItem(ModArmorMaterial.DRAGON_SCALE, EquipmentSlot.HEAD,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item DRAGON_CHESTPLATE = registerItem("dragon_chestplate",
            new ArmorItem(ModArmorMaterial.DRAGON_SCALE, EquipmentSlot.CHEST,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item DRAGON_LEGGINGS = registerItem("dragon_leggings",
            new ArmorItem(ModArmorMaterial.DRAGON_SCALE, EquipmentSlot.LEGS,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item DRAGON_BOOTS = registerItem("dragon_boots",
      new ArmorItem(ModArmorMaterial.DRAGON_SCALE, EquipmentSlot.FEET,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));

    public static final Item WARDEN_HELMET = registerItem("warden_helmet",
            new ArmorItem(ModArmorMaterial.WARDEN_SHELL, EquipmentSlot.HEAD,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item WARDEN_CHESTPLATE = registerItem("warden_chestplate",
            new ArmorItem(ModArmorMaterial.WARDEN_SHELL, EquipmentSlot.CHEST,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item WARDEN_LEGGINGS = registerItem("warden_leggings",
            new ArmorItem(ModArmorMaterial.WARDEN_SHELL, EquipmentSlot.LEGS,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item WARDEN_BOOTS = registerItem("warden_boots",
            new ArmorItem(ModArmorMaterial.WARDEN_SHELL, EquipmentSlot.FEET,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));

    public static final Item PLATINUM_HELMET = registerItem("platinum_helmet",
            new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlot.HEAD,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item PLATINUM_CHESTPLATE = registerItem("platinum_chestplate",
            new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlot.CHEST,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item PLATINUM_LEGGINGS = registerItem("platinum_leggings",
            new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlot.LEGS,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item PLATINUM_BOOTS = registerItem("platinum_boots",
            new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlot.FEET,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));

    public static final Item DIVINIUM_HELMET = registerItem("divinium_helmet",
            new ArmorItem(ModArmorMaterial.DIVINIUM, EquipmentSlot.HEAD,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item DIVINIUM_CHESTPLATE = registerItem("divinium_chestplate",
            new ArmorItem(ModArmorMaterial.DIVINIUM, EquipmentSlot.CHEST,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item DIVINIUM_LEGGINGS = registerItem("divinium_leggings",
            new ArmorItem(ModArmorMaterial.DIVINIUM, EquipmentSlot.LEGS,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));
    public static final Item DIVINIUM_BOOTS = registerItem("divinium_boots",
            new ArmorItem(ModArmorMaterial.DIVINIUM, EquipmentSlot.FEET,new FabricItemSettings().group(ModItemGroup.RPG_TTW)));





    static Item registerItem(String name,Item item){
        return Registry.register(Registry.ITEM, new Identifier(Rpg_ttw.MOD_ID,name),item);
    }
    public static void registerModItems(){
        Rpg_ttw.LOGGER.debug("Registering Mod Item For " + Rpg_ttw.MOD_ID);
    }
}
