package com.xworkz.temple.service;

import java.util.Collection;

import com.xworkz.temple.DTO.TempleDTO;

public interface TempleService {
	public boolean ValidateAndSave(TempleDTO dto);
	default int total()
	{
		return 0;
	}
	default Collection<TempleDTO> getAll()
	{
		return null;
	}
}
