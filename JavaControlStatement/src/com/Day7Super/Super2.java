package com.Day7Super;

public class Super2 extends Super1 {
	float salary = 10000f;
	String name = "ZXC";
	int id = 102;

	public Super2() {
		super();
		System.out.println("====================");
		System.out.println("Constructor of Class Super2");

	}

	public void display() {
		System.out.println("====Super2 Class====");

		// id is from current class variable and using super keyword from parent
		// class
		System.out.println("Employee ID :" + id + " , " + super.id);
		System.out.println("Employee Name :" + name + " , " + super.name);
		System.out.println("Employee Salary :" + salary);

	}

	public void verifyDetails() {
		System.out.println("==================");
		// Without Super keyword
		System.out.println("Salary :" + salary);

		// With Super Keyword
		System.out.println("Salary with Super Keyword :" + super.salary);

		// calling method from class Super1 using super keyword
		System.out.println("time :" + super.officeTime());
	}

}
