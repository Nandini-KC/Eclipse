package com.Xworkz.First_project;

public class Train {
	static int length;
	 String trainName;
	static void displayStatic()
	{	
		length=650;
	}
	Train(String trainName)
	{
		this.trainName=trainName;
	
	}
	void display()
	{
		System.out.println("train length ="+Train.length);
		System.out.println("train name="+this.trainName);
	}
}
