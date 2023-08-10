package com.xworkz.karnataka.app;

public interface HospitalNamesRepository {
	int TOTAL_HOSPITALS=5;
	String names(String hospitalName);
	default void print()
	{
		
	}
	
}
