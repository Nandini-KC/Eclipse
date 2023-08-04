package com.xworkz.spicy.app;

public class AgeLimitArmyRule implements ArmyRule,UnmarriedArmyRule
{

	@Override
	public int physicalStandard() {
		System.out.println("Invoking physicalStandard method in AgeLimitArmyRule");
		return 0;
	}

	@Override
	public String singleMan() {
		System.out.println("Invoking singleMan method in AgeLimitArmyRule");
		return null;
	}

	@Override
	public int age() {
		System.out.println("Invoking age method in AgeLimitArmyRule");
		return 0;
	}


}
