package com.xworkz.casting.app;

public class Apple extends Fruits{
	String appleColor;
	boolean fresh;
	public Apple(String appleColor, boolean fresh,int price, String color, String importPlace) {
		super(price,color,importPlace);
		this.appleColor = appleColor;
		this.fresh = fresh;
	}
	public void print()
	{
		System.out.println("Invoking method in apple");
		System.out.println("Apple color="+this.appleColor);
		System.out.println("Fresh="+this.fresh);
		System.out.println("Price ="+this.price);
		System.out.println("Color="+this.color);
		System.out.println("Import place="+this.importPlace);
	}
	
}
