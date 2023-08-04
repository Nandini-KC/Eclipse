package com.xworkz.spicy.app;

public class LocationMetroRule implements MetroRule,ValidTicketMetroRule{

	@Override
	public int validTicket() {
		System.out.println("Invoking validTicket method from MetroRule");
		return 0;
	}

	@Override
	public int ticketCost() {
		System.out.println("Invoking ticketCost method from ValidTicketMetroRule");
		return 0;
	}

}
