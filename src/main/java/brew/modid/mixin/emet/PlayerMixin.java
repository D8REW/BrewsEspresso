package brew.modid.mixin.emet;

import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import brew.modid.item.custom.ModItems;
import brew.modid.particle.custom.ModParticles;

@Mixin(Player.class)
public class PlayerMixin {

    @ModifyArg(
            method = "doSweepAttack",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerLevel;sendParticles(Lnet/minecraft/core/particles/ParticleOptions;DDDIDDDD)I", ordinal = 0),
            index = 0
    )
    private <T extends ParticleOptions> T brew$candySweep(T particleOptions) {
        Player player = (Player) (Object) this;

        if (player.getMainHandItem().is(ModItems.EMET)) {
            return (T) ModParticles.EMET_SWEEP;
        }
        return particleOptions;
    }
}