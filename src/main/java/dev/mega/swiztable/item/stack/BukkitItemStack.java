package dev.mega.swiztable.item.stack;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

@Getter
@AllArgsConstructor
public class BukkitItemStack implements PluginStack {
    private final ItemStack itemStack;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BukkitItemStack that = (BukkitItemStack) o;
        return Objects.equals(getItemStack(), that.getItemStack());
    }
}
