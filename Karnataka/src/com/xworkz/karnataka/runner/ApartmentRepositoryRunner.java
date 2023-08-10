package com.xworkz.karnataka.runner;

import com.xworkz.karnataka.app.ApartmentRepository;
import com.xworkz.karnataka.app.ApartmentRepositoryImpl;

public class ApartmentRepositoryRunner {

	public static void main(String[] args) {
		ApartmentRepository ref=new ApartmentRepositoryImpl();
		System.out.println("Storing apartment names in array");
		ref.name("Venkateswara Apartment");
		ref.name("Balaji Apartment");
		ref.name("Sri sai Apartment");
		ref.name("Siva sai Apartment");
		ref.name("New Ganga Apartment");
		System.out.println("Displaying all the names of Apartments");
		ref.display();

	}

}
