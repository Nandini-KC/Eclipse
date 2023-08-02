package com.xworkz.bag.runner;

import com.xworkz.bag.abstractApp.*;
import com.xworkz.bag.implementation.*;

public class BagRunner {

	public static void main(String[] args) {
		Bag bag=new AmericanTourister();
		bag.travelling();
		AmericanTourister ref=new AmericanTourister();
		ref.carrying();
		ref.waterProof();
		Imax imax=new Imax();
		imax.carrying();
		imax.waterProof();
	}

}
