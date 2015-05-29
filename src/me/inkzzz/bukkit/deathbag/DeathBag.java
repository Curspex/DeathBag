package me.inkzzz.bukkit.deathbag;

import me.inkzzz.bukkit.deathbag.listener.PlayerDeathListener;

import org.bukkit.plugin.java.JavaPlugin;

public class DeathBag extends JavaPlugin {

	@Override
	public void onEnable()
	{
		this.getServer().getPluginManager().registerEvents(new PlayerDeathListener(), this);
	}

}
