package com.Day6Hierarchical;

public class EmpDetails {
	float salary = 40000;
	
	
	public void getEmpName(String StrName){
		System.out.println("parent class");
		System.out.println("Welcome to the Company website");
		System.out.println("==========================");
		System.out.println("EMP Name :"+StrName);
		
	}
	public void getEmpId(int id){
		System.out.println("Emp ID :"+id);
		
	}
	public void empSalary (){
		System.out.println("salary :"+salary);
		
	}

}
