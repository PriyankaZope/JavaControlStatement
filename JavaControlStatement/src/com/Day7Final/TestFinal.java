package com.Day7Final;

public class TestFinal {

	public static void main(String[] args) {
		Final2 objFinal2 = new Final2();
	
		//calling method from class Final1
		objFinal2.verifyDetailsForBloodDonation();
		objFinal2.checkDate("25/07/2021");
		
		//calling method from class Final2
		objFinal2.verifyAge();
		objFinal2.checkNationality("indian");
		
	}

}
