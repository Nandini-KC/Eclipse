package com.Xworkz.First_project;

public class Fabric {
	static String color;
	int cost;
	static void displayStatic()
	{	
		color="Pink";
	}
	Fabric(int cost)
	{
		this.cost=cost;
	
	}
	void display()
	{
		System.out.println("color of fabric ="+Fabric.color);
		System.out.println("cost of fabric="+this.cost);
	}
}
