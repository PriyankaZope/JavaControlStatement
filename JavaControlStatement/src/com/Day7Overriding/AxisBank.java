package com.Day7Overriding;

public class AxisBank extends RBI {
	
	public AxisBank(){
		System.out.println("Axis Bank");
	}
	public void getCustomerDetails(String name, int actNo){
		System.out.println("Bank Name : Axis Bank ");
		System.out.println("----------------------------------------");
		System.out.println("Name :"+name);
		System.out.println("Account Number :"+actNo);
	}
	@Override
	public void getHomeLoan(double rateofinterest) {
		System.out.println("Home Loan Rate Of Interest for Axis Bank :"+rateofinterest);
	}
   @Override
public void getCarLoan(double rateofinterest) {
	System.out.println("Car Loan Rate Of Interest For Axis Bank :"+rateofinterest);
	System.out.println("===========================");
}

}