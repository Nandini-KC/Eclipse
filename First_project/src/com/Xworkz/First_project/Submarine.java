package com.Xworkz.First_project;

public class Submarine {
	 String name;
	static int noOfSubmarines;
	static void displayStatic()
	{	
		noOfSubmarines=2;
	}
	Submarine(String name)
	{
		this.name=name;
	
	}
	void display()
	{
		System.out.println("number of submarine ="+Submarine.noOfSubmarines);
		System.out.println("name of submarine="+this.name);
	}
}	
