package com.xworkz.topic.app;

public class Mountain {
	int noOfMountains;
	String location;
	public Mountain()
	{
		System.out.println("Invoking no-args const in Mountain");
	}
	public Mountain(int noOfMountains, String location) {
		super();
		this.noOfMountains = noOfMountains;
		this.location = location;
	}
	public void printInfo()
	{
		System.out.println("No of mountains="+this.noOfMountains);
		System.out.println("Location name="+this.location);
	}
}
