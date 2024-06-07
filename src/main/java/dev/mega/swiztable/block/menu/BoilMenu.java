package dev.mega.swiztable.block.menu;

import dev.mega.megacore.inventory.MegaInventory;
import dev.mega.swiztable.block.STBlock;
import dev.mega.swiztable.menu.MenuState;
import lombok.Getter;
import net.kyori.adventure.text.Component;

@Getter
public class BoilMenu extends MegaInventory {
    private final STBlock block;

    public BoilMenu(STBlock block, int size, Component title) {
        super(size, title);
        this.block = block;
    }

    public static BoilMenu of(STBlock block, MenuState menuState) {
        BoilMenu boilMenu = new BoilMenu(block, menuState.slots().size(), menuState.title());
        menuState.slots().forEach(slot -> boilMenu.setItem(slot.index(), slot.slotPattern().getStack().getItemStack()));

        return boilMenu;
    }
}
