package com.Day7Final;

public class Final2 extends Final1 {
	
	 final int age = 25;
	 String nationality = "Indian";
	
	public void verifyAge (){
		int	age = 18;
		System.out.println("======Final2=====");
		System.out.println("Age :"+this.age);
		
		}
	public void checkNationality(String nationality){
		System.out.println("Nationality :"+nationality);
		if (nationality.equalsIgnoreCase("Indian")){
			System.out.println("Eligible for voting");
		}else System.out.println("Not eligible for voting");
	}
	/*public final void checkDate(String strdate){
		System.out.println("Date for Blood Donation is :"+strdate);
	}
*/
}
