package com.xworkz.java.lang;

public class Integers {
	public void printStringLength(String str) {
        System.out.println("Length of the string: " + str.length());
    }
    
    public void convertStringToUpperCase(String str) {
        System.out.println("Uppercase string: " + str.toUpperCase());
    }
    
    public void calculateSquareRoot(double number) {
        System.out.println("Square root of " + number + ": " + Math.sqrt(number));
    }
    
    public void printCharacterASCII(char ch) {
        System.out.println("ASCII value of " + ch + ": " + (int) ch);
    }
    
    public void printBooleanValue(boolean value) {
        System.out.println("Boolean value: " + value);
    }
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num=0;num<array.length;num++) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
	
}
