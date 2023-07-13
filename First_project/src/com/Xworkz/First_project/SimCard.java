package com.Xworkz.First_project;

public class SimCard {
	static String type;
	String company;
	static void displayStatic()
	{	
		type="micro chip";
	}
	SimCard(String company)
	{
		this.company=company;
	
	}
	void display()
	{
		System.out.println("SimCard type ="+SimCard.type);
		System.out.println("company of SimCard="+this.company);
	}
}
