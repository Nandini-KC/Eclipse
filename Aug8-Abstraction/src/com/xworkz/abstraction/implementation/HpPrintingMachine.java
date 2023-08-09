package com.xworkz.abstraction.implementation;

import com.xworkz.anstraction.rule.PrintingMachine;

public class HpPrintingMachine implements PrintingMachine {

	@Override
	public String manufacture() {
		System.out.println("Invoking manufacture in HpPrintingMachine");
		return null;
	}

	

}
