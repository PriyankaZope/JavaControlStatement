package com.Day11HashTable;

import java.util.Random;

public class SignInFlow {

	private SignUpPage objSignUpPage;
	private HomePage objHomePage;
	private String testData = "";
	private Utility objUtility;
	Random objRandom = new Random();

	public SignInFlow() {
		objSignUpPage = new SignUpPage();
		objHomePage = new HomePage();
		objUtility = new Utility();
	}

	public void signUp() {
		testData = objUtility.createSignUpTestData().get("Name") + objUtility.getRandomString(3);
		if (!testData.equals(""))
			objSignUpPage.setName(testData);

		testData = objUtility.createSignUpTestData().get("LastName") + objUtility.getRandomString(3);
		if (!testData.equals(""))
			objSignUpPage.setLastName(testData);

		testData = objUtility.createSignUpTestData().get("MobileNo") + objUtility.setMobileNumber1();
		if (!testData.equals(""))
			objSignUpPage.setMobileNumber(testData);

		testData = objUtility.createSignUpTestData().get("Password")+objUtility.getRandomString(5);
		if (!testData.equals(""))
			objSignUpPage.setPassword(testData);

		testData = objUtility.createSignUpTestData().get("BirthDate")+objUtility.getRandomDate(30);
		if (!testData.equals(""))
			objSignUpPage.setBirthDate(testData);

		testData = objUtility.createSignUpTestData().get("Month");
		if (!testData.equals(""))
			objSignUpPage.setBirthMonth(testData);

		testData = objUtility.createSignUpTestData().get("Year")+objUtility.getYear();
		if (!testData.equals(""))
			objSignUpPage.setBirthYear(testData);

		testData = objUtility.createSignUpTestData().get("Gender");
		if (!testData.equals(""))
			objSignUpPage.selectGender(testData);

		testData = objUtility.createSignUpTestData().get("SignUp Button");
		if (!testData.equals(""))
			objSignUpPage.clickSignUpButton();

	}



		public void verifySignUpDoneSuccessfully(){

		    String actualValue = objHomePage.getLogoutTextOnHomePage();
		    testData = objUtility.createSignUpTestData().get("Logout Text Visible");
		    if(!testData.equals("")){
		        if(testData.equals(actualValue))
		            System.out.println("Passed Test!!!");
		        else
		            System.out.println("Failed Test!!!");


		}
	}
}
