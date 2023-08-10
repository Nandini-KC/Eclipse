package com.xworkz.karnataka.app;

public class PoliticianNamesRepositoryImpl implements PoliticianNamesRepository{
	private String[] politicians=new String[TOTAL_POLITICIANS];
	private int index=0;
	@Override
	public String name(String politicianName) {
		System.out.println("Invoking name in PoliticianNamesRepositoryImpl");
		if(index<TOTAL_POLITICIANS)
		{
			System.out.println("index at "+this.index);
			this.politicians[index]=politicianName;
			System.out.println("Name of politician="+politicians[index]);
			index++;
			System.out.println("Index after incerament="+this.index);
		}
		return null;
	}
	public void display()
	{
		for(index=0;index<politicians.length;index++)
		{
			System.out.println("Politician name at index "+index+" is="+politicians[index]);
		}
	}

}
