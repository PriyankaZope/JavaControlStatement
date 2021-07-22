package com.Day8Encapsulation;

public class Bank2 {
	public int accountNo = 123123;
	private int pinNo = 1234;
	
	public void updatePin(int accNo , int oldPin , int newPin){
		System.out.println("-------------------------------------");
		System.out.println("\n\tUpdate Pin here");
		System.out.println("Updating pin is in the Process");
		if (accNo==accountNo && oldPin==pinNo){
		pinNo=newPin;
			System.out.println("Pin changed succesfully!!!");
			
			
		}else
			System.out.println("Invalid credentials");
	}
	public void getaccountNo(int accountNo){
		this.accountNo=accountNo;
		System.out.println(accountNo);
		
	}
	
	
	
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
}
