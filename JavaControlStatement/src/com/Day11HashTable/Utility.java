package com.Day11HashTable;

import java.util.Hashtable;
import java.util.Random;

public class Utility {
	Random objRandom = new Random();

	  public Hashtable<String, String> objHashTable;
	    
	    public Utility(){
	        objHashTable = new Hashtable<String,String>();
	    }
	    
	    
	    public Hashtable<String, String> createSignUpTestData(){
	    /*	//To generate Random first Name
	    	String chars = "abcdefghijklmnopqrstuvwxyz";
	    	String strRandomeName = "Abc";
	    	for (int i =0 ; i<6 ; i++){
	    		int intRandomNumber = (int)(Math.random()*chars.length());
	    		strRandomeName +=chars.substring(intRandomNumber , intRandomNumber +1);
	    	}
	    	
	    	//To generate Random Last Name
	    	String chars1 = "abcdefghijklmnopqrstuvwxyz";
	    	String strRandomeName1 = "Xyz";
	    	for (int i =0 ; i<6 ; i++){
	    		int intRandomNumber = (int)(Math.random()*chars1.length());
	    		strRandomeName1 +=chars1.substring(intRandomNumber , intRandomNumber +1);
	    	}
	    	
	    	//To Generate Random Mobile No
	    	String mobNo = "98 ";

			for (int i = 0; i < 8; i++) {
				mobNo = mobNo + "" + objRandom.nextInt(9);}
	    */
	    	
	    	
	        objHashTable.put("Name","Amol");
	        objHashTable.put("LastName", "Patil");
	        objHashTable.put("MobileNo", "98");
	        objHashTable.put("Password", "Amol@Patil");
	        objHashTable.put("BirthDate", "01");
	        objHashTable.put("Month", "Jan");
	        objHashTable.put("Year", "1997");
	        objHashTable.put("Gender", "Male");
	        objHashTable.put("SignUp Button", "Sign In");
	        return objHashTable;
	    }

}
