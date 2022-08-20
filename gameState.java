package org.Thebridage.main.GamesLibary;

import java.util.ArrayList;
import org.bukkit.event.Listener;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BridgeState implements Listener{

	private String name;

	private int time=300;

	private BridgeGame bridgeGame;
	
	private int taskId=-1;
	
	private ArrayList<BridgeListener> listeners=new ArrayList<>();
	
	public abstract void enable();
	public abstract void disable();
	public abstract boolean control();

	public BridgeState(String name, BridgeGame bridgeGame) {
		this.name=name;
		this.bridgeGame=bridgeGame;
	}
	
	public BridgeState(String name, int time, BridgeGame bridgeGame) {
		this.name=name;
		this.bridgeGame=bridgeGame;
		this.time=time;
	}
}
