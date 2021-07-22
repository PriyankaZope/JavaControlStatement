package com.Day8Encapsulation;

public class Bank {
	public int accountNo = 123456;
	private int pinNo = 1234;
	private double accountBalance = 100000;

	public void bankDetails(){
		System.out.println("========================================");
	System.out.println("\t\tWelcome to the 'Kotak Mahindra Bank'");	
	System.out.println("========================================");

		
		
	}
	public void withdraw (int accNo , int pin , int amount ){
		if (accNo==accountNo && pin==pinNo ){
			if (amount<=accountBalance){
				
				accountBalance = accountBalance-amount;
				System.out.println("\tWithdraw succesfull : "+amount);
				System.out.println("\tAccount Balance :"+accountBalance);
			}else
				System.out.println("Insufficient Balance");
			
		}else
			System.out.println("Invalid credentials !!!");
		
	}
	
	public double depositAmount (int acNo, int pin, double amount){
		if(acNo==accountNo && pin==pinNo){
			accountBalance = accountBalance+amount;
			return accountBalance	;
		}else
			System.out.println("invalid credentials");
		System.out.println("Account Balance is");
		return accountBalance;
		
			
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getAccountNo() {
		System.out.println("\nAccount No :"+accountNo);
		return accountNo;
	}



}
