package com.xworkz.isexist.app;

public class CourtRepositoryImpl implements CourtRepository{
	private CourtDTO[] dtos=new CourtDTO[TOTAL];
	private int index=0;
	@Override
	public boolean isExist(CourtDTO courtDTO) {
		System.out.println("Invoking isExist in courtRepository");
		for(int pos=0;pos<this.dtos.length;pos++)
		{
			CourtDTO temp=this.dtos[pos];
			if(temp!=null) {
				if(temp.getCourtType().equals(courtDTO.getCourtType()) && temp.getLocation().equals(courtDTO.getLocation()))
				{
					System.err.println("Data exist");
					return true;
				}
			}
		}
		System.out.println("Court does not exist..can save");
		return false;
		//return CourtRepository.super.isExist(courtDTO);
	}
	@Override
	public void save(CourtDTO courtDTO) {
		if (index < TOTAL) {
			this.dtos[index] = courtDTO;
			System.out.println("Data saved at index  " + index + "  is " + courtDTO);
			index++;
		} else {
			System.err.println("Not able to save ");
		}

	}
	

}
