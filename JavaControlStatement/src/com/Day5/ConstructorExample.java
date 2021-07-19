package com.Day5;

public class ConstructorExample {
	int modelYear;
	String modelName;
	String ownerName;

/*public ConstructorExample() {
		modelYear = 2013;
		modelName = "Tata Nexon";
		ownerName = "ABC XYZ";

	}

	public void getCarDetails() {
		System.out.println("Car model year is :" + modelYear + " ," + "Car Model Name is : " + modelName);
		System.out.println("Car owner name is :" + ownerName);
	}*/

	
	
	  public ConstructorExample(int year, String name) { modelYear = year;
	  modelName = name; }
	 

	
	 public ConstructorExample(String name){ modelName = "i10";
	  this.ownerName= name; } public void carDetails(){ System.out.println(
	  "Model name is :"+modelName+" , Owner Name is :"+ownerName);
	  
	  }
	 

}
