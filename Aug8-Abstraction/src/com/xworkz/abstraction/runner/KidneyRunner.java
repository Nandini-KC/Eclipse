package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.implementation.ReddishBrownKidney;
import com.xworkz.abstraction.user.ParveenRaniKidney;
import com.xworkz.anstraction.rule.Kidney;

public class KidneyRunner {

	public static void main(String[] args) {
		Kidney kidney=new ReddishBrownKidney();
		kidney.removeWaste();
		
		ParveenRaniKidney parveen=new ParveenRaniKidney(kidney);
		parveen.clean();
	}

}
