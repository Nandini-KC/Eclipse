package com.xworkz.dosa.app;

public class PlainDosa implements Dosa,MasalaDosa,EggDosa{

	@Override
	public int eggs() {
		System.out.println("Invoking eggs method in PlainDosa");
		return 0;
	}

	@Override
	public String masala() {
		System.out.println("Invoking masala method in PlainDosa");
		return null;
	}

	@Override
	public String tasty() {
		System.out.println("Invoking tasty method in PlainDosa");
		return null;
	}


}
