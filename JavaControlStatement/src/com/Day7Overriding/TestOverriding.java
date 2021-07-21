package com.Day7Overriding;

public class TestOverriding {

	public static void main(String[] args) {
		//Object of Class RBI
		RBI objRBI = new RBI();
		objRBI.getHomeLoan(7.5);
		objRBI.getCarLoan(8);
		
		//Object of Class SBI
		SBI objSBI = new SBI();
		objSBI.getCustomerDetails("XYZ", 0011);
		objSBI.getHomeLoan(8);
		objSBI.getCarLoan(8.5);
		objSBI.increaseInRateOfInterest("12");
		
		//Object of Class AxisBank
		AxisBank objAxisBank = new AxisBank();
		objAxisBank.getCustomerDetails("ABC", 0012);
		objAxisBank.getHomeLoan(8.5);
		objAxisBank.getCarLoan(9);

	}

}
