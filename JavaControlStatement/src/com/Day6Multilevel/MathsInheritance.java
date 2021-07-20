package com.Day6Multilevel;

public class MathsInheritance {

	public void getSubjectAAndMarks(String subject , int marks){
		System.out.println("Example of MathsInheritance (Parent class)");
		System.out.println("Subject :"+subject+" , Marks :"+marks);
		if (marks<35){
			System.out.println("You are failed!!!");
		}
		else System.out.println("You are passed!!!");
	}
	public void getMarksAndGrade(int marks,String grade){
		System.out.println("Marks :"+marks+" , Grade :"+grade);
		if (grade.equals("A+")){
			System.out.println("Eligible For Scholership");
		}else System.out.println("Not Eligible for Scholership");
		System.out.println("==============================");
	}
}
