package dev.mega.swiztable.api;

import dev.mega.megacore.api.MegaAPIHandler;
import dev.mega.swiztable.user.User;

import java.util.UUID;

public interface ApiHandler extends MegaAPIHandler {
    void add(UUID uuid);

    void remove(User user);
}
