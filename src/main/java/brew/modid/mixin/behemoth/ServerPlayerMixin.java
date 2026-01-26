package brew.modid.mixin.behemoth;

import brew.modid.item.BehemothItem;
import brew.modid.item.LivyatanItem;
import brew.modid.particle.ModParticles;
import brew.modid.payload.EmitterParticlePayload;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.network.protocol.Packet;
import net.minecraft.server.level.ServerChunkCache;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;


@Mixin(ServerPlayer.class)
public class ServerPlayerMixin {

    @WrapOperation(method = "crit", at = @At(value = "INVOKE", target =
            "Lnet/minecraft/server/level/ServerChunkCache;sendToTrackingPlayersAndSelf(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/network/protocol/Packet;)V"))
    private void brewsespresso$critEmitterPayload(ServerChunkCache instance, Entity receiver, Packet<?> packet, Operation<Void> original, Entity entity) {
        ServerPlayer serverPlayer = (ServerPlayer) (Object) this;

        if (serverPlayer.getMainHandItem().is(BehemothItem.BEHEMOTH)) {
            EmitterParticlePayload.send(serverPlayer, entity, (ParticleOptions) ModParticles.BEHEMOTH_CRIT);
            return;
        }

        original.call(instance, entity, packet);
    }
}

