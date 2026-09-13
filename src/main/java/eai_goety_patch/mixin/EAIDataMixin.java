package eai_goety_patch.mixin;

import insane96mcp.enhancedai.data.EAIData;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EAIData.class)
public class EAIDataMixin {

    @Inject(method = "has", at = @At("HEAD"), cancellable = true, remap = false)
    private void eai_goety_patch$hasNullCheck(Entity entity, CallbackInfoReturnable<Boolean> cir) {
        if (entity == null || entity.level() == null) {
            cir.setReturnValue(false);
        }
    }
}