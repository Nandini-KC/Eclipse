package com.Xworkz.inheritance;

public class Plant extends LivingThing{
	Plant()
	{
		System.out.println("Invoking no-args cont in Plant");
	}
	Plant(String name,int noOfLivingThing,String type)
	{
		super(name,noOfLivingThing,type);
		this.name=name;
		this.noOfLivingThing=noOfLivingThing;
		this.type=type;
	}
}
