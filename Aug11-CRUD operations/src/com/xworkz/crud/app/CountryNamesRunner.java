package com.xworkz.crud.app;

public class CountryNamesRunner {

	public static void main(String[] args) {
		CountryNamesImpl country=new CountryNamesImpl();
		country.save("India");
		country.save("America");
		country.save("Sri lanka");
		country.save("Germany");
		country.save("Australia");
		country.save("UKS");
		country.save("Thailand");
		country.save("China");
		country.save("Bangladesh");
		country.save("India");
		
		
		country.savedCount();
		country.display();
		System.out.println("---------------");
		country.isExist("India");
		System.out.println("---------------");
		country.findReturnUppercase("India");
		System.out.println("---------------");
		String[] ref1=country.findStartsWith("Bangla");
		for(int index=0;index<ref1.length;index++)
		{
			
			if(ref1[index]!=null)
			{
				System.out.println("Country names starts with letter "+ref1[index]);
			}
		}
		System.out.println("---------------");
		String[] ref2=country.findEndsWith("a");
		for(int index=0;index<ref1.length;index++)
		{
			
			if(ref2[index]!=null)
			{
				System.out.println("Country names starts with letter "+ref2[index]);
			}
		}
		System.out.println("---------------");
		String[] ref3=country.findEndsWith("lanka");
		for(int index=0;index<ref3.length;index++)
		{
			
			if(ref3[index]!=null)
			{
				System.out.println("Country names starts with letter "+ref3[index]);
			}
		}
				
			
	}

}
