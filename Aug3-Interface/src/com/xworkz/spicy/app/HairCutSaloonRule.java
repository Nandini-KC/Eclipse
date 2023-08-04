package com.xworkz.spicy.app;

public class HairCutSaloonRule implements SaloonRule,CleanSaloonRule{

	@Override
	public String cleaning() {
		System.out.println("Invoking cleaning method from SaloonRule");
		return null;
	}

	@Override
	public int timings() {
		System.out.println("Invoking timings method from CleanSaloonRule");
		return 0;
	}
	

}

