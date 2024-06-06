package dev.mega.swiztable.event;

import dev.mega.megacore.event.CancellableEvent;
import dev.mega.swiztable.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.HandlerList;

@Getter @Setter
@AllArgsConstructor
public class PreUserAddEvent extends CancellableEvent {
    private final HandlerList handlers = new HandlerList();

    private User user;
}
