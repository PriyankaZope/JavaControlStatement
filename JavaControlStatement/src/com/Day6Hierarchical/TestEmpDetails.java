package com.Day6Hierarchical;

public class TestEmpDetails  {

	public static void main(String[] args) {
		//create object of EmpDetailsName2 
		EmpDetailsName2 objEmpDetailsName2 = new EmpDetailsName2();
		System.out.println("------Hierarchical Inheritance----");
		objEmpDetailsName2.getEmpName("ABC");
		objEmpDetailsName2.getEmpId(1234);
		objEmpDetailsName2.empSalary();

		objEmpDetailsName2.gettingHike();
		objEmpDetailsName2.incrementedSalary();
    //object of EmpDetailsName
		EmpDetailsName objEmpDetailsName = new EmpDetailsName();
		objEmpDetailsName.permenantEmpHike();
		objEmpDetailsName.permenantSalary();
	}

}
