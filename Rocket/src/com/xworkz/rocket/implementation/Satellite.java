package com.xworkz.rocket.implementation;
import com.xworkz.rocket.abstarctApp.*;
public class Satellite extends Rocket{

	@Override
	public void launch() {
		System.out.println("Launchig the rocket");
		
	}

	@Override
	public void reachToSpace() {
		System.out.println("Rocket reached to space");
		
	}
	

}
