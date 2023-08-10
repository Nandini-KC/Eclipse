package com.xworkz.karnataka.app;

public class ArmyNamesRepositoryImpl implements ArmyNamesRepository
{
	private String[] names=new String[TOTAL_NAMES];
	private int start=0;
	@Override
	public String army(String armyNames) {
		System.out.println("Invoking army in ArmyNamesRepositoryImpl");
		if(start<TOTAL_NAMES)
		{
			System.out.println("Index at "+this.start);
			this.names[start]=armyNames;
			System.out.println("Name of army at index="+names[start]);
			start++;
			System.out.println("Index after increament= "+this.start);
		}
		return null;
	}
	public void print()
	{
		for(start=0;start<names.length;start++)
		{
			System.out.println("Army name at index "+start+"is ="+names[start]);
		}
	}

}
