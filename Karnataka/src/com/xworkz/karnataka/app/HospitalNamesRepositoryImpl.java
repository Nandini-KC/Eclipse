package com.xworkz.karnataka.app;

public class HospitalNamesRepositoryImpl implements HospitalNamesRepository{
	private String[] hospitals=new String[TOTAL_HOSPITALS];
	private int index=0;
	@Override
	public String names(String hospitalName) {
		System.out.println("Invoking names in HospitalNamesRepositoryImpl");
		if(index<TOTAL_HOSPITALS)
		{
			System.out.println("Index at="+this.index);
			this.hospitals[index]=hospitalName;
			System.out.println("Name of hospital at index="+hospitals[index]);
			index++;
			System.out.println("Index after increament="+this.index);
		}
		else
		{
			System.err.println("Index is exceeded,gives exception");
		}
		return null;
	}
	public void print()
	{
		for(int start=0;start<hospitals.length;start++)
		{
			System.out.println("Hospital name at index "+start+" is = "+hospitals[start]);
		}
	}
	
	

}
