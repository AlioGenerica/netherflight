package com.live.AlioGenerica.netherflight;


import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class netherflight extends JavaPlugin {
	 
	private String message;

	public void onEnable(){
		getServer().getPluginManager().registerEvents(new worldlistener(), this);
		getLogger().info("netherflight v1.0.1 has been enabled");
	}
 
	public void onDisable(){
		getLogger().info("netherflight v1.0.1 has been disabled");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("flight")){ // If the player typed /basic then do the following...
			if (sender instanceof Player) {
				if(sender.hasPermission("netherflight.toggle")){
					setMessage(flight.setfly(sender));
					sender.sendMessage(message);
					return true;
				} else {
					sender.sendMessage("Sorry, you do not have the required permission.");
					return true;
				}
			} else {
				sender.sendMessage("Only players are allowed to use this command");
				return true;
			}
		} 
		return false;
	}
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}