package com.xworkz.car.abstractApp;

public abstract class Car {
	public abstract void moving();
	public abstract void speed();
	public final boolean stop()
	{
		return true;
	}
	public void milage()
	{
		System.out.println("Car has milage");
	}
	
}





