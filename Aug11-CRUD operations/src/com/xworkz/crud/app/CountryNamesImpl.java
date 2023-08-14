package com.xworkz.crud.app;

public class CountryNamesImpl implements CountryNames{
	private String[] names=new String[TOTAL_COUNTRIES];
	private int index=0;
	@Override
	public void save(String countries) {
		
		if(this.index<TOTAL_COUNTRIES)
		{
			this.names[index]=countries;
			index++;
		}
		
	}
	public void display()
	{
		for(int start=0;start<TOTAL_COUNTRIES;start++)
		{
			System.out.println("Country name at index "+start+" is "+names[start]);
		}
	}
	
	@Override
	public boolean isExist(String countries) {
		for(int pos=0;pos<names.length;pos++)
		{
			String ref=names[pos];
			if(ref.equalsIgnoreCase(countries))
			{
				System.out.println("True");
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	@Override
	public String findReturnUppercase(String countries) {
		for(int start=0;start<names.length;start++)
		{
			String ref=names[start];
			if(ref.equalsIgnoreCase(countries))
			{
				
					System.out.println("Uppercase="+ref.toUpperCase());
				
			}
			
		}
		return null;
	}
	@Override
	public String[] findStartsWith(String countries) {
		String[] temp=new String[TOTAL_COUNTRIES];
		int pos=0;
		for(int index=0;index<names.length;index++)
		{
			String ref=names[index];
			if(ref.startsWith(countries))
			{
				
					temp[pos]=ref;
					pos++;
				
				
			}
			
		}
		return temp;
	}
	@Override
	public String[] findEndsWith(String countries) {
		String[] array=new String[TOTAL_COUNTRIES];
		int pos=0;
		for(int index=0;index<names.length;index++)
		{
			String ref=names[index];
			if(ref.endsWith(countries))
			{
				
					array[pos]=ref;
					pos++;
				
				
			}
			
		}
		return array;
	}
	@Override
	public String[] findMatching(String countries) {
		String[] array=new String[TOTAL_COUNTRIES];
		int pos=0;
		for(int index=0;index<names.length;index++)
		{
			String ref=names[index];
			if(ref.matches(countries))
			{
				
					array[pos]=ref;
					pos++;
				
				
			}
			
		}
		return null;
	}
	@Override
	public int savedCount() {
		String[] arrays=new String[TOTAL_COUNTRIES];
		int pos=0;
		for(int index=0;index<names.length;index++)
		{
			String ref=names[index];
			if(ref!=null)
			{
				
					arrays[pos]=ref;
					pos++;
				
			}
			
		}
			System.out.println("Saved countries count ="+arrays.length);
		
		return 0;
	}
	

}
