package com.xworkz.abstraction.implementation;

import com.xworkz.anstraction.rule.SmartWatch;

public class AppleWatch implements SmartWatch {

	@Override
	public int warranty() {
		System.out.println("Invoking warranty in AppleWatch");
		return 0;
	}

}
