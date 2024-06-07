package dev.mega.swiztable.menu;

import dev.mega.swiztable.item.ItemType;
import dev.mega.swiztable.item.STItem;
import dev.mega.swiztable.util.MetaUtil;
import dev.mega.swiztable.util.PluginStackFactory;
import net.kyori.adventure.text.Component;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public record MenuState(Component title, List<Slot> slots) {
    public static MenuState of(InventoryView inventoryView) {
        Component title = inventoryView.title();
        List<ItemStack> itemStacks = List.of(inventoryView.getTopInventory().getContents());
        List<Slot> slotList = new ArrayList<>();

        for (int i = 0; i < itemStacks.size(); i++) {
            String content = MetaUtil.getItemMeta(itemStacks.get(i), "type");
            slotList.add(new Slot(i, new STItem(ItemType.valueOf(content), PluginStackFactory.getPluginStack(itemStacks.get(i)))));
        }

        return new MenuState(title, slotList);
    }

    public record Slot(int index, STItem slotPattern) {}
}
