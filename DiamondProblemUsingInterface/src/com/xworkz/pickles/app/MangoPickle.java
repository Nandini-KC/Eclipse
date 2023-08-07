package com.xworkz.pickles.app;

public interface MangoPickle {
	String veryTasty();
	default int cost()
	{
		return 0;
	}
}
