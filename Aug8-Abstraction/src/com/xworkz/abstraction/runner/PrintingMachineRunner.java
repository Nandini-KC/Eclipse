package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.implementation.HpPrintingMachine;
import com.xworkz.abstraction.user.RashmikaMandanna;
import com.xworkz.anstraction.rule.PrintingMachine;

public class PrintingMachineRunner {

	public static void main(String[] args) {
		PrintingMachine machine=new HpPrintingMachine();
		machine.manufacture();
		
		RashmikaMandanna rashmika=new RashmikaMandanna(machine);
		rashmika.print();

	}

}
