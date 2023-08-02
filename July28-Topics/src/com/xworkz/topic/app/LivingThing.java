package com.xworkz.topic.app;

public class LivingThing {
	String nameOfLivingThing;
	int centuryNumber;
	String types;

	public LivingThing() {
		System.out.println("Invoking no-args const in LivingThing");
	}

	public LivingThing(String nameOfLivingThing, int centuryNumber, String types) {
		super();
		this.nameOfLivingThing = nameOfLivingThing;
		this.centuryNumber = centuryNumber;
		this.types = types;
	}

	public void printInfo() {
		System.out.println("Name of living thing=" + this.nameOfLivingThing);
		System.out.println("Century number=" + this.centuryNumber);
		System.out.println("types of living things=" + this.types);
	}

}
