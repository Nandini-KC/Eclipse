package com.xworkz.rocket.abstarctApp;

public abstract class Rocket {
	public abstract void launch();
	public abstract void reachToSpace();
	public final int duration()
	{
		return 0;
	}
	public void budget()
	{
		System.out.println("Spending budget on rocket");
	}
}
