package dev.mega.swiztable.api;

import dev.mega.megacore.manager.MegaManager;
import dev.mega.swiztable.event.PreUserAddEvent;
import dev.mega.swiztable.event.PreUserRemoveEvent;
import dev.mega.swiztable.manager.UserManager;
import dev.mega.swiztable.user.User;
import org.bukkit.Bukkit;

import java.util.UUID;

public class STApiHandler implements ApiHandler {
    @Override
    public void add(UUID uuid) {
        if (isDisabled()) return;

        PreUserAddEvent preUserAddEvent = new PreUserAddEvent(User.of(uuid));
        Bukkit.getPluginManager().callEvent(preUserAddEvent);
        if (preUserAddEvent.callEvent()) return;

        User user = preUserAddEvent.getUser();

        UserManager userManager = MegaManager.getManager(UserManager.class);
        userManager.getUsers().addValue(user.getUuid(), user);
    }

    @Override
    public void remove(User user) {
        if (isDisabled() || user == null) return;

        PreUserRemoveEvent preUserRemoveEvent = new PreUserRemoveEvent(user);
        Bukkit.getPluginManager().callEvent(preUserRemoveEvent);
        if (preUserRemoveEvent.callEvent()) return;

        UserManager userManager = MegaManager.getManager(UserManager.class);
        userManager.getUsers().remove(preUserRemoveEvent.getUser().getUuid());
    }
}
