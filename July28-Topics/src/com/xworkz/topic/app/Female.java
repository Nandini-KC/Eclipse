package com.xworkz.topic.app;

public class Female extends Humanbeing{
	public Female()
	{
		System.out.println("Invoking no-args const in Female");
	}
	public Female(int lifeSpan,String nameOfLivingThing, int centuryNumber, String types) {
		this.lifeSpan=lifeSpan;
		this.nameOfLivingThing = nameOfLivingThing;
		this.centuryNumber = centuryNumber;
		this.types = types;
	}
	
}
