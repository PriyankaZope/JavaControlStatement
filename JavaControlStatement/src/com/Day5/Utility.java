package com.Day5;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Utility {
	Random objRandom = new Random();

	public String openUrlOfFacebook() {
		String strurl = "https://www.facebook.com/r.php";
		return strurl;
	}

	public String chkHdrOfPage() {
		String strHdr = "Create a new account";
		return strHdr;
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
		String mobNo = "98 ";

		for (int i = 0; i < 8; i++) {
			mobNo = mobNo + objRandom.nextInt(9);
		}
		return mobNo;
	}

	public int getRandomDate(int intMaxNumberLength) {
		int intNumber = (int) ((Math.random()) * intMaxNumberLength);
		if (intNumber == 0) {
			intNumber = (int) ((Math.random()) * intMaxNumberLength);
		}

		return intNumber;
	}

	public String getRandomMonth() {

		String randomMonth = "";
		List<String> givenList = Arrays.asList("Jan", "Feb", "March", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct",
				"Nov", "Dec");

		int numberOfElements = 12;

		for (int i = 0; i < numberOfElements; i++) {
			int randomIndex = objRandom.nextInt(givenList.size());
			randomMonth = givenList.get(randomIndex);

		}
		return randomMonth;
	}

	public int getYear() {
		int strYearTemp = 0;
		int strYear = 0;
		for (int intIndex = 0; intIndex < 100; intIndex++) {
			strYearTemp = objRandom.nextInt(2021);
			if (strYearTemp > 1922) {
				strYear = strYearTemp;
				break;
			}
		}
		return strYear;

	}

	public String selectGender() {
		String randomgender[] = { "Male", "Female", "Custom" };
		String gender = randomgender[objRandom.nextInt(2)];
		return gender;
	}

	public String clickSignUpButton() {
		String button = "SignUp";
		return button;
	}
}
