package net.whit3mar3.rpg_ttw.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.whit3mar3.rpg_ttw.mixin.Rpg_ttw;

public class ModItemGroup {
    public static final ItemGroup RPG_TTW = FabricItemGroupBuilder.build(
            new Identifier(Rpg_ttw.MOD_ID, "rpg_ttw"), () -> new ItemStack(ModItems.PLATINUM_INGOT)
    );
}
