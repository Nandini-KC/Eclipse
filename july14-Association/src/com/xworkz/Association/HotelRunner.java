package com.xworkz.Association;

public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Hotel runner");
		Hotel hotel=new Hotel("Meghana foods","Jaynagar");
		hotel.setType("Non_veg");
		hotel.printInfo();
		
		Hotel hotel1=new Hotel("Grand prabha foods","Jaynagar");
		hotel1.setType("veg");
		hotel1.printInfo();
		
	}

}
