package com.xworkz.car.implementation;

import com.xworkz.car.abstractApp.Car;

public  class BMW extends Car{
	
	@Override
	public void moving() {
		System.out.println("BMW is moving");
		
	}

	@Override
	public void speed() {
		System.out.println("BMW has full speed");
		
	}

}