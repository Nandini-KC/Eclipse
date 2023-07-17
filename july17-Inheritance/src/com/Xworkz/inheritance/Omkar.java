package com.Xworkz.inheritance;

public class Omkar extends Architect{
	Omkar(){
		System.out.println("Invoking no-args const in omkar");
	}
	Omkar(String name,int age,int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
}
