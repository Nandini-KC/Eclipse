package com.xworkz.topic.app;

public class Kitchen extends House{
	public Kitchen()
	{
		System.out.println("Invoking no-args const in Kitchen");
	}
	public Kitchen(int cost,String name, int noOfFloors,String type)
	{
		
		this.cost=cost;
		this.name=name;
		this.type=type;
		this.noOfFloors=noOfFloors;
	}
	public void printInfo()
	{
		System.out.println("Cost of house="+this.cost);
		System.out.println("Name of building="+this.name);
		System.out.println("No of floors="+this.noOfFloors);
		System.out.println("Type of Building="+this.type);
	}

}
