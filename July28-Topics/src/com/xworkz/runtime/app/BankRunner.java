package com.xworkz.runtime.app;

public class BankRunner {

	public static void main(String[] args) {
		Sbi sbi =new Sbi();
		sbi.deposit();
		sbi.transactions();
		sbi.loans();

	}

}
