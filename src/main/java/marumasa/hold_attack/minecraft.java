package marumasa.hold_attack;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(minecraft.MODID)
public class minecraft {

    public static final String MODID = "hold_attack";

    public minecraft() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.SPEC, "HoldAttack.toml");
        MinecraftForge.EVENT_BUS.register(new Events());
    }
}
