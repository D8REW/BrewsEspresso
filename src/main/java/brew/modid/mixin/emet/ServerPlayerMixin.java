package brew.modid.mixin.emet;

import brew.modid.item.emet.EmetItem;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.protocol.Packet;
import net.minecraft.server.level.ServerChunkCache;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import brew.modid.payload.EmitterParticlePayload;
import brew.modid.particle.ModParticles;

@Mixin(ServerPlayer.class)
public class ServerPlayerMixin {
    @WrapOperation(
            method = "crit",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerChunkCache;sendToTrackingPlayersAndSelf(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/network/protocol/Packet;)V")
    )
    private void brew$critEmitterPayload(ServerChunkCache instance, Entity target, Packet<?> packet, Operation<Void> original) {
        ServerPlayer attacker = (ServerPlayer) (Object) this;

        if (attacker.getMainHandItem().is(EmetItem.EMET)) {
            // Send our custom payload to everyone watching the fight
            EmitterParticlePayload payload = new EmitterParticlePayload(target.getId(), ModParticles.EMET_CRIT);

            // This helper method sends to all tracking players + the attacker
            PlayerLookup.tracking(target).forEach(p -> ServerPlayNetworking.send(p, payload));
            ServerPlayNetworking.send(attacker, payload);
            return;
        }

        original.call(instance, target, packet);
    }
}