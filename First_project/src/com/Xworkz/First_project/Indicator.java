package com.Xworkz.First_project;

public class Indicator {
	static String volts;
	String type;
	static void displayStatic()
	{	
		volts="600 v";
	}
	Indicator(String type)
	{
		this.type=type;
	
	}
	void display()
	{
		System.out.println("Indicator volts ="+Indicator.volts);
		System.out.println("Type of indicator="+this.type);
	}
}
