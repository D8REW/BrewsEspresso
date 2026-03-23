package brew.modid.entity;

import brew.modid.Brewsespresso;
import brew.modid.item.BeItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class BeEntityTypes {

    public static final EntityType<Boat> MAUVY_BOAT = register(
            "mauvy_boat",
            EntityType.Builder.<Boat>of(getBoatFactory(() -> BeItems.MAUVY_BOAT), MobCategory.MISC)
                    .noLootTable()
                    .sized(1.375F, 0.5625F)
                    .eyeHeight(0.5625F)
                    .clientTrackingRange(10)
    );

    public static final EntityType<ChestBoat> MAUVY_CHEST_BOAT = register(
            "mauvy_chest_boat",
            EntityType.Builder.<ChestBoat>of(getChestBoatFactory(() -> BeItems.MAUVY_CHEST_BOAT), MobCategory.MISC)
                    .noLootTable()
                    .sized(1.375F, 0.5625F)
                    .eyeHeight(0.5625F)
                    .clientTrackingRange(10)
    );

    private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        ResourceKey<EntityType<?>> key = ResourceKey.create(
                Registries.ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, name)
        );

        return Registry.register(BuiltInRegistries.ENTITY_TYPE, key, builder.build(key));
    }

    private static EntityType.EntityFactory<Boat> getBoatFactory(Supplier<Item> itemSupplier) {
        return (type, level) -> new Boat(type, level, itemSupplier);
    }

    private static EntityType.EntityFactory<ChestBoat> getChestBoatFactory(Supplier<Item> itemSupplier) {
        return (type, level) -> new ChestBoat(type, level, itemSupplier);
    }

    public static void initialize() {
    }
}