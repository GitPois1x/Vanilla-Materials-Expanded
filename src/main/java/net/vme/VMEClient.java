package net.vme;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.vme.init.ModelProviderInit;

@Environment(EnvType.CLIENT)
public class VMEClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModelProviderInit.init();
    }

}
