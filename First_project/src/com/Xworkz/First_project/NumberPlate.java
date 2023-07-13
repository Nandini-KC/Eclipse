package com.Xworkz.First_project;

public class NumberPlate {
	static String number;
	String state;
	static void displayStatic()
	{	
		number="AP 03";
	}
	NumberPlate(String state)
	{
		this.state=state;
	
	}
	void display()
	{
		System.out.println("number plate number ="+NumberPlate.number);
		System.out.println("numberplate state="+this.state);
	}
}
