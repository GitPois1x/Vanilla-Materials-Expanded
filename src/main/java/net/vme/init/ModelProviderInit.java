package net.vme.init;

import java.util.Iterator;

import org.jetbrains.annotations.Nullable;

import net.devtech.arrp.api.RRPCallback;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.devtech.arrp.json.models.JModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ModelProviderInit {

    public static final RuntimeResourcePack RESOURCE_PACK = RuntimeResourcePack.create("vme:items");

    public static void init() {
        // Generate models
        Iterator<String> items = ItemInit.ITEM_STRINGS.iterator();

        while (items.hasNext()) {
            String item = items.next();
            RESOURCE_PACK.addModel(getJModel(item), new Identifier("vme", "item/" + item));
        }

        RRPCallback.BEFORE_VANILLA.register(a -> a.add(RESOURCE_PACK));
    }

    @Nullable
    private static JModel getJModel(String item) {
        int variation = 0;
        if (item.contains("helmet") || item.contains("chestplate") || item.contains("leggings") || item.contains("boots")) {
            variation = 1;
        }

        switch (variation) {
        case 1:
            return JModel.model().parent("item/generated").textures(JModel.textures().layer0("vme:item/" + item));

        case 0:
            return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("vme:item/" + item));

        default:
            throw new IllegalStateException("Could not find JModel!");
        }
    }

}
