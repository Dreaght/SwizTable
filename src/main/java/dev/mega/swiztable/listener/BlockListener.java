package dev.mega.swiztable.listener;

import dev.mega.megacore.MegaCore;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListener implements Listener {

    private final MegaCore megaCore;

    public BlockListener(MegaCore megaCore) {
        this.megaCore = megaCore;
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {

    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {

    }
}
