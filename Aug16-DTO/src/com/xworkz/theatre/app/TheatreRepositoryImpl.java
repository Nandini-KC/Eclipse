package com.xworkz.theatre.app;

public class TheatreRepositoryImpl implements TheatreRepository{
	private TheatreDTO[] theatres=new TheatreDTO[TOTAL_THEATRES];
	private int index=0;
	@Override
	public void save(TheatreDTO theatreDto) {
		if(index<TOTAL_THEATRES)
		{
			this.theatres[index]=theatreDto;
			index++;
		}
		else
		{
			System.err.println("Index is not found");
		}
		
	}

}
