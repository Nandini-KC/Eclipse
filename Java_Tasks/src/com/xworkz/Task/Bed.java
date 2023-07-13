package com.xworkz.Task;

public class Bed {
	String brands;
	String color="white";
	BedType type;
	int cost;
	Bed(String brands)
	{
		this.brands=brands;
	}
	void bedCost(int cost)
	{
		this.cost=cost;
	}
	void display()
	{
		System.out.println("Bed brand="+this.brands);
		System.out.println("Bed color="+this.color);
		System.out.println("Bed type="+this.type);
		System.out.println("Bed price="+this.cost);
		
	}
}
