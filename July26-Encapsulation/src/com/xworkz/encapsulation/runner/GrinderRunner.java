package com.xworkz.encapsulation.runner;
import com.xworkz.encapsulation.app.*;
public class GrinderRunner {

	public static void main(String[] args) {
		Grinder grinder=new Grinder();
		System.out.println(grinder);
		grinder.setCapacity(1000);
		grinder.setColor("Black");
		grinder.setCompanyName("Prestige");
		grinder.setCost(2000);
		grinder.setType("Automatic ");
		System.out.println(grinder);
	}

}
