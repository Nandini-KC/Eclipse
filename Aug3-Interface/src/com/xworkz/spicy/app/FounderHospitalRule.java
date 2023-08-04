package com.xworkz.spicy.app;

public class FounderHospitalRule implements HospitalRule,TreatmentHospitalRule{

	@Override
	public int operationBill() {
		System.out.println("Invoking operationBill method from HospitalRule");
		return 0;
	}

	@Override
	public int noOfDoctors() {
		System.out.println("Invoking noOfDoctors method from HospitalRule");
		return 0;
	}
	

}
