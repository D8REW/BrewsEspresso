package brew.modid.sound;

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

    public static final ResourceKey<JukeboxSong> LUNAR_BLOOM = ResourceKey.create(
            Registries.JUKEBOX_SONG,
            Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, "lunar_bloom")
    );

    public static final ResourceKey<JukeboxSong> MURDER_IN_THE_AIR = ResourceKey.create(
            Registries.JUKEBOX_SONG,
            Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, "murder_in_the_air")
    );

    public static final SoundEvent LIVYATAN_CRIT_SOUND = registerSound("livyatan_crit_sound");
    public static final SoundEvent LIVYATAN_SWEEP_SOUND = registerSound("livyatan_sweep_sound");

    public static final SoundEvent BEHEMOTH_CRIT_SOUND = registerSound("behemoth_crit_sound");
    public static final SoundEvent BEHEMOTH_SWEEP_SOUND = registerSound("behemoth_sweep_sound");

    private static SoundEvent registerSound(String id) {
        Identifier identifier = Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, id);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, identifier, SoundEvent.createVariableRangeEvent(identifier));
    }

    public static void initialize() {
    }
}