package com.Xworkz.inheritance;

public class Money extends Strength{
	
	Money()
	{
		System.out.println("Invoking no-args const in Money");
	}
	Money(String type,int count,String currencyName)
	{
		super(type,count,currencyName);
		this.type=type;
		this.count=count;
		this.currencyName=currencyName;
	}
	
}
