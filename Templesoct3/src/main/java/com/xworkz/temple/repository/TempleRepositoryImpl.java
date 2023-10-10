package com.xworkz.temple.repository;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

import com.xworkz.temple.DTO.TempleDTO;

public class TempleRepositoryImpl implements TempleRepository{
	private Collection<TempleDTO> group=new HashSet<TempleDTO>();

	@Override
	public void save(TempleDTO dto) {
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
	public int total()
	{
		return this.group.size();
	}
	public Collection<TempleDTO> getAll()
	{
		return this.group;
	}
	

}
