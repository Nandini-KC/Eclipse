package com.xworkz.util.player;

public interface PlayerService {
	public boolean validateAndSave(PlayerDTO playerDTO);
	public PlayerDTO findByName(String name);
	public PlayerDTO findByNameAnd(String name,String sportName);
}
