package com.xworkz.dosa.app;

public class DosaRunner {

	public static void main(String[] args) {
		Dosa dosa=new PlainDosa();
		dosa.spicy();
		dosa.tasty();
		
		MasalaDosa masala=new PlainDosa();
		masala.masala();
		masala.spicy();
		masala.tasty();
		
		EggDosa egg=new PlainDosa();
		egg.eggs();
		egg.spicy();
		egg.tasty();
		
		PlainDosa plain=new PlainDosa();
		plain.eggs();
		plain.masala();
		plain.spicy();
		plain.tasty();

	}

}
