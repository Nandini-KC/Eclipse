package com.Xworkz.First_project;

public class Wire {
	static String type;
	String metres;
	static void displayStatic()
	{	
		type="copper wire";
	}
	Wire(String metres)
	{
		this.metres=metres;
	
	}
	void display()
	{
		System.out.println("wire type ="+Wire.type);
		System.out.println("wire metres="+this.metres);
	}
}
