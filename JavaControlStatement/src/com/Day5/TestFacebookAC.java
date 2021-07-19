package com.Day5;

public class TestFacebookAC {

	public static void main(String[] args) {
		FacebookAc objFacebookAc = new FacebookAc();
		
		objFacebookAc.openURLOfFacebookSignUp();
		objFacebookAc.verifyHdrOfSignUpPage();
		objFacebookAc.setFirstName("ABC");
		objFacebookAc.setLastName("XYZ");
		objFacebookAc.setMobileNo();
		objFacebookAc.setBirthDate();
		objFacebookAc.setMonth();
		objFacebookAc.setYear();
		objFacebookAc.selectGender();
		objFacebookAc.setPassword("QWE@");
		objFacebookAc.signUpDone();

	}

}
