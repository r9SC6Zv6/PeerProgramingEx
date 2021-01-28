package com.qa.factorials;

public class Factorials {
	
	public static void reverseFactorial(int f) {
		int i = 2;
		boolean isFactorial = false;
		while (f > 0) {
			f = f / i;
			if (f == i + 1) {
				System.out.println(i + 1 + "!");
				isFactorial = true;
			}
			i++;
		}
		if (!isFactorial)
			System.out.println("NONE");
		
	}
	
}
