package me.bukkit.deathbag.Inkzzz;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerDeath implements Listener {

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerDeath(PlayerDeathEvent e) {
		Player p = (Player) e.getEntity();
		Location ploc = p.getLocation();
		ploc.getWorld().getBlockAt(ploc).setType(Material.CHEST);
		Chest chest = (Chest) ploc.getBlock().getState();
		for (ItemStack is : e.getDrops()) {
			chest.getInventory().addItem(is);
		}
		chest.update();
		e.getDrops().clear();
	}

}
