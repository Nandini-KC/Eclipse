package com.xworkz.string.app;

public class Example2 {
	public static void main(String[] args)
	{
	String location="Belagavi";
	char ref=location.charAt(1);
	System.out.println(ref);
	String ref1=location.concat("Banglore");
	System.out.println(ref1);
	String ref3=location.substring(2);
	System.out.println(ref3);
	int ref4=location.indexOf('g');
	System.out.println(ref4);
	location.split();
	location.equalsIgnoreCase("karnataka");
	location.equals("Banglore");
	location.compareToIgnoreCase("");
	location.toCharArray();
	location.toLowerCase();
	location.toUpperCase();
	location.isEmpty();
	location.length();
	location.startsWith("k");
	location.replace("k", "m");
	location.replaceAll("karnataka", "Chittoor");
	String.valueOf(false);
	}
}
