package com.Day6SingleInheritance;

public class SingleInheritance1 extends SingleInheritance 
{public void checkLogOutButton(String logout){
	if (logout.equals("Logout")){
		System.out.println("SignUp done successfully");
	}else System.out.println("Invalid Credentials");
}

}
