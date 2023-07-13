package com.Xworkz.First_project;

public class Tv {
	 String brand;
	static int inches;
	static void displayStatic()
	{	
		inches=48;
	}
	Tv(String brand)
	{
		this.brand=brand;
	
	}
	void display()
	{
		System.out.println("Tv inches ="+Tv.inches);
		System.out.println("Brand of Tv="+this.brand);
	}
}
