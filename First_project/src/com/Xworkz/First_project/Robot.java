package com.Xworkz.First_project;

public class Robot {
	static String materials;
	int cost;
	static void displayStatic()
	{	
		materials="steel, aluminum and cast iron";
	}
	Robot(int cost)
	{
		this.cost=cost;
	
	}
	void display()
	{
		System.out.println("Materials used for robot ="+Robot.materials);
		System.out.println("cost of robot="+this.cost);
	}
}
