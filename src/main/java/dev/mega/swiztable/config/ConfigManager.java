package dev.mega.swiztable.config;

import dev.mega.megacore.MegaCore;
import dev.mega.megacore.config.SubFolder;
import lombok.Getter;
import org.bukkit.plugin.Plugin;

public class ConfigManager extends SubFolder {
    @Getter
    private static ConfigManager instance;

    private ConfigManager(Plugin plugin, String dataFolder) {
        super(plugin, dataFolder);
    }

    public static void init(MegaCore megaCore) {
        if (instance == null) {
            instance = new ConfigManager(megaCore, ".");
        }
    }
}
