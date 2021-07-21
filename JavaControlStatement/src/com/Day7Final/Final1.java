package com.Day7Final;

public class Final1 {
	int age = 18;
	 final int weight = 55;
	
	public void verifyDetailsForBloodDonation(){
		int weight = 60;
		String name = "ABC_XYZ" ;
		System.out.println("=====Final1======");
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Weight :"+this.weight);
		
		if (age>18){
			if (weight>50){
				System.out.println("You are eligible for Blood Donation");
				}	}
		else System.out.println("Not Eligible for Blood Donation");
	}
	
	public final void checkDate(String strdate){
		System.out.println("Date for Blood Donation is :"+strdate);
	}

}
