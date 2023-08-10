package com.xworkz.karnataka.app;

public interface PoliticianNamesRepository {
	int TOTAL_POLITICIANS=5;
	String name(String politicianName);
	default void display()
	{
		
	}
}
