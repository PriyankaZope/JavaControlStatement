package com.Day7Final;

public final class Final3 {
	String fName = "ABC";
	String lName = "XYZ";
	String fullName="ABC XYZ";
	public void chkPersonAvailability(){
		System.out.println("Person Name :"+fName +" "+lName);
		if(fullName.equalsIgnoreCase("ABC XYZ")){
			System.out.println("Person is available");
		}else System.out.println("Not Available");
		
		
	}

}
