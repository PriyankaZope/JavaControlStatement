package com.DataType;

public class IfStatement {
	//Example of if statement
	public void ifStatementExample(){
		int number = 10;
		if (number>0){
			System.out.println("The number is greater then zero ");
		}
	}
	//Example of if else statement
	public void ifelseStatementExample(String strName){
	
		if (strName.equalsIgnoreCase("Priyanka")){
			System.out.println("The Name is Priyanka Zope");
		}
		else
			System.out.println("Invalid Name");
		
	}
	 //Example of if else ladder Statement
		public void ifelseLadderStatementExample (){
			int marks = 49;
			if (marks <50){
				System.out.println("Fail");
			}
			else if (marks >=50 && marks <60){
				System.out.println("C Grade");
			}
			else if (marks >=60 && marks <70){
				System.out.println("B Grade");
			}
			else if (marks >=70 && marks <80){
				System.out.println("A Grade");
			}
			else if (marks >=80 && marks <90){
				System.out.println("A+ Grade");
			}
			else if (marks >=90 && marks <=100){
				System.out.println("A++ Grade");
			}
			else 
				System.out.println("Invalid Marks");
		}

	//nested if statement example
		public void nestedifExample(int age , String nationality){
			if (age>=18){
				if (nationality.equalsIgnoreCase("Indian")){
				System.out.println("You are eligible for voting");
			}
			else 
				System.out.println("You are not eligible for voting");}
			else 
				System.out.println("Age must be greater than 18");
		}

		public static void main(String[] args) {
			IfStatement objIfStatement = new IfStatement();
			objIfStatement.ifStatementExample();
			objIfStatement.ifelseLadderStatementExample();
			objIfStatement.ifelseStatementExample("priyanka");
			objIfStatement.nestedifExample(18, "indian");

		}}
	
	
	
 
	
	
	
	
	


