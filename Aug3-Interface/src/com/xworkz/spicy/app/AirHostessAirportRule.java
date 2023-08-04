package com.xworkz.spicy.app;

public class AirHostessAirportRule implements AirportRule,VisaAirportRule{

	@Override
	public int ticketCost() {
		System.out.println("Invoking ticketCost method from AirportRule");
		return 0;
	}

	@Override
	public String passport() {
		System.out.println("Invoking passport method from VisaAirportRule");
		return null;
	}

}
