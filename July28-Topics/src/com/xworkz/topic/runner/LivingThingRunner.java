package com.xworkz.topic.runner;
import com.xworkz.topic.app.*;
public class LivingThingRunner {

	public static void main(String[] args) {
		//Humanbeing human=new Humanbeing();
		Male male1=new Male();
		Male male=new Male(100,"Male",21,"5");
		male.printInfo();
		
		Female female1=new Female();
		Female female=new Female(100,"Female",21,"5");
		female.printInfo();

	}

}
