package com.xworkz.spicy.app;

public class ManagerTheatreRule implements TheatreRule,OnlineBookingTgeatreRule{

	@Override
	public int ticketCost() {
		System.out.println("Invoking ticketCost method from  TheatreRule");
		return 0;
	}

	@Override
	public String movie() {
		System.out.println("Invoking movie method from  OnlineBookingTgeatreRule");
		return null;
	}
	

}
