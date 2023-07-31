package com.xworkz.topic.app;

public class Agriculture {
	String crops;
	int duration;
	int investment;
	String farmerName;
	public Agriculture()
	{
		System.out.println("Invoking no-args const in Agriculture");
	}
	public Agriculture(String crops, int duration, int investment, String farmerName) {
		super();
		this.crops = crops;
		this.duration = duration;
		this.investment = investment;
		this.farmerName = farmerName;
	}
	@Override
	public String toString() {
		return "Crop name="+this.crops+" "+"Duration="+this.duration+" "+"Investment="+this.investment+" "+"Farmer Name="+this.farmerName;
	}
	
}
