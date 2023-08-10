package com.xworkz.karnataka.app;

public class ApartmentRepositoryImpl implements ApartmentRepository{
	private String[] names=new String[TOTAL_APARTMENTS];
	private int index=0;
	
	@Override
	public String name(String nameOfApartment) {
		System.out.println("Invoking name in  ApartmentRepositoryImpl");
		if(index<TOTAL_APARTMENTS)
		{
			this.names[index]=nameOfApartment;
			System.out.println("Index at="+this.index);
			System.out.println("Name of apartment="+names[index]);
			index=index+1;
			System.out.println("Index after increasing="+this.index);
		}
		else
		{
			System.err.println("index is exceeded,gives exception");
		}
		
		return null;
	}
	public void display()
	{
		for(int start=0;start<names.length;start++)
		{
			System.out.println("Names at index  "+start+" is ="+names[start]);
		}
	}

	

	
	

}
