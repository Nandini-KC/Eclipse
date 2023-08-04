package com.xworkz.spicy.app;

public class DailyStudyHomeRule implements HomeRule,SleepEarlyHomeRule{

	@Override
	public int timingsForWakeUp() {
		System.out.println("Invoking timingsForWakeUp method from HomeRule");
		return 0;
	}

	@Override
	public int studyWell() {
		System.out.println("Invoking studyWell method from SleepEarlyHomeRule");
		return 0;
	}

}
