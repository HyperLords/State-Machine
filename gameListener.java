package org.Thebridage.main.GamesLibary;

import org.bukkit.event.Listener;
import lombok.Getter;

public abstract class BridgeListener implements Listener{

	@Getter
	private BridgeState bridgeState;
	
	public BridgeListener(BridgeState bridgeState) {
		this.bridgeState=bridgeState;
	}
}
