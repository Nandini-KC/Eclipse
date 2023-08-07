package com.xworkz.pickles.app;

public class LemonPickle implements MangoPickle,TomatoPickle,ChickenPickle{

	@Override
	public String spicy() {
		System.out.println("Invoking spicy method in LemonPickle");
		return null;
	}

	@Override
	public String yummy() {
		System.out.println("Invoking yummy method in LemonPickle");
		return null;
	}

	@Override
	public String veryTasty() {
		System.out.println("Invoking veryTasty method in LemonPickle");
		return null;
	}
	

}
