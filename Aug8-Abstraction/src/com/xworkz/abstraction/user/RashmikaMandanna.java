package com.xworkz.abstraction.user;

import com.xworkz.anstraction.rule.PrintingMachine;

public class RashmikaMandanna {
	PrintingMachine machine;

	public RashmikaMandanna(PrintingMachine machine) {
		super();
		this.machine = machine;
	}
	public void print()
	{
		if(machine!=null)
		{
			System.out.println("Machine is not null,it works fine");
			this.machine.manufacture();
		}
		else
		{
			System.err.println("machine is not works");
		}
	}
}
