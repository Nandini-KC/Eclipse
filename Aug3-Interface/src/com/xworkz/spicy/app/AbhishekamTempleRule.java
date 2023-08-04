package com.xworkz.spicy.app;

public class AbhishekamTempleRule implements TempleRule,DevoteeTempleRule{

	@Override
	public int templeOpening() {
		System.out.println("Invoking templeOpening method from TempleRule");
		return 0;
	}

	@Override
	public String traditionalWear() {
		System.out.println("Invoking traditionalWear method from DevoteeTempleRule");
		return null;
	}
	

}
