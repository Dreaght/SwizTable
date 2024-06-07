package dev.mega.swiztable.item.stack;

import dev.lone.itemsadder.api.CustomStack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

@Getter
@AllArgsConstructor
public class ItemsAdderStack implements PluginStack {
    private final CustomStack itemStack;

    @Override
    public ItemStack getItemStack() {
        return itemStack.getItemStack();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemsAdderStack that = (ItemsAdderStack) o;
        return Objects.equals(getItemStack(), that.getItemStack());
    }
}
