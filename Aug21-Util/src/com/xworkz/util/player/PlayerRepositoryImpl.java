package com.xworkz.util.player;

public class PlayerRepositoryImpl implements PlayerRepository{
	private PlayerDTO[] players=new PlayerDTO[TOTAL_PLAYERS];
	private int index=0;
	@Override
	public void save(PlayerDTO playerDTO) {
		if(index<TOTAL_PLAYERS)
		{
			this.players[index]=playerDTO;
			System.out.println(playerDTO +"Data is stored at index :"+index);
			index++;
		}
		else
		{
			System.err.println("Index is not found");
		}
		
	}
	@Override
	public PlayerDTO findByName(String name) {
		for(int i=0;i<index;i++)
		{
			
				if(players[i].getName().equalsIgnoreCase(name))
				{
					System.out.println("Player name "+name+" at index "+i);
					System.out.println("data found "+players[i]);
					return players[i];
				}
				System.out.println("Checking for another index");
			
			
		}
		System.out.println("Data not found");
		return null;
	}
	@Override
	public PlayerDTO findByNameAnd(String name, String sportName) {
		for(int i=0;i<index;i++)
		{
			
				if(players[i].getName().equalsIgnoreCase(sportName)&&players[i].getSportName().equalsIgnoreCase(sportName))
				{
					System.out.println("Data  matched at index " + i);
					System.out.println("Data found "+players[i]);
					return players[i];
				}
				System.out.println("Checking for other index..");
			
			
		}
		System.out.println("Data not found");
		return null;
	}

}
