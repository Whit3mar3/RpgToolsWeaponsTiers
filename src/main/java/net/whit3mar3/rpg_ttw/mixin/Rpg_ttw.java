package net.whit3mar3.rpg_ttw.mixin;

import net.fabricmc.api.ModInitializer;
import net.whit3mar3.rpg_ttw.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rpg_ttw implements ModInitializer {
    public static final String MOD_ID = "rpg_ttw";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {

        ModItems.registerModItems();
    }
}
