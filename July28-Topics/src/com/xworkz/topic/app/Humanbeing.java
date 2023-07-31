package com.xworkz.topic.app;

public class Humanbeing extends LivingThing{
	int lifeSpan;
	public Humanbeing()
	{
		System.out.println("Invoking no-args const in Humanbeing");
	}
	public Humanbeing(int lifeSpan,String nameOfLivingThing, int centuryNumber, String types) {
		this.lifeSpan=lifeSpan;
		this.nameOfLivingThing = nameOfLivingThing;
		this.centuryNumber = centuryNumber;
		this.types = types;
	}
	public void printInfo()
	{
		System.out.println("Life span of humans="+this.lifeSpan);
		System.out.println("Name of living thing="+this.nameOfLivingThing);
		System.out.println("Century number="+this.centuryNumber);
		System.out.println("types of living things="+this.types);
	}
	
}
