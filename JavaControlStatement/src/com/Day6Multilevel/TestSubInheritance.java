package com.Day6Multilevel;

public class TestSubInheritance {
	

	public static void main(String[] args) {
		//Creating object of Admission  class
		Admission objAdmission = new Admission();
		System.out.println("-------Multilevel Inheritance----");
		objAdmission.getSubjectAAndMarks("Chemistry", 36);
		objAdmission.getMarksAndGrade(91, "A+");
		objAdmission.prepareChemicalEquation("NaOH", "HCl", "NaCl");
		objAdmission.getAddmision(60);
	
	}

}
