package brew.modid.mixin.behemoth;

import brew.modid.item.BehemothItem;
import brew.modid.particle.ModParticles;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(Player.class)
public abstract class PlayerMixin extends LivingEntity {

    protected PlayerMixin(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);
    }

    @ModifyArg(method = "doSweepAttack", at = @At(value = "INVOKE", target =
            "Lnet/minecraft/server/level/ServerLevel;sendParticles(Lnet/minecraft/core/particles/ParticleOptions;DDDIDDDD)I", ordinal = 0), index = 0)
    private <T extends ParticleOptions> T brewsespresso$livyatanSweep(T particleOptions) {
        if (this.getMainHandItem().is(BehemothItem.BEHEMOTH)) {
            return (T) ModParticles.BEHEMOTH_SWEEP;
        }
        return particleOptions;
    }


}