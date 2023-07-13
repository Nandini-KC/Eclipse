package com.Xworkz.First_project;

public class Printer {
	 String brand;
	static int cost;
	static void displayStatic()
	{	
		cost=20000;
	}
	Printer(String brand)
	{
		this.brand=brand;
	
	}
	void display()
	{
		System.out.println("Printer cost ="+Printer.cost);
		System.out.println("brand of Printer="+this.brand);
	}
}
