package com.xworkz.grocery.service;

import java.util.Collection;

import com.xworkz.grocery.dto.GroceryDTO;

public interface GroceryService {
	public boolean ValidateAndSave(GroceryDTO dto);
	default int total()
	{
		return 0;
	}
	default Collection<GroceryDTO> getAll()
	{
		return null;
	}
}
