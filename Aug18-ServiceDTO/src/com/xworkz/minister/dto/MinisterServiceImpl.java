package com.xworkz.minister.dto;

public class MinisterServiceImpl implements MinisterService{

	@Override
	public void saveAndValidate(MinisterDTO minister) {
		if(minister!=null)
		{
			System.out.println("Minister data is valid "+minister);
			String name=minister.getName();
			int exp=minister.getExperience();
			String design=minister.getDesignation();
			String partyName=minister.getPartyName();
			if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<30)
			{
				System.out.println("Minister name is valid="+name);
			}
			else
			{
				System.err.println("Minister Name is not valid="+name);
			}
			if(exp>0 && exp<30)
			{
				System.out.println("Minister experience is valid ="+exp);
			}
			else
			{
				System.err.println("Minister experience is not valid "+exp);
			}
			if(design!=null && !design.isEmpty()&& design.length()>3 && design.length()<30)
			{
				System.out.println("Designation of minister="+design);
			}
			else
			{
				System.err.println("Designation of minister is not  valid");
			}
			if(partyName!=null && !partyName.isEmpty() && partyName.length()>3 && partyName.length()<30)
			{
				System.out.println("Party name is valid");
			}
			else
			{
				System.err.println("Party name is not valid");
			}
		}
		
	}
	

}
