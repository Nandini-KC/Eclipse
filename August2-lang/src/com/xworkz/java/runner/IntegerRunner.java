package com.xworkz.java.runner;
import com.xworkz.java.lang.*;
public class IntegerRunner {

	public static void main(String[] args) {
		Integers instance = new Integers();
        
        instance.printStringLength("Hello, World!");
        instance.convertStringToUpperCase("java");
        instance.calculateSquareRoot(25.0);
        instance.printCharacterASCII('A');
        instance.printBooleanValue(true);
        
        int sum = Integers.addNumbers(10, 20);
        System.out.println("Sum of two numbers: " + sum);
        
        double area = Integers.calculateCircleArea(5.0);
        System.out.println("Area of the circle: " + area);
        
        String reversedStr = Integers.reverseString("Hello");
        System.out.println("Reversed string: " + reversedStr);
        
        boolean isEven = Integers.isEven(7);
        System.out.println("Is the number even? " + isEven);
        
        int[] numbers = { 12, 45, 8, 22, 17 };
        int maxNum = Integers.findMax(numbers);
        System.out.println("Maximum number in the array: " + maxNum);
	}

}
