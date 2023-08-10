package com.xworkz.karnataka.app;

public interface ApartmentRepository {
	int TOTAL_APARTMENTS=5;
	String name(String nameOfApartment);
	default void display()
	{
		
	}
	
}
