package com.Xworkz.inheritance;

public class Building {
	int floors;
	String color;
	String type;
	Building()
	{
		System.out.println("Invoking no-args const in Building");
	}
	Building(String type,int floors,String color)
	{
		this.type=type;
		this.floors=floors;
		this.color=color;
	}
	void printInfo()
	{
		System.out.println("Type of building="+this.type);
		System.out.println("Floors of building="+this.floors);
		System.out.println("Color of building="+this.color);
	}

}
