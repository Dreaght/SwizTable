package dev.mega.swiztable.listener;

import dev.mega.megacore.MegaCore;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class InteractListener implements Listener {

    private final MegaCore megaCore;

    public InteractListener(MegaCore megaCore) {
        this.megaCore = megaCore;
    }

    @EventHandler
    public void onBlockClick(PlayerInteractEvent event) {

    }

    @EventHandler
    public void onItemDrop(PlayerDropItemEvent event) {

    }
}
