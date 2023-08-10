package com.xworkz.karnataka.app;

public class OlympicYearRepositoryImpl implements OlympicYearRepository{
	private int[] year=new int[TOTAL_YEARS];
	private int index=0;
	@Override
	public int years(int yearOfOlympics) {
		System.out.println("Invoking years in OlympicYearRepositoryImpl");
		if(index<TOTAL_YEARS)
		{
			System.out.println("Index at="+this.index);
			this.year[index]=yearOfOlympics;
			System.out.println("Year at index ="+year[index]);
			index++;
			System.out.println("Index after increament="+this.index);
		}
		else
		{
			System.err.println("Index is exceeded,getting exception");
		}
		return 0;
	}
	public void display()
	{
		for(int starting=0;starting<year.length;starting++)
		{
			System.out.println("Year at index "+starting+" is ="+year[starting]);
		}
	}
	

}
