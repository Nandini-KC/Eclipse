package com.xworkz.abstraction.user;

import com.xworkz.anstraction.rule.Laptop;

public class SonuSoodLaptop {
	Laptop processor;

	public SonuSoodLaptop(Laptop processor) {
		super();
		this.processor = processor;
	}
	public void display()
	{
		if(processor!=null)
		{
			System.out.println("Processor is good,Then laptop works fine");
			this.processor.ram();
		}
		else
		{
			System.err.println("Processor is not good,laptop is not works properly");
		}
	}
}
