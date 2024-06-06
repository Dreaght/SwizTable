package dev.mega.swiztable.api;

import dev.mega.swiztable.user.User;

import java.util.UUID;

public class SwizTableAPI {
    private static ApiHandler api;

    public static void addUser(UUID uuid) {
        api.add(uuid);
    }

    public static void removeUser(User user) {
        api.remove(user);
    }

    public static void setApi(ApiHandler api) {
        SwizTableAPI.api = api;
    }
}
