package com.Xworkz.inheritance;

public class Banglore extends City{

		Banglore()
		{
			System.out.println("Invoking no-args const in banglore");
		}
		Banglore(String cityName,int noOfPlaces,String famous)
		{
			super(cityName,noOfPlaces,famous);
			this.cityName=cityName;
			this.noOfPlaces=noOfPlaces;
			this.famous=famous;
		}
}
