package com.xworkz.abstraction.implementation;

import com.xworkz.anstraction.rule.WaterPurifier;

public class AquaWaterFilter implements WaterPurifier{

	@Override
	public boolean filter() {
		System.out.println("Invoking filter in AquaWaterFilter");
		return true;
	}

}
