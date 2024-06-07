package dev.mega.swiztable.item;

import dev.mega.swiztable.util.MetaUtil;
import dev.mega.swiztable.item.stack.PluginStack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter @Setter
@AllArgsConstructor
public class STItem {
    private final PluginStack stack;

    public ItemType getType() {
        return ItemType.valueOf(MetaUtil.getItemMeta(Objects.requireNonNull(stack.getItemStack()), "type"));
    }
}
