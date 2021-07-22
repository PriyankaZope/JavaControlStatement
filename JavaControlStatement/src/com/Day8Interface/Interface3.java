package com.Day8Interface;

public class Interface3 implements Interface1 {
	//String sport = "Football";
	String player3 = "Ronaldo";
	String team2 ="Carolina Panthers";
	

	@Override
	public void sportName() {
		System.out.println("=========================");
		System.out.println("\tSport Name : "+sport2);
		System.out.println("=========================");
		System.out.println("No of players : "+playerno);

		
	}

	@Override
	public void playerName(String player1, String player2) {
		System.out.println("Player1 : "+player1+" ,"+"Player 2 :"+player2);
		if (player1.equalsIgnoreCase("Messi")){
			System.out.println("Player3 :Ronaldo ");}
	}

	@Override
	public void teamNamesforMatch(String team1) {
       System.out.println("Football team for match : "+team1);		
       if (team1.equalsIgnoreCase("Bears")){
    	   System.out.println("2nd Team for match is :"+team2);
       }
	}

}
