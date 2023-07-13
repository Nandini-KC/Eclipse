package com.Xworkz.First_project;

public class ContactLens {
	static int price;
	String brand;
	static void displayStatic()
	{	
		price=52000;
	}
	ContactLens(String brand)
	{
		this.brand=brand;
	
	}
	void display()
	{
		System.out.println("price of ContactLens ="+Vaccum.price);
		System.out.println("Brand of ContactLens="+this.brand);
	}
}
