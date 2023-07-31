package com.xworkz.runtime.app;

public class Sbi extends Bank{
	public void deposit()
	{
		System.out.println("Invoking deposit method in Sbi");
	}
	@Override
	public void transactions()
	{
		System.out.println("Invoking transactions method in bank");
	}
	public void loans()
	{
		System.out.println("Invoking loans method in bank");
	}
}
