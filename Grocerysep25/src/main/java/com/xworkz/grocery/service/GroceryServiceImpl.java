package com.xworkz.grocery.service;

import java.util.Collection;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.repository.GroceryRepository;
import com.xworkz.grocery.repository.GroceryRepositoryImpl;

public class GroceryServiceImpl implements GroceryService{
	GroceryRepository repository=new GroceryRepositoryImpl();
	public GroceryServiceImpl(GroceryRepository repository)
	{
		System.out.println("Para constructor");
	}
	@Override
	public boolean ValidateAndSave(GroceryDTO dto) {
		repository.save(dto);
		return true   ;
	}
	public int total()
	{
		return this.repository.total();
	}
	public Collection<GroceryDTO> getAll()
	{
		return this.repository.getAll();
	}
}
