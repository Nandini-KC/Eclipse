package com.xworkz.cook.dto;

public class CookServiceImpl implements CookService{

	@Override
	public void saveAndValidate(CookDTO cook) {
		if(cook!=null)
		{
			System.out.println("Cook data is valid");
			String specialization=cook.getSpecialization();
			String hotelName=cook.getHotelName();
			String gender=cook.getGender();
			int salary=cook.getSalary();
			if(specialization!=null && !specialization.isEmpty() && specialization.length()>3 && specialization.length()<30)
			{
				System.out.println(" mechanic specialization is valid "+specialization);
			}
			else
			{
				System.err.println("specialization is not valid");
			}
			if(hotelName!=null && !hotelName.isEmpty() && hotelName.length()>3 && hotelName.length()<30)
			{
				System.out.println("hotelName is valid="+hotelName);
			}
			else
			{
				System.err.println("hotelName is not valid");
			}
			if(gender!=null && !gender.isEmpty() && gender.length()>3 && gender.length()<30)
			{
				System.out.println("Gender is valid="+gender);
			}
			else
			{
				System.err.println("Gender is not valid");
			}
			if(salary>0 && salary<1000000)
			{
				System.out.println("Salary is valid ="+salary);
			}
			else
			{
				System.err.println("Salary is not valid");
			}

		}
		
	}

}
