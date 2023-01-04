package net.vme.init;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.vme.config.VMEConfig;

public class ConfigInit {

    public static VMEConfig CONFIG = new VMEConfig();

    public static void init() {
        AutoConfig.register(VMEConfig.class, JanksonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(VMEConfig.class).getConfig();
    }
}
