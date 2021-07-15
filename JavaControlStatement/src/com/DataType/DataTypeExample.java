package com.DataType;

public class DataTypeExample {

	

	public void addition() {
		int intValue1 = 10;
		int intValue2 = 20;
		int result = intValue1 + intValue2;
		System.out.println("the addition of integer is : " + result);

	}

	public void multiplication() {
		int intValue1 = 5;
		int intValue2 = 10;
		int result = intValue1 * intValue2;
		System.out.println("The multiplication of number is :" + result);
	}

	public void string() {
		String strFName = "Priyanka";
		String strLName = "Zope";
		String FullName = strFName + strLName;
		System.out.println("The full name is : " + FullName);
	}

	public boolean blnFlag(int num) {
		if (num > 50) {
			return true;
		} else
			return false;
  }

	public void longexample() {
		long num1 = 15L;
		long num2 = -20L;
		System.out.println(" The num1 is : " + num1);
		System.out.println("The num2 is : " + num2);
  }
	public void shortexample (){
		short num1=20;  
		short num2=-50;  
		System.out.println("num1: "+num1);  
		System.out.println("num2: "+num2);  
		
	}
	public void floatExample (){
		  float num1=5.5f;  
	        float num2=5f;  
	        float num3 = num1+num2;
	        System.out.println("The addition of float is : "+num3);  
	}
	public void charExample(){
		  char char1='B';  
	        char1=(char)(char1+1);  
	          
	        System.out.println("char: "+char1);  
	}
	public static void main(String[] args) {
		DataTypeExample objDataTypeExample = new DataTypeExample();
		objDataTypeExample.addition();
		objDataTypeExample.multiplication();
		objDataTypeExample.string();
		System.out.println(objDataTypeExample.blnFlag(60));
		objDataTypeExample.longexample();
		objDataTypeExample.shortexample();
		objDataTypeExample.floatExample();
		objDataTypeExample.charExample();
	}
	
}
