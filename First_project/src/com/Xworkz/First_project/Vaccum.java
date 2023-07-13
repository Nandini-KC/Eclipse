package com.Xworkz.First_project;

public class Vaccum {
	static int price;
	String brand;
	static void displayStatic()
	{	
		price=52000;
	}
	Vaccum(String brand)
	{
		this.brand=brand;
	
	}
	void display()
	{
		System.out.println("price of vaccum ="+Vaccum.price);
		System.out.println("Brand of vaccum="+this.brand);
	}
}
