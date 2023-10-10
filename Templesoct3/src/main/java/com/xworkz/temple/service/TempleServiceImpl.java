package com.xworkz.temple.service;

import java.util.Collection;

import com.xworkz.temple.DTO.TempleDTO;
import com.xworkz.temple.repository.TempleRepository;
import com.xworkz.temple.repository.TempleRepositoryImpl;

public class TempleServiceImpl implements TempleService{
	TempleRepository repository=new TempleRepositoryImpl();
	public TempleServiceImpl(TempleRepository repo) {
		System.out.println("Para constructor");
	}
	@Override
	public boolean ValidateAndSave(TempleDTO dto) {
		repository.save(dto);
		return true;
	}
	public int total()
	{
		return this.repository.total();
	}
	public Collection<TempleDTO> getAll()
	{
		return this.repository.getAll();
	}

}
