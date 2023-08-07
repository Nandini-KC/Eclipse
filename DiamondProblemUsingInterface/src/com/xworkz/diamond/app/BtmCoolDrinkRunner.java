package com.xworkz.diamond.app;

public class BtmCoolDrinkRunner {

	public static void main(String[] args) {
		BtmCoolDrink btm=new CoolDrink();
		btm.cool();
		
		PepsiCoolDrink pepsi=new CoolDrink();
		pepsi.energy();
		pepsi.cool();
		
		CokeCoolDrink coke=new CoolDrink();
		coke.cool();
		coke.flavour();
		
		CoolDrink cool=new CoolDrink();
		cool.cool();
		cool.energy();
		cool.flavour();
		

	}

}
