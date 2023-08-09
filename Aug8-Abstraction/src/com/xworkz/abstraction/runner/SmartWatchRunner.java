package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.implementation.AppleWatch;
import com.xworkz.abstraction.user.ViratKohliWatch;
import com.xworkz.anstraction.rule.SmartWatch;

public class SmartWatchRunner {

	public static void main(String[] args) {
		SmartWatch smart=new AppleWatch();
		smart.warranty();
		
		ViratKohliWatch virat=new ViratKohliWatch(smart);
		virat.showTime();

	}

}
