package com.xworkz.karnataka.runner;

import com.xworkz.karnataka.app.PoliticianNamesRepository;
import com.xworkz.karnataka.app.PoliticianNamesRepositoryImpl;

public class PoliticianNamesRepositoryRunner {

	public static void main(String[] args) {
		PoliticianNamesRepository ref=new PoliticianNamesRepositoryImpl();
		ref.name("ChandraBabu");
		ref.name("Jagan");
		ref.name("Pavan kalyan");
		ref.name("Kodali Nani");
		ref.name("Venkatarami reddy");
		
		ref.display();
	}

}
