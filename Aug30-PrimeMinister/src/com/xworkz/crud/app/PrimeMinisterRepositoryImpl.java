package com.xworkz.crud.app;

public class PrimeMinisterRepositoryImpl implements PrimeMinisterRepository{
	private PrimeMinisterDTO[] ministers=new PrimeMinisterDTO[TOTAL_COUNT];
	private int index=0;
	@Override
	public void save(PrimeMinisterDTO dto) {
		if(index<TOTAL_COUNT)
		{
			this.ministers[index]=dto;
			System.out.println(dto +" Prime minister data is saved at index "+index);
			index++;
		}
		else
		{
			System.out.println("Index is exceeded");
		}
		
		
	}

	@Override
	public PrimeMinisterDTO findByName(String name) {
		for(int i=0;i<index;i++)
		{
			if(ministers[i].getName().equalsIgnoreCase(name))
			{
				System.out.println("Prime minister name found "+name +"matched at index "+i);
				System.out.println("Data found "+ministers[i]);
				return ministers[i];
			}
			System.out.println("Prime minister name not found at Index "+i+"checking for next index");
			
		}
		System.err.println("Prime minister name not found");
		return null;
	}

}
