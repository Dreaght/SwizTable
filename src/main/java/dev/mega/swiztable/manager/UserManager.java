package dev.mega.swiztable.manager;

import dev.mega.megacore.MegaCore;
import dev.mega.megacore.manager.Manager;
import dev.mega.megacore.storage.Data;
import dev.mega.swiztable.api.SwizTableAPI;
import dev.mega.swiztable.user.User;
import lombok.Getter;

import java.util.UUID;

@Getter
public class UserManager extends Manager {
    private final Data<User> users = new Data<>();

    public UserManager(MegaCore megaCore) {
        super(megaCore);
    }

    public void add(UUID uuid) {
        SwizTableAPI.addUser(uuid);
    }

    public void remove(UUID uuid) {
        SwizTableAPI.removeUser(users.getValue(uuid));
    }

    @Override
    public void enable() {
        setRunning(true);
    }

    @Override
    public void disable() {
        setRunning(false);
    }
}
