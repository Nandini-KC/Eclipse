package com.xworkz.encapsulation.runner;
import com.xworkz.encapsulation.app.*;
public class DosaRunner {

	public static void main(String[] args) {
		Dosa dosa=new Dosa();
		System.out.println(dosa);
		dosa.setPrice(20);
		dosa.setCombination("Chutney");
		dosa.setNoOfDosa(4);
		dosa.setShopName("Portable Dosa shop");
		dosa.setType("Masala Dosa");
		System.out.println(dosa);
		

	}

}
