package marumasa.hold_attack;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> COOL_TIME;

    static {
        BUILDER.push("Hold Attack");

        COOL_TIME = BUILDER.comment("Attack Cool Time")
                .define("coolTime", 10);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
