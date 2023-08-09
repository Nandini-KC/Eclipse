package com.xworkz.abstraction.user;

import com.xworkz.anstraction.rule.SmartWatch;

public class ViratKohliWatch {
	SmartWatch model;

	public ViratKohliWatch(SmartWatch model) {
		super();
		this.model = model;
	}
	public void showTime()
	{
		if(model!=null)
		{
			System.out.println("Model is good,its show exact time..");
			this.model.warranty();
		}
		else
		{
			System.err.println("Model is bad");
		}
	}
}
