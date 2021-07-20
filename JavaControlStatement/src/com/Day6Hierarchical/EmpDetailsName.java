package com.Day6Hierarchical;

public class EmpDetailsName extends EmpDetails {
	double hike = 10;
	public void permenantEmpHike(){
		System.out.println("========================");
		System.out.println("child class 2 extended by parent class");
		System.out.println("=====Permenant Employee hike and salary=====");
		System.out.println("Permenant Employee Hike :"+hike);
	}
	
public void permenantSalary(){
	System.out.println("permenant Emp incremented salary :"+(salary+(salary*hike)));
}
}
