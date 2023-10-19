package com.xworkz.runner;

public class Variables {
	
	public static int num;
	public int num1;
	
	public static void display()
	{
		num=10;
		System.out.println("Statis varibale="+num);
	}
	public void print(int num1)
	{
		this.num1=num1;
		System.out.println("Instance Variable="+num1);
	}
	public void print1()
	{
		int num2=12;
		System.out.println("Local variable="+num2);
	}

	public static void main(String[] args) {
	
		Variables.display();
		Variables var=new Variables();
		var.print(29);
		var.print1();
		
	}

}
