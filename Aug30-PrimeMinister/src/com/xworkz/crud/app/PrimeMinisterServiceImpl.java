package com.xworkz.crud.app;

public class PrimeMinisterServiceImpl implements PrimeMinisterService{
	PrimeMinisterRepository primeRepository=new PrimeMinisterRepositoryImpl();
	@Override
	public boolean validateAndSave(PrimeMinisterDTO dto) {
		if(dto!=null)
		{
			System.out.println("Data is not null");
			String name=dto.getName();
			String country=dto.getCountry();
			String partyName=dto.getPartyName();
			int id=dto.getId();
			if(ValidateUtil.validateString(name))
			{
				System.out.println("Input is valid "+name);
			}
			else
			{
				System.err.println("Input is not valid "+name);
			}
			if(ValidateUtil.validateString(country))
			{
				System.out.println("Input is valid "+country);
			}
			else
			{
				System.err.println("Input is not valid "+country);
			}
			if(ValidateUtil.validateString(partyName))
			{
				System.out.println("Input is valid "+partyName);
			}
			else
			{
				System.err.println("Input is not valid "+partyName);
			}
			if(ValidateUtil.validateNumber(id))
			{
				System.out.println("Input is valid "+id);
			}
			else
			{
				System.err.println("Input is not valid "+id);
			}
			primeRepository.save(dto);
			return true;
		}
		else {
			System.err.println("value is null cannot save");
		} 
		
		return false;
	}

	@Override
	public PrimeMinisterDTO findByName(String name) {
		if(ValidateUtil.validateString(name))
		{
			System.out.println("Input is valid ");
			PrimeMinisterDTO isFound=primeRepository.findByName(name);
			return isFound;
		}
		System.out.println("Prime minister name not found");
		return null;
	}

}

