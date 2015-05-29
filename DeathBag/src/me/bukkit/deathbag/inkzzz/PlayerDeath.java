package me.bukkit.deathbag.inkzzz;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class PlayerDeath implements Listener {

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerDeath(final PlayerDeathEvent event) {
		if (event.getKeepInventory() == true || !event.getEntityType().equals(EntityType.PLAYER) || event.getDrops().size() < 1) return;
		final Location location = event.getEntity().getLocation();
		location.getBlock().setType(Material.CHEST);
		final Inventory inv = ((InventoryHolder) location.getBlock().getState()).getInventory();
		
		event.getDrops().forEach(drop -> inv.addItem(drop));
		
		//for (final ItemStack is : e.getDrops())
		//{
		//	chest.getInventory().addItem(new ItemStack[] { is });
		//}

		event.getDrops().clear();
	}

}
