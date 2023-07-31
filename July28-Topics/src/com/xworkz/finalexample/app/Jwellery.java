package com.xworkz.finalexample.app;

public class Jwellery {
	String jwelleryName;
	int cost;
	public  Jwellery(String jwelleryName, int cost) {
		super();
		this.jwelleryName = jwelleryName;
		this.cost = cost;
	}
	public final void print()
	{
		System.out.println("Jwellery name="+this.jwelleryName);
		System.out.println("cost="+this.cost);
	}
	public static void main(String[] args)
	{
		System.out.println("Running main in jwellery");
		Jwellery ref=new Jwellery("Necklace",200000);
		ref.print();
	}
	
	
}
