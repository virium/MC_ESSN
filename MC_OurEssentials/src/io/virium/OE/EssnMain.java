package io.virium.OE;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class EssnMain extends JavaPlugin{
	
	private static Plugin instance; //Create plugin variable
	
	
	public void onEnable(){ // Ran when plugin wakes
		instance = this; // 
	}
	
	public void onDisable(){ // Run when plugin shut down
		
	}
	
    public static Plugin getInstance(){ //Return a pointer to the plugin
    	return instance;
    }
}
