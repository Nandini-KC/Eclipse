package com.Xworkz.inheritance;

public class Monkey extends Animal{
	Monkey()
	{
		System.out.println("Invoking no-args const in Monkey");
	}
	Monkey(String animalName,int legs,String food)
	{
		super(animalName,legs,food);
		this.animalName=animalName;
		this.legs=legs;
		this.food=food;
	}
}
