package me.goosemonkey.Scores;

import org.bukkit.plugin.java.JavaPlugin;

public class Scores extends JavaPlugin
{
	public final Logger log = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable()
	{
		this.registerListeners();
	}
	
	private void registerListeners()
	{
		
	}
}
