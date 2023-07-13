package com.Xworkz.First_project;

public class Coastal {
	static String  coastalState;
	int noOfCoastalAreas;
	static void displayStatic()
	{	
		coastalState="Andhra pradesh";
	}
	Coastal(int noOfCoastalAreas)
	{
		this.noOfCoastalAreas=noOfCoastalAreas;
	
	}
	void display()
	{
		System.out.println("coastalState ="+Coastal.coastalState);
		System.out.println("No of coastal areas in india="+this.noOfCoastalAreas);
	}
}
