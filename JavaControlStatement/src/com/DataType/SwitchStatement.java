package com.DataType;

public class SwitchStatement {
	//Example of switch statement
	
	public void switchStatementExample(){
	   int monthNo=7;    
	    String month="";  
	    //Switch statement  
	    switch(monthNo){    
	    case 1: month="1 - January";  
	    break;    
	    case 2: month="2 - February";  
	    break;    
	    case 3: month="3 - March";  
	    break;    
	    case 4: month="4 - April";  
	    break;    
	    case 5: month="5 - May";  
	    break;    
	    case 6: month="6 - June";  
	    break;    
	    case 7: month="7 - July";  
	    break;    
	    case 8: month="8 - August";  
	    break;    
	    case 9: month="9 - September";  
	    break;    
	    case 10: month="10 - October";  
	    break;    
	    case 11: month="11 - November";  
	    break;    
	    case 12: month="12 - December";  
	    break;    
	    default:System.out.println("Invalid Month!");    

}System.out.println(month);
	    }
	//Example 2:Switch statement
	public void intExample(){
		int number = 7;
		switch (number){
		case 1 : 
		  System.out.println("Day is Monday");
	    	break;
		case 2 : 
			System.out.println("Day is Tuesday");
			break;
		case 3: 
			System.out.println("Day is Wednesday");
			break;
		case 4 : 
			System.out.println("Day is Thursday");
			break ;
		case 5 : 
		  System.out.println("Day is Friday");
		  break;
		case 6: 
		 System.out.println("Day is Saturday");
		 break;
		case 7: 
		 System.out.println("Day is Sunday");
		 break;
		 default:
			 System.out.println("invalid day");
		
		
		
		}
	}











}
