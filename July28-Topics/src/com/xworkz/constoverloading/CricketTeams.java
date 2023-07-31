package com.xworkz.constoverloading;

public class CricketTeams {
	String teamNames;
	int noOfTeams;
	String bestPlayer;
	String captain;
	int noOfPlayers;
	CricketTeams()
	{
		System.out.println("Invoking no-args const in CricketTeams");
	}
	public CricketTeams(String teamNames, int noOfPlayers)
	{
		System.out.println("Invoking String ,int constructor");
		this.teamNames = teamNames;
		this.noOfPlayers = noOfPlayers;
	}
	public CricketTeams(String teamNames, int noOfTeams, String bestPlayer, String captain) {
		System.out.println("Invoking String ,int,String,String constructor");
		this.teamNames = teamNames;
		this.noOfTeams = noOfTeams;
		this.bestPlayer = bestPlayer;
		this.captain = captain;
	}
	
	
}
