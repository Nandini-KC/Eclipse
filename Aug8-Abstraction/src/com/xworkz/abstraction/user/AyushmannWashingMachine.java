package com.xworkz.abstraction.user;

import com.xworkz.anstraction.rule.WashingMachine;

public class AyushmannWashingMachine {
	WashingMachine washing;

	public AyushmannWashingMachine(WashingMachine washing) {
		super();
		this.washing = washing;
	}
	public void removeDirt()
	{
		if(washing!=null)
		{
			System.out.println("Washing is not null,it wash good");
			this.washing.wash(5);
			
		}
		else
		{
			System.err.println("Washing is null,it wash bad");
		}
		if(washing!=null)
		{
			System.out.println("Washing is not null,it dry clothes good");
		}
		else
		{
			System.err.println("Washing is null,it dry nothing");
		}
	}
}
