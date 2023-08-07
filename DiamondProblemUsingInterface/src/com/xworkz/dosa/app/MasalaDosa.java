package com.xworkz.dosa.app;

public interface MasalaDosa extends Dosa{
	String masala();
	default int qunatity()
	{
		return 0;
	}
}
