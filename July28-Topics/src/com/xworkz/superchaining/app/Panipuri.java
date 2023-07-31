package com.xworkz.superchaining.app;

public class Panipuri extends FastFood{
	String name;
	int cost;
	public Panipuri(String name,int cost,String location, int types)
	{
		super(location,types);
		this.name=name;
		this.cost=cost;
	}
	@Override
	public void print()
	{
		super.print();
		System.out.println("Name of fast food="+this.name);
		System.out.println("Cost of fast food="+this.cost);
	}
}
