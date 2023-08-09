package com.xworkz.abstraction.user;

import com.xworkz.anstraction.rule.Elevator;

public class JoshElevator {
	Elevator moving;

	public JoshElevator(Elevator moving) {
		super();
		this.moving = moving;
	}
	public void carryLagguage()
	{
		if(moving!=null)
		{
			System.out.println("Moving is fine,elevator is good working");
			this.moving.capacity();
		}
		else
		{
			System.err.println("elevator is not Moving");
		}
	}
}
