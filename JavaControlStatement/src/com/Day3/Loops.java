package com.Day3;

public class Loops {
	String [] sports = {"Cricket", "Football" , "Tennis" , "Badminton" , "Hockey" , "Chess" , "Carrom" ,"Boxing" };
	String [] playerName ={"Virat Kohli" , "Cristiano Ronaldo" , "Serena Williams" , "PV Sindhu" , "Dhyan Chand" , "Vishwanathan Anand" , "Vijay pandy S" , "Mary Kom"};

	//Example of for loop	
	public void sportsAndPlayerName(){
		System.out.println("for loop example");
		for (int i =0;i<sports.length;i++){
			System.out.println("Sports name is :"+sports[i]+" ,"+"Player name is :"+playerName[i]);
		
		if(sports[i].equals("Chess")){
			System.out.println("Player For Chess is Vishwanathan Anand");
		}
		}}
		
	//Example of Do while loop
		public void sportName(){
			System.out.println("do while loop example");

			int ino=0;
			do {
								System.out.println("Sports Name is :"+sports[ino]);
				ino++;
			} while (sports.length<ino);
			
		}
		
	//Example of While loop
		
		public void playerName(){
			System.out.println("While loop example");
			int intno=0;
			while (playerName.length>intno){
				System.out.println("player name is :"+playerName[intno]);
				if (playerName[intno].equals("PV Sindhu")){
					System.out.println("PV Sindhu is a player of Badminton");
					break;
				}
				intno++;
			}
			}
		
   // Example of For each loop
		
		public void playerAndSportName (){
			System.out.println("for each loop example");
			int i = 0;
		for (String strSportName : sports) {
			
			System.out.println("Player name is :"+playerName[i]+"  "+"Sport name :"+strSportName);
			
			i++;
			
		}	
			
		}
		}
			
			
			
			
			
		
		
		
		
		
	
		
	
	
	
	


