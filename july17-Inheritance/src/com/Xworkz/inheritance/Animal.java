package com.Xworkz.inheritance;

public class Animal {
	String animalName;
	int legs;
	String food;
	Animal()
	{
		System.out.println("Invoking no-args const in Animal");
	}
	Animal(String animalName,int legs,String food)
	{
		this.animalName=animalName;
		this.legs=legs;
		this.food=food;
	}
	void printInfo()
	{
		System.out.println("Animal Name="+this.animalName);
		System.out.println("No of Legs ="+this.legs);
		System.out.println("Which food="+this.food);
	}
}
