package com.xworkz.Task;

public class Temple {
	String godName;
	int timings;
	String location="BTM";
	TempleName nameOfTemple;
	Temple(TempleName nameOfTemple)
	{
		
		this.nameOfTemple=nameOfTemple;
	}
	void time(int timings)
	{
		this.timings=timings;
	}
	void display()
	{
		System.out.println("God name="+this.godName);
		System.out.println("Timings="+this.timings);
		System.out.println("location of Temple="+this.location);
		System.out.println("Temple name="+this.nameOfTemple);
	}
}
