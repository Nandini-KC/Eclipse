package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.implementation.AquaWaterFilter;
import com.xworkz.abstraction.user.SachinTendulkarPurifier;
import com.xworkz.anstraction.rule.WaterPurifier;

public class WaterPurifierRunner {

	public static void main(String[] args) {
		WaterPurifier water=new AquaWaterFilter();
		water.filter();
		
		SachinTendulkarPurifier sachin=new SachinTendulkarPurifier(water);
		sachin.removeImpurities();

	}

}
