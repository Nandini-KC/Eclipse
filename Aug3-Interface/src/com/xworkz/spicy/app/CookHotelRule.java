package com.xworkz.spicy.app;

public class CookHotelRule implements HotelRule,FoodHotelRule{

	@Override
	public String foodItems() {
		System.out.println("Invoking foodItems from HotelRule");
		return null;
	}

	@Override
	public int timings() {
		System.out.println("Invoking timings from FoodHotelRule");
		return 0;
	}
	

}
