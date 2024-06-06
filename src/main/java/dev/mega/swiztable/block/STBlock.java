package dev.mega.swiztable.block;

import dev.mega.swiztable.item.stack.PluginStack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Location;

@Getter
@AllArgsConstructor(staticName = "of")
public class STBlock {
    private final BlockType type;
    private final Location location;
    private final PluginStack stack;
}
