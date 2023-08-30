package com.xworkz.clone.app;

public class CementRunner {

	public static void main(String[] args) throws CloneNotSupportedException{
		Cement cement=new Cement();
		cement.setBrand("Ultra Tech");
		cement.setBrandAmbassador("Mary Kom");
		cement.setPrice(450);
		cement.setWeight(50);
		System.out.println(cement.toString());
		Cement cement1=(Cement) cement.clone();
		System.out.println(cement1);
		
		cement.setBrand("Ambuja");
		cement.setBrandAmbassador("Ajay kapur");
		cement.setPrice(430);
		cement.setWeight(50);
		System.out.println(cement.toString());
		Cement cement2=(Cement) cement.clone();
		System.out.println(cement2);
		
		
		cement.setBrand("Ramco");
		cement.setBrandAmbassador("RamaSwamy");
		cement.setPrice(420);
		cement.setWeight(50);
		System.out.println(cement.toString());
		Cement cement3=(Cement) cement.clone();
		System.out.println(cement3);
		
		
		cement.setBrand("Dalmia");
		cement.setBrandAmbassador("Mary Kom");
		cement.setPrice(460);
		cement.setWeight(50);
		System.out.println(cement.toString());
		Cement cement4=(Cement) cement.clone();
		System.out.println(cement4);
		
		
		cement.setBrand("Priya");
		cement.setBrandAmbassador("Priya");
		cement.setPrice(455);
		cement.setWeight(50);
		System.out.println(cement.toString());
		Cement cement5=(Cement) cement.clone();
		System.out.println(cement5);
		
	}

}
