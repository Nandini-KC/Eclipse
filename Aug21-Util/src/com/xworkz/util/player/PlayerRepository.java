package com.xworkz.util.player;

public interface PlayerRepository {
	int TOTAL_PLAYERS=5;
	public void save(PlayerDTO playerDTO);
	public PlayerDTO findByName(String name);
	public PlayerDTO findByNameAnd(String name,String sportName);
}
