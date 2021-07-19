package com.Day5;

public class FacebookAc {
	Utility objUtility = new Utility();

	public void openURLOfFacebookSignUp() {
		System.out.println("Facebook url :" + objUtility.openUrlOfFacebook());
		System.out.println("Url opened successfully!!!");
	}

	public void verifyHdrOfSignUpPage() {

		System.out.println("Header :" + objUtility.chkHdrOfPage());
		System.out.println("Verified header successfully!!!");
	}

	public void setFirstName(String firstname) {
		System.out.println("The First Name :" + firstname + "_" + objUtility.getRandomString(5));
	}

	public void setLastName(String lastName) {
		System.out.println("The Last Name :" + lastName + "_" + objUtility.getRandomString(5));

	}

	public void setMobileNo() {
		System.out.println("The Mobile No :" + objUtility.setMobileNumber1());
	}

	public void setBirthDate() {
		System.out.println("Birth Date is :" + objUtility.getRandomDate(31));
	}

	public void setMonth() {
		System.out.println("Month :" + objUtility.getRandomMonth());
	}

	public void setYear() {
		System.out.println("Year :" + objUtility.getYear());
	}

	public void selectGender() {
		System.out.println("Gender :" + objUtility.selectGender());
	}

	public void setPassword(String password) {
		System.out.println("Password :" + password + objUtility.getRandomString(8));
	}

	public void signUpDone() {
		System.out.println("Button :" + objUtility.clickSignUpButton());
		System.out.println("Facebook Account Created Succesfully!!!");
	}
}
