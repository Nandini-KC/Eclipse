package com.xworkz.diamond.app;

public class CoolDrink implements BtmCoolDrink,PepsiCoolDrink,CokeCoolDrink{

	@Override
	public String flavour() {
		System.out.println("Invoking flavour in CoolDrink");
		return null;
	}

	@Override
	public int energy() {
		System.out.println("Invoking energy in CoolDrink");
		return 0;
	}

	@Override
	public void cool() {
		System.out.println("Invoking flavour in CoolDrink");
		
	}
	

}
