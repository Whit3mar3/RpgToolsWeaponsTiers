package net.whit3mar3.rpg_ttw.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.whit3mar3.rpg_ttw.mixin.Rpg_ttw;

public class ModItems {

    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.RPG_TTW)));

    public static final Item PLATINUM_SCRAP = registerItem("platinum_scrap",
            new Item(new FabricItemSettings().group(ModItemGroup.RPG_TTW)));

    static Item registerItem(String name,Item item){
        return Registry.register(Registry.ITEM, new Identifier(Rpg_ttw.MOD_ID,name),item);
    }
    public static void registerModItems(){
        Rpg_ttw.LOGGER.debug("Registering Mod Item For " + Rpg_ttw.MOD_ID);
    }
}
