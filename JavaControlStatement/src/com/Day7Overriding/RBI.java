package com.Day7Overriding;

public class RBI {
	
	public RBI(){
		System.out.println("Reserve Bank Of India");
	}
	
	public void bankName (){
		System.out.println("State Bank Of India");
		System.out.println("Axis Bank");
		
	}
	public void getHomeLoan(double rateofinterest){
		System.out.println("Rate of Interest for Home Loan :"+rateofinterest);
		
	}
	public void getCarLoan(double rateofinterest){
		System.out.println("Rate of Interest For Car Loan :"+rateofinterest);
		System.out.println("===========================");
		
	}
}
