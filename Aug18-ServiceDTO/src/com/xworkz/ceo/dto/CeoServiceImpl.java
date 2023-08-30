package com.xworkz.ceo.dto;

public class CeoServiceImpl implements CeoService{

	@Override
	public void saveAndValidate(CeoDTO ceo) {
		System.out.println("Valid data"+ceo);
		String name=ceo.getName();
		String company=ceo.getCompanyName();
		int salary=ceo.getSalary();
		int exp=ceo.getExperience();
		if(ceo!=null)
		{
			if(name!=null && !ceo.getName().isEmpty() && name.length()>3 && name.length()<30)
			{
				System.out.println("CEO name is valid ="+name);
			}
			else
			{
				System.err.println("Ceo name is not valid"+name);
			}
			if(company!=null && !company.isEmpty() && company.length()>3 && company.length()<30)
			{
				System.out.println("Company name is valid="+company);
			}
			else
			{
				System.err.println("Company name is not valid");
			}
			if(salary>0 && salary<10000000)
			{
				System.out.println("Salary is valid="+salary);
				
			}
			else
			{
				System.err.println("Salary is not valid"+salary);
			}
			if(exp>0 && exp<30)
			{
				System.out.println("Experience is valid="+exp);
			}
			else
			{
				System.err.println("Experience is not valid"+exp);
			}
		}
		
	}
	

}
