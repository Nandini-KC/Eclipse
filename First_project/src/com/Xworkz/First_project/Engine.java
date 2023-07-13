package com.Xworkz.First_project;

public class Engine {
	static boolean works;
	String vehicleName;
	static void displayStatic()
	{	
		works=true;
	}
	Engine(String vehicleName)
	{
		this.vehicleName=vehicleName;
	
	}
	void display()
	{
		System.out.println("engine works ="+Engine.works);
		System.out.println("vehicleName="+this.vehicleName);
	}
}
