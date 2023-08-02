package com.xworkz.car.implementation;

import com.xworkz.car.abstractApp.Car;

public class Hyundai extends Car{

	

	@Override
	public void speed() {
		System.out.println("Hyundai has high speed");
		
	}

	@Override
	public void moving() {
		System.out.println("Hyundai has moving");
		
	}
	
}