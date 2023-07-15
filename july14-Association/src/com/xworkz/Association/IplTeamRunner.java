package com.xworkz.Association;

public class IplTeamRunner {

	public static void main(String[] args) {
		System.out.println("Running main in IplTeamRunner ");
		IplTeam ref=new IplTeam("RCB"," Virat Kohli");
		ref.setNoOfTeams(10);
		ref.printInfo();
		
		IplTeam ref1=new IplTeam("CSK","M.S. Dhoni");
		ref1.setNoOfTeams(10);
		ref1.printInfo();
		
		
		

	}

}
