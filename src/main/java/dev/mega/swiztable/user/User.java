package dev.mega.swiztable.user;

import dev.mega.swiztable.block.STBlock;
import dev.mega.swiztable.item.STItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter @Setter
@AllArgsConstructor(staticName = "of")
public class User {
    private final UUID uuid;
    private final List<STItem> items;
    private final List<STBlock> blocks;

    public static User of(UUID uuid) {
        return new User(uuid, List.of(), List.of());
    }
}
