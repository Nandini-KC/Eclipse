package com.xworkz.Association;

public class IplTeam {
	String teamName;
	int noOfPlayers=25;
	String captain;
	int noOfTeams;
	Franchise ref=new Franchise("Star sports ","TATA Ipl","Virat Kohli");
	Franchise ref1=new Franchise("Star sports ","TATA Ipl"," Sam Curran ");
	IplTeam(String teamName,String captain)
	{
		this.teamName=teamName;
		this.captain=captain;
	}
	void setNoOfTeams(int noOfTeams)
	{
		this.noOfTeams=noOfTeams;
	}
	void printInfo()
	{
		System.out.println("Team Name="+this.teamName);
		System.out.println("No of players="+this.noOfPlayers);
		System.out.println("captain="+this.captain);
		System.out.println("No of teams="+this.noOfTeams);
		this.ref.printFranchiseInfo();
		this.ref1.printFranchiseInfo();
		
	}
}
