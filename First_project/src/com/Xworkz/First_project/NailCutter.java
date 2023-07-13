package com.Xworkz.First_project;

public class NailCutter {
	 String  sharp;
	static int cost;
	static void displayStatic()
	{	
		cost=100;
	}
	NailCutter(String sharp)
	{
		this.sharp=sharp;
	
	}
	void display()
	{
		System.out.println("cost ="+NailCutter.cost);
		System.out.println("NailCutter is sharp="+this.sharp);
	}
}
