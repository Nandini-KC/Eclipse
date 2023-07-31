package com.xworkz.casting.app;

public class FruitRunner {

	public static void main(String[] args) {
		Apple apple=new Apple("Red",true,200,"red","Kashmir");
		FruitsCasting.printInfo(apple);
		
		Banana banana=new Banana("Karpooravalli",100,150,"yellow","Andhra pradesh");
		FruitsCasting.printInfo(banana);
	}

}
