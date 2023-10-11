package net.whit3mar3.rpg_ttw.util;

import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.whit3mar3.rpg_ttw.item.ModItems;

public class ModModelPredicateProvider {
    public static void registerModModels() {
        registerBow (ModItems.WOODEN_BOW);
        registerBow(ModItems.COPPER_BOW);
        registerBow(ModItems.IRON_BOW);
        registerBow(ModItems.NETHERITE_BOW);
        registerBow(ModItems.DRAGON_BOW);
        registerBow(ModItems.WARDEN_BOW);
        registerBow(ModItems.PLATINUM_BOW);
        registerBow(ModItems.DIVINIUM_BOW);

        ModelPredicateProviderRegistry.register(ModItems.WOODEN_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);
        ModelPredicateProviderRegistry.register(ModItems.WOODEN_SHIELD2, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);
        ModelPredicateProviderRegistry.register(ModItems.PINK_GARNET_SHIELD, new Identifier("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);

    }

    private static void registerBow(Item bow) {
        ModelPredicateProviderRegistry.register(bow,new Identifier("pull"),(stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0f;
            }
            if (entity.getActiveItem() != stack) {
                return 0.0f;
            }
            return (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0f;
        });
        ModelPredicateProviderRegistry.register(bow,new Identifier("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);
    }

}
