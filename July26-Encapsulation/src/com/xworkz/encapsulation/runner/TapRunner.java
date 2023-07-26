package com.xworkz.encapsulation.runner;
import com.xworkz.encapsulation.app.*;
public class TapRunner {

	public static void main(String[] args) {
			Tap tap=new Tap();
			System.out.println(tap);
			
			tap.setBrand("Hindware");
			tap.setColor("Red");
			tap.setMaterial("plastic");
			tap.setPrice(50);
			tap.setType("Wall mounted tap");
			System.out.println(tap);
	}

}
