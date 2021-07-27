package com.day9ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class ExceptionHandling1 {
	
	//Example of Arithmatic Exception
	
	public void calculations(int num1 , int num2){
		System.out.println("===============================");
		System.out.println("\tArithmetic Exception");
		System.out.println("===============================");

		
		//for addition
		int addResult =num1+num2;
		System.out.println("Addition of the two numbers : "+addResult);
		
		//for substraction
		int subResult = num1-num2;
		System.out.println("Substraction of two numbers : "+subResult);
		
		//for Division
		try {
			int divResult = num1/num2;
			System.out.println("Division of two numbers : "+divResult);
			
		} catch (ArithmeticException arithmeticException) {
			System.out.println("\nI got the Exception : "+arithmeticException);
			arithmeticException.printStackTrace();
		}
		//for multiplcation
		
		int multResult = num1*num2;
		System.out.println("Multiplication of two numbers : "+multResult);
		
	}
	
	//Example of Null Pointer Exception
	
	public void studentName(String name){
		
		System.out.println("\n===============================");
		System.out.println("\tNull Pointer Exception");
		System.out.println("===============================");

		
		try {
			if (name.equalsIgnoreCase("Priyanka")){
				System.out.println("Name is same");
			}else System.out.println("Name is different");
			
		} catch (NullPointerException nullPointerException) {
			
			System.out.println("I got the Exception : "+nullPointerException);
			nullPointerException.printStackTrace();
		}
		}
	//Example of ArrayIndexOutOfBounds Exception
	
	public void listOfName(){
		System.out.println("\n===============================");
		System.out.println("\tArrayIndexOutOfBounds Exception");
		System.out.println("===============================");
	
		 ArrayList<String> name = new ArrayList<String>(); 
		 name.add("Priyanka"); 
		 name.add("Komal"); 
		 name.add("Amruta."); 
		 name.add("Vidya."); 
		 name.add("Surabhi."); 
		 name.add("Aarti."); 
	     
	      try {
			System.out.println("Name : "+name.get(6));
		} catch (Exception e) {
			System.out.println("You select a wrong index number!!!");
			System.out.println("select no in between of 0-5");
		}
		}
	
	// Example of NumberFormat Exception
	
	public void studentDetails(){
		
		System.out.println("\n===============================");
		System.out.println("\tNumberFormat  Exception");
		System.out.println("===============================");
		
		String fullName_1 = "ABC XYZ";
		String fullName_2= "QWE ZXC";
		int rollNo_1 = 101;
		String rollNo_2= "102";
		
		System.out.println("Student Name : "+fullName_1 +" , "+"Student Roll no : "+rollNo_1);
		System.out.println("Student Name : "+fullName_2);
		  try {  
              int a = Integer.parseInt(null);  
              System.out.println("Roll No : "+a);
     }catch(NumberFormatException numberFormatException){  
        System.out.println("I got the Exception : "+numberFormatException);
        numberFormatException.printStackTrace();
        System.out.println("\nSomething is wrong");
	}}
	
	//Example of StringIndexOutOfBound Exception
		  
		  public void stringIndexOutBoundExample(){
			  
			  System.out.println("\n===============================");
				System.out.println("\tStringIndexOutOfBound Exception");
				System.out.println("===============================");
				
			  
			  String b = "Exception Handling";
			  char charLength_1= b.charAt(3);
			  System.out.println("The Character is : "+charLength_1);
			  
		  try {
	            String a = "Today is Monday "; 
	            char charLength = a.charAt(24); // accessing 25th element
	            System.out.println("The character is : "+charLength);
	        }
	        catch(StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
	            System.out.println("I got the exception : "+stringIndexOutOfBoundsException);
	            stringIndexOutOfBoundsException.printStackTrace();
	        }}
	
		  
	//FileNotFound Exception 
		  public void getpdf(){
			  

			  System.out.println("\n===============================");
				System.out.println("\tFileNotFound Exception");
				System.out.println("===============================");
				
			  try {
				  
		            // Following file does not exist
		            File objFile = new File("E://file.txt");
		 
		            FileReader objFileReader = new FileReader(objFile);
		        } catch (FileNotFoundException fileNotFoundException) {
		           System.out.println("File does not exist");
		           System.out.println("I got the exception : "+fileNotFoundException);		
		           fileNotFoundException.printStackTrace();}
		  }
	
		  //Example of Interrupted Exception
	
	public void goodMorningMessage() throws InterruptedException{
		
		 System.out.println("\n===============================");
			System.out.println("\tInterrupted Exception");
			System.out.println("===============================");
		
		Thread.sleep(10000);
      
		System.out.println("Good Morning ...");
		
		
	}
	

}
