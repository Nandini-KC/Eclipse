package com.xworkz.topic.app;

public class Building {
	String name;
	int noOfFloors;
	String type;
	public Building()
	{
		System.out.println("Invoking no-args const in Building");
	}
	public Building(String name, int noOfFloors,String type) {
		super();
		this.name = name;
		this.noOfFloors = noOfFloors;
		this.type=type;
	}
	
}
