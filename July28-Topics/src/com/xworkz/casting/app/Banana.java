package com.xworkz.casting.app;

public class Banana extends Fruits{
	String type;
	int costOfBanana;
	public Banana(String type, int costOfBanana,int price, String color, String importPlace) {
		super(price,color,importPlace);
		this.type = type;
		this.costOfBanana = costOfBanana;
	}
	public void print()
	{
		System.out.println("Invoking method in banana");
		System.out.println("Type of banana="+this.type);
		System.out.println("cost of banana="+this.costOfBanana);
		System.out.println("Price ="+this.price);
		System.out.println("Color="+this.color);
		System.out.println("Import place="+this.importPlace);
	}
}
