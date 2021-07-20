package com.Day6Multilevel;

public class Admission extends ChemistryInheritance{
	public  void getAddmision(int marks){
		System.out.println("Example of Admission");
		System.out.println("Marks :"+marks);
		if (marks >50){
			System.out.println("Admission done!!!");
		}else System.out.println("Better luck next time");
	}
}
