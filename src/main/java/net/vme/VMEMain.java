package net.vme;

import net.fabricmc.api.ModInitializer;
import net.vme.init.ConfigInit;
import net.vme.init.ItemInit;

public class VMEMain implements ModInitializer {

    @Override
    public void onInitialize() {
        ConfigInit.init();
        ItemInit.init();
    }

}
