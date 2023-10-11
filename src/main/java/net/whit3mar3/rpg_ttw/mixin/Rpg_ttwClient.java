package net.whit3mar3.rpg_ttw.mixin;

import net.fabricmc.api.ClientModInitializer;
import net.whit3mar3.rpg_ttw.util.ModModelPredicateProvider;

public class Rpg_ttwClient implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();
    }
}
