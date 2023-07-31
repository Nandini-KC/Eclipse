package com.xworkz.topic.app;

public class SugarCane extends Agriculture{
	public SugarCane()
	{
		System.out.println("Invoking no-args const in SugarCane");
	}
	public SugarCane(String crops, int duration, int investment, String farmerName) {
		this.crops = crops;
		this.duration = duration;
		this.investment = investment;
		this.farmerName = farmerName;
	}
}
