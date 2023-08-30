package com.xworkz.date.app;
import java.time.LocalDate;
public class LocalDateRunner extends Local{

	public static void main(String[] args) {
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		
		LocalDate past=LocalDate.of(2023, 4, 21);
		System.out.println(past);
		
		LocalDate future=LocalDate.of(2024,12,24);
		System.out.println(future);
		
		boolean result=localDate.isEqual(past);
		System.out.println("result is "+result);
		
		boolean result1=future.isAfter(past);
		System.out.println("result is "+result1);
		
		boolean result2=past.isBefore(future);
		System.out.println("result is "+result2);
		
		boolean result3=past.isAfter(future);
		System.out.println("result is "+result3);

	}

}
