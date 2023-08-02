package com.xworkz.rocket.runner;


import com.xworkz.rocket.abstarctApp.*;
import com.xworkz.rocket.implementation.*;
public class RocketRunner {

	public static void main(String[] args) {
		Rocket rocket=new Satellite();
		rocket.budget();
		Satellite ref=new Satellite();
		ref.reachToSpace();
		ref.launch();
		Chandrayan ref1=new Chandrayan();
		ref1.reachToSpace();
		ref1.launch();

	}

}
