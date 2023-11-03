package com.xworkz.programs;
import java.util.Scanner;
public class SecondDay {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println("Enter the no of times array should be rotated");
		Scanner ref = new Scanner(System.in);
		int n = ref.nextInt();
		System.out.println("Elements of the original array");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			int last = array[array.length - 1];
			for (int j = array.length - 1; j > 0; j--) {
				array[j] = array[j - 1];
			}
			array[0] = last;

		}
		System.out.println("Array after rotation");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}



