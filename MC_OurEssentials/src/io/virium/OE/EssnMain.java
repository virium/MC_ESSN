package io.virium.OE;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class EssnMain extends JavaPlugin{
	
	private static Plugin instance;
	
	
	public void onEnable(){
		instance = this;
	}
	
	public void onDisable(){
		
	}
	
    public static Plugin getInstance(){
    	return instance;
    }
}
