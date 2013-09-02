package com.live.AlioGenerica.netherflight;

import java.util.ArrayList;

import org.bukkit.GameMode;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class flight {
static String mess = "unable to execute command, sorry";
static ArrayList<Player> flyers = new ArrayList<Player>( );

	public static String setfly(CommandSender sender) {
		Player p = (Player) sender;
		if(p.getWorld().getEnvironment().equals(World.Environment.NETHER)){
		if(p.getGameMode() == GameMode.CREATIVE){
			mess = "Silly goose you're in creative mode, you have to fly!";
			return mess;
		} else {
			if(flyers.contains(p)){
				p.setAllowFlight(false);
				mess = "Your flight is now off.";
				flyers.remove(p);
				return mess;
			} else {
				p.setAllowFlight(true);
				mess = "You may now fly!!";
				flyers.add(p);
				return mess;
			}
		}
		} else {
			mess = "You can't do that ourside the nether!!!";
			return mess;
		}
	}


}
