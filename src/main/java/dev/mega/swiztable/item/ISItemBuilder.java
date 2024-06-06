package dev.mega.swiztable.item;

import dev.mega.megacore.inventory.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ISItemBuilder extends ItemBuilder {
    public ISItemBuilder(Material material) {
        super(material);
    }

    public ISItemBuilder(ItemStack item) {
        super(item);
    }
}
