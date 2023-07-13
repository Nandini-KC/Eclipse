package com.xworkz.Task;

public class Battery {
	String brand;
	String color="Black";
	BatteryType type;
	int price;
	Battery(String brand)
	{
		this.brand=brand;
	}
	void batteryType(BatteryType type)
	{
		this.type=type;
	}
	void display()
	{
		System.out.println("Battery brand="+this.brand);
		System.out.println("Battery color="+this.color);
		System.out.println("Battery type="+this.type);
		System.out.println("Battery price="+this.price);
		
	}
}
