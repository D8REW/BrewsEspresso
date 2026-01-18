package brew.modid.payload;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;


public record EmitterParticlePayload(int entityId, ParticleOptions particle) implements CustomPacketPayload {

    public static final Type<EmitterParticlePayload> ID = new Type<>(Identifier.fromNamespaceAndPath("brewsespresso", "emitter_particle"));

    public static final StreamCodec<RegistryFriendlyByteBuf, EmitterParticlePayload> CODEC = StreamCodec.composite(
            StreamCodec.of((buf, val) -> buf.writeInt(val), buf -> buf.readInt()),
            EmitterParticlePayload::entityId,
            ParticleTypes.STREAM_CODEC,
            EmitterParticlePayload::particle,
            EmitterParticlePayload::new
    );

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return ID;
    }

    public static void send(ServerPlayer player, Entity entity, ParticleOptions particle) {
        ServerPlayNetworking.send(player, new EmitterParticlePayload(entity.getId(), particle));
    }
}