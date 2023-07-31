package com.xworkz.topic.app;

public class Male extends Humanbeing{
	public Male()
	{
		System.out.println("Invoking no-args const in Male");
	}
	public Male(int lifeSpan,String nameOfLivingThing, int centuryNumber, String types) {
		this.lifeSpan=lifeSpan;
		this.nameOfLivingThing = nameOfLivingThing;
		this.centuryNumber = centuryNumber;
		this.types = types;
	}
	
}
