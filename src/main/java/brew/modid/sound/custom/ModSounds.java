package brew.modid.sound.custom;

import brew.modid.Brewsespresso;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;

public class ModSounds {

    public static final ResourceKey<JukeboxSong> BREWS_MISCHIEF = ResourceKey.create(
            Registries.JUKEBOX_SONG,
            Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, "brews_mischief")
    );






    private static SoundEvent registerSound(String id) {
        Identifier identifier = Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, id);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, identifier, SoundEvent.createVariableRangeEvent(identifier));
    }



    public static void registerModSounds() {
        Brewsespresso.LOGGER.info("Registering Mod Sounds for " + Brewsespresso.MOD_ID);
    }
    public static void initialize() {
        // Calling this ensures the static fields are loaded
    }
}