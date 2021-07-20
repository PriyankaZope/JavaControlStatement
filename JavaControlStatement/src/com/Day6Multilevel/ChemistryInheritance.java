package com.Day6Multilevel;

public class ChemistryInheritance extends MathsInheritance {
	public void prepareChemicalEquation(String element1, String element2, String element3) {
		System.out.println("Example of ChemistryInheritance");
		int chemistryMarks = 60;
		if (chemistryMarks > 40) {
			System.out.println("you are eligible to solve the equation");
			System.out.println("Chemical Equation is ");
			System.out.println("Reaction :" + element1 + "+" + element2 + "-->" + element3);
		} else
			System.out.println("try next time");
		System.out.println("==============================");

	}

}
