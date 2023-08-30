package com.xworkz.crud.app;

public interface PrimeMinisterService {
	public boolean validateAndSave(PrimeMinisterDTO dto);
	public PrimeMinisterDTO findByName(String name);
}
