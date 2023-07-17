package com.Xworkz.inheritance;

public class Strength {
	String type;
	int count;
	String currencyName;
	Strength()
	{
		System.out.println("Invoking no-args const in Strength");
	}
	Strength(String type,int count,String currencyName)
	{
	
		this.type=type;
		this.count=count;
		this.currencyName=currencyName;
	}
	void printInfo()
	{
		System.out.println("Type of money="+this.type);
		System.out.println("Money count ="+this.count);
		System.out.println("curency name ="+this.currencyName);
	}
	
}
