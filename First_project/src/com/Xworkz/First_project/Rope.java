package com.Xworkz.First_project;

public class Rope {
	int  length;
	static String color;
	static void displayStatic()
	{	
		color="Green";
	}
	Rope(int length)
	{
		this.length=length;
	
	}
	void display()
	{
		System.out.println("Color ="+Rope.color);
		System.out.println(" length of rope ="+this.length);
	}
}
