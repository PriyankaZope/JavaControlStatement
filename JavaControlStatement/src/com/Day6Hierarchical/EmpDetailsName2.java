package com.Day6Hierarchical;

public class EmpDetailsName2 extends EmpDetails {
	double hike = 0.5;
	public void gettingHike(){
		System.out.println("==========================");
		System.out.println("child class1 extended by parent class");
		System.out.println("====Temporary Employee Hike And Salary=====");
		System.out.println("Getting hike :"+this.hike);
	}
	public void incrementedSalary(){
		System.out.println("Incremented Salary :"+(salary+(salary*hike)));
	}
 
}
