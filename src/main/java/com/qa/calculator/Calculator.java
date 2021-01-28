package com.qa.calculator;

public class Calculator {

	public static void calculator(int x, int y, int z) {
		int temp;
		for (int i = 0; i < 6; i++) {
			
			if (x - y == z)
				System.out.println(x + " - " + y + " = " + z);
			if (x + y == z)
				System.out.println(x + " + " + y + " = " + z);
			if (x * y == z)
				System.out.println(x + " * " + y + " = " + z);
			if (x / y == z)
				System.out.println(x + " / " + y + " = " + z);
			
			// Iterating through all permutations
			temp = x;
			x = y;
			y = z;
			z = temp;
			
			if (i == 2) {
				temp = y;
				y = z;
				z = temp;
			}
				
		}
	}
	
}
