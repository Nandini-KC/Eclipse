package com.xworkz.thief.dto;

public class ThiefServiceImpl implements ThiefService{

	@Override
	public void saveAndValidate(ThiefDTO thief) {
		if(thief!=null)
		{
			System.out.println("Thief data is valid="+thief);
			String specialization=thief.getSpecialization();
			int exp=thief.getExperience();
			int age=thief.getAge();
			String gang=thief.getGangName();
			int cases=thief. getTotalCases();
			if(specialization!=null && !specialization.isEmpty()&& specialization.length()>3&& specialization.length()<30)
			{
				System.out.println("specialization of thief is valid="+specialization);
			}
			else
			{
				System.err.println("specialization of thief is not valid");
			}
			if(exp>0 && exp<1000000)
			{
				System.out.println("Experience of thief is valid ="+exp);
			}
			else
			{
				System.err.println("Experience is not valid");
			}
			if( age>0 && age<150)
			{
				System.out.println("Thief age is valid="+age);
			}
			else
			{
				System.err.println("Thief age is not valid");
			}
			if(gang!=null&&!gang.isEmpty()&&gang.length()>3&&gang.length()<30)
			{
				System.out.println("Gangname is valid="+gang);
			}
			else
			{
				System.err.println("gang is not valid");
			}
			if(cases>0&&cases<1000000)
			{
				System.out.println("cases of thief is valid="+cases);
			}
			else
			{
				System.err.println("cases of thief is not valid");
			}
		}
		
	}

}
