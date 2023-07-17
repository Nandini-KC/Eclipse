package com.Xworkz.inheritance;

public class City {
	String cityName;
	int noOfPlaces;
	String famous;
	City()
	{
		System.out.println("Invoking no-args const in city");
	}
	City(String cityName,int noOfPlaces,String famous)
	{
		this.cityName=cityName;
		this.noOfPlaces=noOfPlaces;
		this.famous=famous;
	}
	void printInfo()
	{
		System.out.println("City name="+this.cityName);
		System.out.println("No of places="+this.noOfPlaces);
		System.out.println("Famous for="+this.famous);
	}
}
