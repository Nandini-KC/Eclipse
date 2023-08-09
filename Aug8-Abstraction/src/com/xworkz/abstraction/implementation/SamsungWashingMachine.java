package com.xworkz.abstraction.implementation;

import com.xworkz.anstraction.rule.WashingMachine;

public class SamsungWashingMachine implements WashingMachine{

	@Override
	public boolean wash(int items) {
		System.out.println("Invoking wash in SamsungWashingMachine");
		return false;
	}

	@Override
	public boolean dry() {
		System.out.println("Invoking dry in SamsungWashingMachine");
		return false;
	}

}
