package com.xworkz.encapsulation.runner;
import com.xworkz.encapsulation.app.*;
public class MixtureRunner {

	public static void main(String[] args) {
		Mixture mixture=new Mixture();
		System.out.println(mixture);
		
		mixture.setBrand("MTR");
		mixture.setColor("pink");
		mixture.setFresh(true);
		mixture.setQuantity(43);
		mixture.setType("Home made");
		System.out.println(mixture);
	}

}
