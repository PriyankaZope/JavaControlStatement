package com.Day11HashTable;

import java.util.Random;

public class SignInFlow {

	private SignUpPage objSignUpPage;
	private HomePage objHomePage;
	private String fbtestData = "";
	private Utility objUtility;
	Random objRandom = new Random();

	public SignInFlow() {
		objSignUpPage = new SignUpPage();
		objHomePage = new HomePage();
		objUtility = new Utility();
	}
	public String getRandomString(int lenght) {
		String chars = "abcdefghiklmnopqrstuvwxyz";
		String randomstring = "";
		for (int i = 0; i < lenght; i++) {
			int rnum = (int) Math.floor(Math.random() * chars.length());
			randomstring += chars.substring(rnum, rnum + 1);
		}
		return randomstring;
	}
	public String setMobileNumber1() {
		String mobNo = " ";

		for (int i = 0; i < 8; i++) {
			mobNo = mobNo + objRandom.nextInt(9);
		}
		return mobNo;
	}
	

	public void signUp() {
		fbtestData = objUtility.createSignUpTestData().get("Name")+getRandomString(3);
		if (!fbtestData.equals("")){
			objSignUpPage.setName(fbtestData);
			}else {System.out.println("Name is Empty");}
		

		fbtestData = objUtility.createSignUpTestData().get("LastName")+getRandomString(3);
		if (!fbtestData.equals(""))
			objSignUpPage.setLastName(fbtestData);

		fbtestData = objUtility.createSignUpTestData().get("MobileNo")+setMobileNumber1();
		if (!fbtestData.equals(""))
			objSignUpPage.setMobileNumber(fbtestData);

		fbtestData = objUtility.createSignUpTestData().get("Password");
		if (!fbtestData.equals(""))
			objSignUpPage.setPassword(fbtestData);

		fbtestData = objUtility.createSignUpTestData().get("BirthDate");
		if (!fbtestData.equals(""))
			objSignUpPage.setBirthDate(fbtestData);

		fbtestData = objUtility.createSignUpTestData().get("Month");
		if (!fbtestData.equals(""))
			objSignUpPage.setBirthMonth(fbtestData);

		fbtestData = objUtility.createSignUpTestData().get("Year");
		if (!fbtestData.equals(""))
			objSignUpPage.setBirthYear(fbtestData);

		fbtestData = objUtility.createSignUpTestData().get("Gender");
		if (!fbtestData.equals(""))
			objSignUpPage.selectGender(fbtestData);
		
		fbtestData = objUtility.createSignUpTestData().get("SignUp Button");
		if (!fbtestData.equals(""))
			objSignUpPage.clickSignUpButton();

	}

	public void verifySignUpDoneSuccessfully(){
        
    String actualValue = objHomePage.getLogoutTextOnHomePage();
    fbtestData = objUtility.createSignUpTestData().get("SignUp Button");
    if(!fbtestData.equals("")){
        if(fbtestData.equals(actualValue))
            System.out.println("Passed Test!!!");
        else
            System.out.println("Failed Test!!!");
        

}}}
