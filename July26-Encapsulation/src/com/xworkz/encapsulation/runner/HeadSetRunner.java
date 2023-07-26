package com.xworkz.encapsulation.runner;
import com.xworkz.encapsulation.app.*;
public class HeadSetRunner {

	public static void main(String[] args) {
		HeadSet head=new HeadSet();
		System.out.println(head);
		head.setBrandName("Boat");
		head.setColor("White");
		head.setCost(2500);
		head.setLength(23);
		head.setType("Bluetooth");
		System.out.println(head);
	}

}
