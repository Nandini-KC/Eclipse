package com.xworkz.brandDTO;

public class ConstructorChaining {
	public String name;
	public int age;
	public String district;
	ConstructorChaining(String name)
	{
		this.name=name;
	}
	ConstructorChaining(String name,int age)
	{
		this(name);
		this.age=age;
	}
	ConstructorChaining(String name,int age,String district)
	{
		this(name,age);
		this.district=district;
	}
	public static void main(String[] args) {
		ConstructorChaining constructor=new ConstructorChaining("Nandu",22,"Chittoor");
		System.out.println("Name ="+constructor.name+ " Age= "+constructor.age+" "+"District= "+constructor.district);
		
		
	}

}
