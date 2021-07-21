package com.Day7Super;

public class Super1 {
	int id = 101;
	String name = "QWE";
	float salary = 20000f;
	String time ="9am - 6pm";
	
	public Super1() {
		this.id = 100;
		this.name = "ASD";
		System.out.println("Constructor of  class Super1");
	}

	public void details() {
		System.out.println("Employee ID :" + id);
		System.out.println("Employee Name : " + name);
	}
	public String officeTime(){
		System.out.println("Office Time :"+time);
		return time;
		
	}

}
