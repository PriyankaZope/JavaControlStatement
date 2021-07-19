package com.Day5;

public class TestConstructorExample {

	public static void main(String[] args) {
	//	ConstructorExample objConstructorExample = new ConstructorExample();
		//objConstructorExample.getCarDetails();
	 ConstructorExample myCar = new ConstructorExample(2015, "XUV500W10");
		 System.out.println("Car Model year is :"+myCar.modelYear + " , Car Model name is :" + myCar.modelName);
  ConstructorExample objConstructorExample = new ConstructorExample("ASDFG");
    objConstructorExample.carDetails();
	}

}
