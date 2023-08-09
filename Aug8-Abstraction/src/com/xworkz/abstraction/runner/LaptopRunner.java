package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.implementation.AcerLaptop;
import com.xworkz.abstraction.user.SonuSoodLaptop;
import com.xworkz.anstraction.rule.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		Laptop laptop=new AcerLaptop();
		laptop.ram();
		
		SonuSoodLaptop sonu=new SonuSoodLaptop(laptop);
		sonu.display();

	}

}
