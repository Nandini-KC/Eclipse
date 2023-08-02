package com.xworkz.mobile.runner;

import com.xworkz.mobile.absatrctApp.Mobile;
import com.xworkz.mobile.implementation.Oneplus;
import com.xworkz.mobile.implementation.Oppo;

public class MobileRunner {

	public static void main(String[] args) {
		Mobile mobile=new Oppo();
		mobile.capturePics();
		Oppo oppo=new Oppo();
		oppo.incoming();
		oppo.outgoing();
		Oneplus oneplus=new Oneplus();
		oneplus.outgoing();
		oneplus.incoming();
	}

}
