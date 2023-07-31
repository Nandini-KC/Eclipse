package com.xworkz.finalexample.app;

public class Airport {
	final String airportName="Air India";
	int noOfPlanes;
	public Airport(int noOfPlanes) {
		super();
		this.noOfPlanes = noOfPlanes;
	}
	public void print()
	{
		System.out.println("Air port name="+this.airportName);
		System.out.println("No of planes="+this.noOfPlanes );
	}
	public static void main(String[] args)
	{
		Airport airport=new Airport(100);
		airport.print();
	}
	
}
