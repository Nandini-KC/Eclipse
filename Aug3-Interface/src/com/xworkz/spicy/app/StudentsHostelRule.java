package com.xworkz.spicy.app;

public class StudentsHostelRule implements HostelRule,WardenHostelRule{

	@Override
	public String outPass() {
		System.out.println("Invoking outPass method from HostelRule");
		return null;
	}

	@Override
	public String parentCard() {
		System.out.println("Invoking parentCard method from WardenHostelRule");
		return null;
	}

	@Override
	public int lightsOff() {
		System.out.println("Invoking lightsOff method from WardenHostelRule");
		return 0;
	}
	
}
