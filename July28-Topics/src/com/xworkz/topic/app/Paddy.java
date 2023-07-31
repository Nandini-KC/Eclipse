package com.xworkz.topic.app;

public class Paddy extends Agriculture{
	public Paddy()
	{
		System.out.println("Invoking no-args const in Paddy");
	}
	public Paddy(String crops, int duration, int investment, String farmerName) {
		this.crops = crops;
		this.duration = duration;
		this.investment = investment;
		this.farmerName = farmerName;
	}
}
