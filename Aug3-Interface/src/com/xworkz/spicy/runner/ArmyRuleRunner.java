package com.xworkz.spicy.runner;
import com.xworkz.spicy.app.*;
public class ArmyRuleRunner {

	public static void main(String[] args) {
		AgeLimitArmyRule army=new AgeLimitArmyRule();
		army.physicalStandard();
		army.singleMan();
		army.age();

	}

}
