package org.qu33xy;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.meta.ItemMeta;

public class PlaceBlock_Listener implements Listener {
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        ItemMeta meta = event.getItemInHand().getItemMeta();
        if (meta == null || !meta.hasDisplayName()) return;

        String name = meta.getDisplayName();
        Block block = event.getBlockPlaced();
        int x = block.getX();
        int z = block.getZ();

        if (name.equals("Boy Farmer")) {
            for (int y = block.getY() - 1; y >= 0; y--) {
                Block below = block.getWorld().getBlockAt(x, y, z);
                below.setType(Material.OBSIDIAN);
            }
        } else if (name.equals("Sand Farmer")) {
            for (int y = block.getY() - 1; y >= 0; y--) {
                Block below = block.getWorld().getBlockAt(x, y, z);
                below.setType(Material.SAND);
            }
        } else if (name.equals("Kopacz Fosy")) {
            for (int y = block.getY() - 1; y >= 0; y--) {
                Block below = block.getWorld().getBlockAt(x, y, z);
                below.setType(Material.AIR);
            }
        }
    }
}