package com.xworkz.isexist.app;

public class CourtDTORunner {

	public static void main(String[] args) {
	CourtDTO dto=new CourtDTO("Civil", "delhi", 5, 50);
	CourtDTO dto1=new CourtDTO("High", "delhi", 10, 100);
	CourtDTO dto2=new CourtDTO("High", "delhi", 10, 100);
	CourtRepository repo=new CourtRepositoryImpl();
	boolean exist=repo.isExist(dto);
	if(!exist)
	{
		repo.save(dto);;
		
	}
	exist=repo.isExist(dto1);
	if(!exist)
	{
		repo.save(dto1);
		
	}
	exist=repo.isExist(dto2);
	if(!exist)
	{
		repo.save(dto2);
		
	}
	}

}
