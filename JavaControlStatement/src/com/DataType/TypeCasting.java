package com.DataType;

public class TypeCasting {
	static int intNumber = 10;
	int intNumber1 = 50;
	String strNumber = "10";
	static double dblNumber = 40.58;
     float fltNumber = 5.5f;
	
	
		public static void main(String[] args) {
			TypeCasting objTypeCasting= new TypeCasting();
			
			System.out.println("the integer is :" +objTypeCasting.intNumber1);
		
			int result = intNumber + Integer.parseInt(objTypeCasting.strNumber);
			System.out.println("the addition is :"+result);
			
			double dblNumner_changed = Double.parseDouble(objTypeCasting.strNumber);
			System.out.println("Typecasting to double from string : " +dblNumner_changed);
			
			long longNumber = Long.parseLong(objTypeCasting.strNumber);
			System.out.println("Typecasting to long from String :" +longNumber);
			
			float floatNumber = Float.parseFloat(objTypeCasting.strNumber);
			System.out.println("Type casting to float from String : "+floatNumber);
			
			float result1 = floatNumber+floatNumber;
			System.out.println("the addition of float is :" +result1);
			
			double result2 = dblNumner_changed+dblNumber ;
			System.out.println("the addition of double is : "+ result2);
			
		}

}
