package brew.modid.sound;

import brew.modid.Brewsespresso;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.JukeboxSong;

public class BeSounds {

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

    public static void initialize() {
    }
}