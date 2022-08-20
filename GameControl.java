package org.Thebridage.main.GamesLibary;

import java.util.ArrayList;

import org.bukkit.plugin.java.JavaPlugin;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BridgeGame {

	private String name;
	
	private JavaPlugin plugin;
	
	private BridgeState bridgeState;
	
	private int stateIndex=0;
	
	private ArrayList<BridgeState>stateQueues=new ArrayList<>();
	
	public abstract void enable();
	public abstract void disable();
	
	public BridgeGame(JavaPlugin plugin) {
		this.plugin=plugin;
	}
}
