package com.Day8Encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		Bank objBank = new Bank();                            //Object of class Bank
		objBank.bankDetails();
		objBank.getAccountNo();
		objBank.withdraw(123456, 1234, 1000);
		objBank.depositAmount(123456, 1234, 1000);
		System.out.println("\n\tAccount Balance :"+objBank.depositAmount(123456, 1234, 1000));
		
		
		Bank2 objBank2 = new Bank2();                            //object of class Bank2
		objBank2.getaccountNo(123123);
		objBank2.updatePin(123123, 1234, 2222);
	}

}
