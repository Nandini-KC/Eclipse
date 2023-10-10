package com.xworkz.zoo;

public class WasteRepositoryImpl implements WasteRepository{
	private WasteDTO[] wastes=new WasteDTO[TOTAL];
	private int index=0;
	@Override
	public void save(WasteDTO dto) {
		if(index<TOTAL)
		{
			this.wastes[index]=dto;
			System.out.println(dto+ "waste data is saved at index "+index);
			index++;
		}
		else
		{
			System.out.println("Index is exceeded");
		}
		
	}

}
