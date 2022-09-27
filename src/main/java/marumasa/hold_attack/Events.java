package marumasa.hold_attack;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Events {
    private static final Minecraft mc = Minecraft.getInstance();

    @SubscribeEvent
    public void tick(TickEvent.ClientTickEvent event) {
        if (mc.gameMode == null || mc.player == null || mc.crosshairPickEntity == null) return;
        if (!mc.options.keyAttack.isDown() || mc.player.getAttackStrengthScale(0) != 1) return;
        if (!(mc.crosshairPickEntity instanceof final LivingEntity entity)) return;
        if (entity.hurtTime != 0 || entity.deathTime != 0) return;
        mc.gameMode.attack(mc.player, mc.crosshairPickEntity);
    }
}
