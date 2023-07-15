package com.xworkz.Association;

public class Hotel {
	String hotelName;
	String location;
	String hotelType;
	int startingPrice=372;
	Owner owner=new Owner("Yash",30,"Hotel management");
	Owner owner1=new Owner("Uma",32,"BBA");
	Hotel(String hotelName,String location)
	{
		System.out.println("Invoking parameter constructor");
		this.hotelName=hotelName;
		this.location=location;
	}
	void setType(String hotelType)
	{
		this.hotelType=hotelType;
	}
	void printInfo()
	{
		System.out.println("printing all variables");
		System.out.println("Hotel name="+this.hotelName);
		System.out.println("location="+this.location);
		System.out.println("hotel type="+this.hotelType);
		System.out.println("Starting price="+this.startingPrice);
		this.owner.printOwnerInfo();
		this.owner1.printOwnerInfo();
	}
}
