package com.xworkz.util.player;

public class PlayerServiceImpl implements PlayerService{

	PlayerRepository playerRepository=new PlayerRepositoryImpl();
	@Override
	public boolean validateAndSave(PlayerDTO playerDTO) {
		if(playerDTO!=null)
		{
			System.out.println("Invoking valid and save in player service implementation");
			System.out.println("Valid data entered ");
			String name=playerDTO.getName();
			String sportName=playerDTO.getSportName();
			if(ValidateUtil.validateString(name))
			{
				System.out.println("valid player name "+name);
			}
			else
			{
				System.err.println("Invalid player name");
			}
			if(ValidateUtil.validateString(sportName))
			{
				System.out.println("Valid sport name "+sportName);
			}
			else
			{
				System.err.println("Invalid sport Name");
			}
			
			playerRepository.save(playerDTO);
			return true;

			
		}
		else
		{
			System.err.println("Please enter valid data");
		}
		return false;
	}
	@Override
	public PlayerDTO findByName(String name) {
	boolean isExist=ValidateUtil.validateString(name);
	if(isExist)
	{
		System.out.println("Name found");
		PlayerDTO isFound=playerRepository.findByName(name);
		return isFound;
	}
	else
	{
		System.out.println("Name not found");
	}
	return null;
	}
	@Override
	public PlayerDTO findByNameAnd(String name, String sportName) {
		boolean isExist=ValidateUtil.validateString(name);
		boolean isValid=ValidateUtil.validateString(sportName);
		if(isExist && isValid)
		{
			System.out.println("Name found");
			PlayerDTO isFound=playerRepository.findByNameAnd(name, sportName);
		}
		System.out.println("data not found");
		return null;
	}

}
