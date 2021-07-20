package com.Day6;

public class MethodOverloading {
	// Example of Method Overloading
	// Method using two parameters
	public void getDateAndTemperature(String country, int countrycode) {
		System.out.println("Country and Countrycode are");
		System.out.println("Country :" + country + " , Country code :" + countrycode);
		System.out.println("===========================");

	}

	 // Method using single parameter
	public void getDateAndTemperature1(String state) {
		System.out.println("State is ");
		System.out.println("State :" + state);
		System.out.println("===========================");

	}

	// Method using single parameter
	public void getDateAndTemperature(String district) {
		System.out.println("District is");
		System.out.println("District :" + district);
		System.out.println("===========================");

	}
	//Method using single parameter
	public void getDateAndTemperature11(String taluka) {
		System.out.println("Talulka is :");
		System.out.println("Taluka :"+taluka);
		System.out.println("===========================");

		
	}

	// Method using two parameters with different datatypes
	public void getDateAndTemperature(String date, String temperature) {
		System.out.println("Date and Temperature is ");
		System.out.println("Date :" + date + " , Temperature :" + temperature);
		System.out.println("===========================");

	}

}
