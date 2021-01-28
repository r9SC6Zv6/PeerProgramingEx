package com.qa.goldilock;

import java.util.ArrayList;

public class BearNecessities {

	static ArrayList<Tables> tables = new ArrayList<Tables>();
	
	public static void addTable(int chair, int porridge, int luminosity) {
		tables.add(new Tables(chair, porridge, luminosity));
	}
	
	public static void bearNecessities(int weight, int temp) {
		for (int i = 0; i < tables.size(); i++) {
			if (tables.get(i).chair >= weight && tables.get(i).porridge <= temp && tables.get(i).luminosity >= 70)
				System.out.println("Seat #" + (i+1));
		}
	}
	
}
