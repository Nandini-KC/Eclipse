package com.xworkz.encapsulation.runner;
import  com.xworkz.encapsulation.app.*;
public class HelmetRunner {

	public static void main(String[] args) {
		Helmet helmet=new Helmet();
		System.out.println(helmet);
		
		helmet.setBrand("HJC");
		helmet.setColor("Black");
		helmet.setCost(2000);
		helmet.setGender("female");
		helmet.setSize("small");
		System.out.println(helmet);
	}

}
