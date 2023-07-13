package com.Xworkz.First_project;

public class MotherBoard {
	static String type;
	int cost;
	static void displayStatic()
	{	
		type="ASRock";
	}
	MotherBoard(int cost)
	{
		this.cost=cost;
	
	}
	void display()
	{
		System.out.println("MotherBoard type ="+MotherBoard.type);
		System.out.println("cost of MotherBoard="+this.cost);
	}
}
