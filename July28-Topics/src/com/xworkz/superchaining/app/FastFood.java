package com.xworkz.superchaining.app;

public class FastFood {
	String location;
	int types;
	public FastFood(String location, int types) {
		super();
		this.location = location;
		this.types = types;
	}
	public void print()
	{
		System.out.println("LOcation="+this.location);
		System.out.println("Types of fast food="+this.types);
	}
}
