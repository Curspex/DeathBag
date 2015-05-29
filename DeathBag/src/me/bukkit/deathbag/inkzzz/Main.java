package me.bukkit.deathbag.inkzzz;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new PlayerDeath(), this);
	}

}
