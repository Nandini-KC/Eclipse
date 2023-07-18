package com.Xworkz.casting;

public class PumaShoe extends Shoe{
	
	String model;
	String origin;
	PumaShoe(String model,String origin,int price,ShoeSize size,ShoeColor color)
	{
		super(price,size,color);
		this.model=model;
		this.origin=origin;
		
	}
	void printInfo()
	{
		System.out.println("Invoking method in pumashoe");
		System.out.println("Puma shoe Model="+this.model);
		System.out.println("Puma shoe origin="+this.origin);
		System.out.println("Shoe price="+this.price);
		System.out.println("shoe size="+this.size);
		System.out.println("shoe color="+this.color);

	}
	
}
