package com.live.AlioGenerica.netherflight;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public class worldlistener implements Listener{
	@EventHandler
	public boolean onWorldChange(PlayerChangedWorldEvent event){
	    Player p = event.getPlayer();
		if(p.getGameMode() == GameMode.CREATIVE){
			return true;
		} else {
			p.setAllowFlight(false);
			return true;
		}
	}

	
}
