package com.xworkz.casting.app;

public class FruitsCasting {
	public static void printInfo(Fruits fruit)
	{
		if(fruit!=null)
		{
			System.out.println("Price ="+fruit.price);
			System.out.println("Color="+fruit.color);
			System.out.println("Import place="+fruit.importPlace);
			if(fruit instanceof Apple)
			{
				Apple apple=(Apple)fruit;
				apple.print();
			}
			if(fruit instanceof Banana)
			{
				Banana banana=(Banana)fruit;
				banana.print();
			}
			
		}
	}
}
