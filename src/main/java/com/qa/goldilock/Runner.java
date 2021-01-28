package com.qa.goldilock;

public class Runner {

	public static void main(String[] args) {
		
		BearNecessities.addTable(297, 90, 54);
		BearNecessities.addTable(66, 110, 78);
		BearNecessities.addTable(257, 113, 98);
		BearNecessities.addTable(276, 191, 12);
		BearNecessities.addTable(163, 163, 22);
		BearNecessities.addTable(193, 193, 12);
		BearNecessities.addTable(153, 153, 45);
		BearNecessities.addTable(107, 107, 65);
		
		BearNecessities.bearNecessities(100, 120);

	}

}
