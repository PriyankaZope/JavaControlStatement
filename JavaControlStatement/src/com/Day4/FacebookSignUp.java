package com.Day4;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FacebookSignUp {
	Random objRandom = new Random();

	public String getRandomString(int lenght) {
		String chars = "abcdefghiklmnopqrstuvwxyz";
		String randomstring = "";
		for (int i = 0; i < lenght; i++) {
			int rnum = (int) Math.floor(Math.random() * chars.length());
			randomstring += chars.substring(rnum, rnum + 1);
		}
		return randomstring;
	}

	public int getRandomDate(int intMaxNumberLength) {
		int intNumber = (int) ((Math.random()) * intMaxNumberLength);
		if (intNumber == 0) {
			intNumber = (int) ((Math.random()) * intMaxNumberLength);
		}

		return intNumber;
	}

	public String getRandomMonth() {

		Random rand = new Random();
		String randomMonth = "";
		List<String> givenList = Arrays.asList("Jan", "Feb", "March", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct",
				"Nov", "Dec");

		int numberOfElements = 12;

		for (int i = 0; i < numberOfElements; i++) {
			int randomIndex = rand.nextInt(givenList.size());
			randomMonth = givenList.get(randomIndex);
		}

		return randomMonth;
	}

	public String getRandomYear() {

		Random rand = new Random();
		String randomYear = "";
		List<String> givenList = Arrays.asList("1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998",
				"1999", "2000");

		int numberOfElements = 11;

		for (int i = 0; i < numberOfElements; i++) {
			int randomIndex = rand.nextInt(givenList.size());
			randomYear = givenList.get(randomIndex);
		}

		return randomYear;
	}

	public void openURLOfFacebookSignUp() {
		System.out.println("https://www.facebook.com/r.php");
	}

	public void verifyHdrOfSignUpPage() {

		System.out.println("Verified header of Facebook signup page 'Create a new account' succesfully");
	}

	public void setFirstName(String strName) {
		System.out.println("First Name is : " + strName + "_" + this.getRandomString(5));
	}

	public void setLastName(String lastName) {
		System.out.println("Last Name is :" + lastName + "_" + this.getRandomString(4));
	}

	public void setMobileNumber() {
		String mobNo = " ";

		for (int i = 0; i < 10; i++) {
			mobNo = mobNo + "" + objRandom.nextInt(9);
		}
		System.out.println("Mobile number is : " + mobNo);
	}

	public void setBirthDate() {
		System.out.println("Birth Date is : " + this.getRandomDate(31));
	}

	public void setBirthMonth() {
		System.out.println("Birth Month is :" + this.getRandomMonth());
	}

	public void setBirthYear() {
		System.out.println("Birth Year is :" + this.getRandomYear());
	}

	public void selectGender() {
		String randomgender[] = { "Male", "Female", "Custom" };
		String gender = randomgender[objRandom.nextInt(2)];
		System.out.println("Gender is : " + gender);
	}

	public void password() {
		System.out.println("xyz@12345");
	}

	public void clickSignUpButton() {
		System.out.println("'Sign up' succesfully");
	}
}
