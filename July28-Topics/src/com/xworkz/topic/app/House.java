package com.xworkz.topic.app;

public class House extends Building{
	int cost;
	public House()
	{
		System.out.println("Invoking no-args const in House");
	}
	public House(int cost,String name, int noOfFloors,String type)
	{
		
		this.cost=cost;
		this.name=name;
		this.type=type;
		this.noOfFloors=noOfFloors;
	}
	
}
