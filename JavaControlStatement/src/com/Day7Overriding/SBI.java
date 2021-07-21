package com.Day7Overriding;

public class SBI extends RBI {
	public SBI (){
		System.out.println("State Bank of India");
	}
	public void getCustomerDetails(String name,int acNo){
		System.out.println("Bank Name : State Bank Of India");
		System.out.println("----------------------------------------");
		System.out.println("Name :"+name);
		System.out.println("Account Number :"+acNo);
	}
	
	@Override
	public void getHomeLoan(double rateofinterest) {
		System.out.println("Home Loan Rate Of Interest for SBI :"+rateofinterest);
	}
	@Override
	public void getCarLoan(double rateofinterest) {
		System.out.println("Car Loan Rate Of Interest for SBI :"+rateofinterest);
		}
	public void increaseInRateOfInterest(String  strmonth){
		System.out.println("Rate of interest will increase after :"+strmonth +" Month ,1%");
		System.out.println("===========================");

	}

}
