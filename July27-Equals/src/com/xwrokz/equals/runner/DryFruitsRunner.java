package com.xwrokz.equals.runner;
import com.xworkz.equals.app.*;
public class DryFruitsRunner {

	public static void main(String[] args) {
		System.out.println("Running main in DryFruitRunner ");
		DryFruit dry=new DryFruit(18,"Almond",1,"Amella Dried Fruits","Happilo Dry Fruit","12/2023");
		DryFruit dry1=new DryFruit(18,"Almond",1,"Amella Dried Fruits","Happilo Dry Fruit","12/2023");
		System.out.println(dry.equals(dry1));
	}

}
