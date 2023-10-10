package com.xworkz.grocery.repository;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.grocery.dto.GroceryDTO;

public class GroceryRepositoryImpl implements GroceryRepository{
	private Collection<GroceryDTO> group=new LinkedList<GroceryDTO>();
	@Override
	public void save(GroceryDTO dto) {
		boolean saved=this.group.add(dto);
		if(saved)
		{
			System.out.println("Data is saved"+saved);
		}
		else
		{
			System.out.println("Data is not saved"+saved);
		}
		
	}
	@Override
	 public  int total()
	{
		return this.group.size();
	}
	public Collection<GroceryDTO> getAll()
	{
		return this.group;
	}

}
