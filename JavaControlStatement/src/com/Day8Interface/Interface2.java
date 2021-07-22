package com.Day8Interface;

public class Interface2 implements Interface1 {
	//String sport ="Cricket";
	String player3 = "Bumrah";
	String team2 = "Chennai Super Kings";
	
	@Override
	public void sportName() {
		System.out.println("=========================");
		System.out.println("\tSport Name : "+sport1);
		System.out.println("=========================");
		System.out.println("No of players : "+playerno);


	}
	@Override
	public void playerName(String player1, String player2) {
		player1="Hardik Pandya";
		player2="Rohit Sharma";
		System.out.println("Player1 : "+player1+" ,"+"Player 2 :"+player2);
		if (player1.equalsIgnoreCase("Hardik Pandya")){
			System.out.println("Player3 : "+player3);
		}
	}

	

	@Override
	public void teamNamesforMatch(String team1) {
		 team1 = "Mumbai Indians";
		System.out.println("Team :"+team1);
		if (team1.equalsIgnoreCase("Mumbai Indians")){
			System.out.println("Other team is : "+team2);
		}else System.out.println("Match is Cancelled!!!");
		
	}

	

}
