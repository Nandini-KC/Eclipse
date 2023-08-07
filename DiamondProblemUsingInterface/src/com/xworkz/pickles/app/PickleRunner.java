package com.xworkz.pickles.app;

public class PickleRunner {

	public static void main(String[] args) {
		MangoPickle mango=new LemonPickle();
		mango.veryTasty();
		mango.cost();
		
		TomatoPickle tomato=new LemonPickle();
		tomato.veryTasty();
		tomato.yummy();
		tomato.brand();
		tomato.cost();
		
		ChickenPickle chicken=new LemonPickle();
		chicken.spicy();
		chicken.veryTasty();
		chicken.cost();
		chicken.shopName();
		
		LemonPickle lemon=new LemonPickle();
		lemon.spicy();
		lemon.veryTasty();
		lemon.yummy();
		lemon.brand();
		lemon.cost();
		lemon.shopName();
		
		

	}

}
