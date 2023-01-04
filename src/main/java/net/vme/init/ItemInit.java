package net.vme.init;

import java.util.ArrayList;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vme.item.material.VMEArmorMaterials;
import net.vme.item.material.VMEToolMaterials;

public class ItemInit {

    public static final ArrayList<String> ITEM_STRINGS = new ArrayList<String>();

    public static final Item TEST_SWORD = register("test_sword", (Item) new SwordItem(VMEToolMaterials.TEST, 3, -2.4f, new Item.Settings()));
    public static final Item TEST_SHOVEL = register("test_shovel", (Item) new ShovelItem(VMEToolMaterials.TEST, 1.5f, -3.0f, new Item.Settings()));
    public static final Item TEST_PICKAXE = register("test_pickaxe", (Item) new PickaxeItem(VMEToolMaterials.TEST, 1, -2.8f, new Item.Settings()));
    public static final Item TEST_AXE = register("test_axe", (Item) new AxeItem(VMEToolMaterials.TEST, 6.0f, -3.1f, new Item.Settings()));
    public static final Item TEST_HOE = register("test_hoe", (Item) new HoeItem(VMEToolMaterials.TEST, -2, -1.0f, new Item.Settings()));

    public static final Item TEST_HELMET = register("test_helmet", (Item) new ArmorItem(VMEArmorMaterials.TEST, EquipmentSlot.HEAD, new Item.Settings()));
    public static final Item TEST_CHESTPLATE = register("test_chestplate", (Item) new ArmorItem(VMEArmorMaterials.TEST, EquipmentSlot.CHEST, new Item.Settings()));
    public static final Item TEST_LEGGINGS = register("test_leggings", (Item) new ArmorItem(VMEArmorMaterials.TEST, EquipmentSlot.LEGS, new Item.Settings()));
    public static final Item TEST_BOOTS = register("test_boots", (Item) new ArmorItem(VMEArmorMaterials.TEST, EquipmentSlot.FEET, new Item.Settings()));

    private static Item register(String id, Item item) {
        ITEM_STRINGS.add(id);
        return register(new Identifier("vme", id), item);
    }

    private static Item register(Identifier id, Item item) {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, id, item);
    }

    public static void init() {
    }
}
