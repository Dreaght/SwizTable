package dev.mega.swiztable.util;

import dev.lone.itemsadder.api.CustomStack;
import dev.mega.megacore.inventory.ItemBuilder;
import dev.mega.swiztable.item.stack.BukkitItemStack;
import dev.mega.swiztable.item.stack.ItemsAdderStack;
import dev.mega.swiztable.item.stack.PluginStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class PluginStackFactory {
    public static PluginStack getPluginStack(String contentName, String item, String title, List<String> lore) {
        PluginStack pluginStack = null;

        if (item.startsWith("itemsadder:")) {
            item = parseItemIdentifier(item);
            if (isCustomItem(item)) {
                pluginStack = createItemsAdderStack(item);
            }
        } else {
            pluginStack = createBukkitItemStack(item);
        }

        if (pluginStack == null) {
            throw new IllegalArgumentException("Failed to find material: " + item);
        }

        setItemMeta(pluginStack, title, lore);
        MetaUtil.setItemMeta(pluginStack.getItemStack(), "type", contentName);

        return pluginStack;
    }

    public static PluginStack getPluginStack(ItemStack itemStack) {
        PluginStack pluginStack;
        CustomStack customStack = CustomStack.byItemStack(itemStack);

        if (customStack != null) {
            pluginStack = new ItemsAdderStack(customStack);
        } else {
            pluginStack = new BukkitItemStack(itemStack);
        }
        return pluginStack;
    }

    private static String parseItemIdentifier(String item) {
        return item.split(":", 2)[1];
    }

    public static boolean isCustomItem(String item) {
        return CustomStack.isInRegistry(item);
    }

    private static PluginStack createItemsAdderStack(String item) {
        CustomStack stack = CustomStack.getInstance(item);
        return new ItemsAdderStack(stack);
    }

    private static PluginStack createBukkitItemStack(String item) {
        ItemStack itemStack = new ItemStack(Material.valueOf(item));
        return new BukkitItemStack(itemStack);
    }

    private static void setItemMeta(PluginStack pluginStack, String title, List<String> lore) {
        ItemBuilder itemBuilder = new ItemBuilder(pluginStack.getItemStack());

        itemBuilder.name(title);
        itemBuilder.lore(lore);
    }
}
