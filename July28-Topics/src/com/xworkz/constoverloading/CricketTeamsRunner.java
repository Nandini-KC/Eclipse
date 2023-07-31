package com.xworkz.constoverloading;

public class CricketTeamsRunner {

	public static void main(String[] args) {
		
		CricketTeams ref=new CricketTeams();
		CricketTeams ref1=new CricketTeams("RCB",11);
		System.out.println("Team name="+ref1.teamNames);
		System.out.println("No of players="+ref1.noOfPlayers);
		CricketTeams ref2=new CricketTeams("CSK",10,"kohli","Dhoni");
		System.out.println("Team name="+ref2.teamNames);
		System.out.println("no of teams="+ref2.noOfTeams);
		System.out.println("Best player name="+ref2.bestPlayer);
		System.out.println("captain name="+ref2.captain);
	}

}
