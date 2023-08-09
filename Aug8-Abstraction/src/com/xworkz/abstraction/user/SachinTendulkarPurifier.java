package com.xworkz.abstraction.user;

import com.xworkz.anstraction.rule.WaterPurifier;

public class SachinTendulkarPurifier {
	WaterPurifier purify;

	public SachinTendulkarPurifier(WaterPurifier purify) {
		super();
		this.purify = purify;
	}
	public void removeImpurities()
	{
		if(purify!=null)
		{
			System.out.println("Water purifier purify ,remove impurities");
			this.purify.filter();
		}
		else
		{
			System.err.println("Water purifier not purify water ");
		}
	}
}
