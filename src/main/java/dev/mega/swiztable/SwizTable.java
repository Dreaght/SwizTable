package dev.mega.swiztable;

import dev.mega.megacore.MegaCore;
import dev.mega.megacore.config.SubFolder;
import dev.mega.swiztable.config.ConfigManager;
import lombok.Getter;

@Getter
public final class SwizTable extends MegaCore {

    private static final Class<? extends SubFolder> configManager = ConfigManager.class;
    private static final String managersPath = "dev.mega.swiztable.manager";
    private static final String listenersPath = "dev.mega.swiztable.listener";

    public SwizTable() {
        super(configManager, managersPath, listenersPath);
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    protected void registerCommands() {

    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }
}
