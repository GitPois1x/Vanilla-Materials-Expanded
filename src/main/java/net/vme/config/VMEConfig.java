package net.vme.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "vme")
@Config.Gui.Background("minecraft:textures/block/stone.png")
public class VMEConfig implements ConfigData {

    // @Comment("Calculates Level: Real HP / Old HP * multiplier - multiplier + 1")
    // public int levelMultiplier = 15;

}
