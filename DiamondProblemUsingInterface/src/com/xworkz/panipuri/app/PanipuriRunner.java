package com.xworkz.panipuri.app;

public class PanipuriRunner {

	public static void main(String[] args) {
		Gupchup gupchup=new Bhelpuri();
		gupchup.price();
		gupchup.tasty();
		
		Masalapuri masala=new Bhelpuri();
		masala.price();
		masala.streetFood();
		masala.tasty();
		
		Dahipuri dahi=new Bhelpuri();
		dahi.dahi();
		dahi.price();
		dahi.tasty();
		
		Bhelpuri bhel=new Bhelpuri();
		bhel.dahi();
		bhel.price();
		bhel.streetFood();
		bhel.tasty();
		
	}

}
