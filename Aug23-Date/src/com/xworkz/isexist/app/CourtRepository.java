package com.xworkz.isexist.app;

public interface CourtRepository {
	int TOTAL=3;
	public default boolean isExist(CourtDTO courtDTO)
	{
		return false;
	}
	void save(CourtDTO courtDTO);
}
