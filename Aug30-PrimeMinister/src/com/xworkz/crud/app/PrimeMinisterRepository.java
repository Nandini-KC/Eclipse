package com.xworkz.crud.app;

public interface PrimeMinisterRepository {
	int TOTAL_COUNT=5;
	public void save(PrimeMinisterDTO dto);
	public PrimeMinisterDTO findByName(String name);
}
