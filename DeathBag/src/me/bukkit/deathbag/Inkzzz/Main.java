package me.bukkit.deathbag.Inkzzz;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {
		getServer().getPluginManager().registerEvents(new PlayerDeath(), this);
	}
	
	public void onDisable() {
		
	}
	 
}
