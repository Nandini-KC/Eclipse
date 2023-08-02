package com.xworkz.car.runner;

import com.xworkz.car.implementation.BMW;
import com.xworkz.car.abstractApp.Car;
import com.xworkz.car.implementation.Hyundai;

public class CarRunner {

	public static void main(String[] args) {
		Car bmw=new BMW();
		bmw.milage();
		BMW bmw1=new BMW();
		bmw1.moving();
		bmw1.speed();
		Hyundai ref=new Hyundai();
		ref.moving();
		ref.speed();
		
		
	}

}