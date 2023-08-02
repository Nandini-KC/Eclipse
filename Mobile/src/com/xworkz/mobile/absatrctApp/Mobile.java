package com.xworkz.mobile.absatrctApp;

public abstract class Mobile {
	public abstract void incoming();
	public abstract void outgoing();
	public final int number()
	{
		return 0;
	}
	public void capturePics()
	{
		System.out.println("Mobile captures pics");
	}
}
