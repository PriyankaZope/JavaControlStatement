package com.Day4;

public class TestFacebookSignUp {


	public static void main(String[] args) {
    FacebookSignUp objFacebookSignUp = new FacebookSignUp();
    objFacebookSignUp.openURLOfFacebookSignUp();
    objFacebookSignUp.verifyHdrOfSignUpPage();
    objFacebookSignUp.setFirstName("ABC");
    objFacebookSignUp.setLastName("XYZ");
    objFacebookSignUp.setMobileNumber();
    objFacebookSignUp.password();
    objFacebookSignUp.setBirthDate();
    objFacebookSignUp.setBirthMonth();
    objFacebookSignUp.setBirthYear();
    objFacebookSignUp.selectGender();
    objFacebookSignUp.clickSignUpButton();
    
    
   
    
	}

}

