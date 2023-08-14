package com.xworkz.crud.app;

public interface CountryNames {
	int TOTAL_COUNTRIES=10;
	void save(String countries);
	default void display()
	{
		
	}
	boolean isExist(String countries);
	String findReturnUppercase(String countries);
	String[] findStartsWith(String countries);
	String[] findEndsWith(String countries);
	String[] findMatching(String countries);
	int savedCount();
	//String[] orderDesc();
	//String[] orderAsc();
}
