package com.qa.doggocomp;

public class Dogcomp {

	public static void dogRank(int x) {

		for (int i = 1; i <= 100; i++) {
			if (i == x)
			continue;
			String d = (i / 10 == 0) ? "" : String.valueOf(i/10);

			
			switch (i % 10) {

			case 1:
				System.out.print(d + "1st"); 
				break;
			case 2:
				System.out.print(d + "2nd");
				break;
			case 3:
				System.out.print(d + "3rd");
				break;
			default:
				System.out.print(i + "th");
			}
			if (i % 15 == 0)
				System.out.println(",");
			else if (i == 100);
				
			else 
				System.out.print(", ");
				
			
		}
	}

}
