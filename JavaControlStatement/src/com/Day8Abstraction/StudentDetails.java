package com.Day8Abstraction;

public abstract class StudentDetails {
	
	
	public abstract void setStudentName();
	
	public abstract void studentID();
	
	public void setCity(String city){
		System.out.println("City : "+city);
		if (city.equalsIgnoreCase("Pune")){
			System.out.println("Colleges : Modern college , Fergusson college");
		}else if(city.equalsIgnoreCase("Mumbai")){
			System.out.println("Colleges : IIT , SNDT");
		}else if(city.equalsIgnoreCase("Nashik")){
			System.out.println("Colleges : KK Wagh college");
		}else if(city.equalsIgnoreCase("Aurangabad")){
			System.out.println("Colleges : MIT ");
		}else System.out.println("Select other city");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}