package dev.mega.swiztable.item;

import dev.mega.swiztable.item.stack.PluginStack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class STItem {
    private final ItemType type;
    private final PluginStack stack;
}
