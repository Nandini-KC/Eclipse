package com.xworkz.abstraction.implementation;

import com.xworkz.anstraction.rule.Laptop;

public class AcerLaptop implements Laptop{

	@Override
	public int ram() {
		System.out.println("Invoking ram in AcerLaptop ");
		return 0;
	}
	

}
