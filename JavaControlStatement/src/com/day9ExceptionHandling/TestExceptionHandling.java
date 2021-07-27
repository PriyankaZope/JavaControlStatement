package com.day9ExceptionHandling;

public class TestExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		
		ExceptionHandling1 objExceptionHandling1 = new ExceptionHandling1();
		
		//Arithmetic Exception
		objExceptionHandling1.calculations(50, 0);
 
		//Null Pointer Exeption
		objExceptionHandling1.studentName(null);
		
		//ArrayIndexOutOfBounds Exception
		objExceptionHandling1.listOfName();
		
		// NumberFormat Exception
		objExceptionHandling1.studentDetails();
		
		//StringIndexOutOfBound Exception
		objExceptionHandling1.stringIndexOutBoundExample();
		
		//FileNotFound Exception 
		objExceptionHandling1.getpdf();
		
		// Interrupted Exception
		objExceptionHandling1.goodMorningMessage();
	}

}
