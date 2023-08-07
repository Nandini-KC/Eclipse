package com.xworkz.pickles.app;

public interface TomatoPickle extends MangoPickle{
	String yummy();
	default String brand()
	{
		return "Priya";
	}
}
