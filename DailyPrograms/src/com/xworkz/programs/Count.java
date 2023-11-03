package com.xworkz.programs;

import java.util.Arrays;

public class Count {
	public static void main(String[] args) {
		int[] array= {1,5,2,3,4,5,6,5,5,6};
		int input=5;
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==input)
			{
				count++;
			}
		}
		System.out.println("Count of "+input+"="+count);
	}

}
