package com.xworkz.Task;

public class Theatre {
	String theatreName;
	int ticketCost=300;
	TheatreType  theatreType;
	String movieName;
	Theatre(String theatreName)
	{
		this.theatreName=theatreName;
		
	}
	void typeOfTheatre(TheatreType  theatreType)
	{
		this.theatreType=theatreType;
	}
	void display()
	{
		System.out.println("Theatre Name="+this.theatreName);
		System.out.println("cost of ticket="+this.ticketCost);
		System.out.println("Theatre type="+this.theatreType);
		System.out.println("Movie Name="+this.movieName);
	}
	
}
