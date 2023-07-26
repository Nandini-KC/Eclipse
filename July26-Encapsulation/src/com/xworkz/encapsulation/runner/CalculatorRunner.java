package com.xworkz.encapsulation.runner;
import com.xworkz.encapsulation.app.*;
public class CalculatorRunner {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		System.out.println(calculator);
		 
		calculator.setCalculatorApp(true);
		calculator.setCompanyName("Casio");
		calculator.setCost(2000);
		calculator.setOnlineCalculator(true);
		calculator.setType("Scientific Calculator");
		
		System.out.println(calculator);

	}

}
