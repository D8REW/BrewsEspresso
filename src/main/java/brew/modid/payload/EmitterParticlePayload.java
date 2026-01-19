package brew.modid.payload;

import brew.modid.Brewsespresso;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;


public record EmitterParticlePayload(int entityId, ParticleOptions particleOptions) implements CustomPacketPayload {
    public static final Type<EmitterParticlePayload> TYPE = new Type<>(Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, "emitter_particle"));
    public static final StreamCodec<RegistryFriendlyByteBuf, EmitterParticlePayload> CODEC = StreamCodec.composite(
            ByteBufCodecs.INT, EmitterParticlePayload::entityId, ParticleTypes.STREAM_CODEC, EmitterParticlePayload::particleOptions, EmitterParticlePayload::new);

    public static void send(ServerPlayer receiver, Entity entity, ParticleOptions particleOptions) {
        ServerPlayNetworking.send(receiver, new EmitterParticlePayload(entity.getId(), particleOptions));
    }

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    public static class Receiver implements ClientPlayNetworking.PlayPayloadHandler<EmitterParticlePayload> {

        @Override
        public void receive(EmitterParticlePayload payload, ClientPlayNetworking.Context context) {
            Minecraft client = context.client();
            ClientLevel level = client.level;

            if (level != null) {
                Entity entity = level.getEntity(payload.entityId);
                if (entity != null) {
                    client.particleEngine.createTrackingEmitter(entity, payload.particleOptions);
                }
            }
        }
    }
}