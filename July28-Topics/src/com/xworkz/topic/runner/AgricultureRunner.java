package com.xworkz.topic.runner;
import com.xworkz.topic.app.*;
public class AgricultureRunner {

	public static void main(String[] args) {
		
		
		Agriculture ref=new Agriculture();
		Paddy paddy=new Paddy();
		Paddy paddy1=new Paddy("Paddy",3,25000,"Vasu");
		System.out.println(paddy1.toString());
		SugarCane sugar=new SugarCane();
		SugarCane sugarcane1=new SugarCane("SugarCane",12,100000,"Thipaiah");
		System.out.println(sugarcane1.toString());
		

	}

}
