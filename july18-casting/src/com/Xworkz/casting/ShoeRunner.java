package com.Xworkz.casting;

public class ShoeRunner {

	public static void main(String[] args) {
		PumaShoe puma=new PumaShoe("Casual wear","Germany",234,ShoeSize.FIVE,ShoeColor.BLACK);
		puma.printInfo();
		NikeShoe nike=new NikeShoe("Philip Hampson Knight","Michael Jordan",345,ShoeSize.FOUR,ShoeColor.BROWN);
		nike.printInfoo();
	}

}
