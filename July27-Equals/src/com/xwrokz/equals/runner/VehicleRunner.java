package com.xwrokz.equals.runner;

import com.xworkz.equals.app.*;

public class VehicleRunner {

	public static void main(String[] args) {
		System.out.println("Running main in VehicleRunner");
		Vehicle temp = new Vehicle("Car", 200000, "Banglore", "Tata motors", 2);
		Vehicle temp1 = new Vehicle("Bus", 200000, "Banglore", "Tata motors", 2);
		System.out.println(temp.equals(temp1));
	}

}
