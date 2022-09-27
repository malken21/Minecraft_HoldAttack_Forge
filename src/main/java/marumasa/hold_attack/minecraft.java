package marumasa.hold_attack;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(minecraft.MODID)
public class minecraft {

    public static final String MODID = "hold_attack";

    public minecraft() {
        MinecraftForge.EVENT_BUS.register(new Events());
    }
}
