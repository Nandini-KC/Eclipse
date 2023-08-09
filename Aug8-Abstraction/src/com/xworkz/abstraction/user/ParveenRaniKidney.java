package com.xworkz.abstraction.user;

import com.xworkz.anstraction.rule.Kidney;

public class ParveenRaniKidney {
	Kidney controlBlood;

	public ParveenRaniKidney(Kidney controlBlood) {
		super();
		this.controlBlood = controlBlood;
	}
	public void clean()
	{
		if(controlBlood!=null)
		{
			System.out.println("Kidney controls blood ,then kidney works good");
			this.controlBlood.removeWaste();
		}
		else
		{
			System.err.println("Kideny is not control blood,its failed");
		}
	}
}
