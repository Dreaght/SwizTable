package dev.mega.swiztable.util;

import dev.mega.swiztable.item.IngredientType;
import dev.mega.swiztable.menu.MenuState;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;

public class MenuStateUtil {
    public static int getSize(MenuState menuState) {
        List<MenuState.Slot> slots = menuState.slots();

        Optional<Integer> maxSlotOpt = slots.stream().map(MenuState.Slot::index).max(Integer::compare);
        if (maxSlotOpt.isEmpty()) {
            return 9;
        }
        int maxSlot = maxSlotOpt.get();

        return 9 * (((int) (maxSlot / 9)) + ((maxSlot % 9) == 0 ? 0 : 1));
    }

    public static int getIngredientIndex(MenuState menuState, IngredientType type) {
        return getIngredientIndex(menuState.slots().stream().map(slot ->
                slot.slotPattern().getStack().getItemStack()).toList(), type);
    }

    public static int getIngredientIndex(Inventory inventory, IngredientType type) {
        return getIngredientIndex(Arrays.asList(inventory.getContents()), type);
    }

    public static int getIngredientIndex(List<ItemStack> itemStacks, IngredientType type) {
        return IntStream.range(0, itemStacks.size())
                .filter(index -> {
                    return Objects.equals(MetaUtil.getItemMeta(Objects.requireNonNull(itemStacks.get(index)),
                            "type"), type.name());
                }).findFirst().orElse(-1);
    }
}
