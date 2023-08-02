package com.xworkz.bag.abstractApp;

public abstract class Bag {
	public abstract void carrying();
	public abstract void waterProof();
	public final int cost()
	{
		return 0;
	}
	public void travelling()
	{
		System.out.println("Bags are used for travelling");
	}
}
