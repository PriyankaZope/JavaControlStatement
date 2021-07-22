package com.Day8Interface;

public class TestInterface implements Interface4{
	@Override
	public void playerName(String player1, String player2) {
		
	}
	@Override
	public void teamNamesforMatch(String team1) {
		// TODO Auto-generated method stub
	}

	@Override
	public void sportName() {
		// TODO Auto-generated method stub
	}

	@Override
	public void getprize() {
		System.out.println("=========================");

		System.out.println("Prize for winner :"+prize);
	}


	public static void main(String[] args) {
		Interface2 objInterface2 = new Interface2();                          // object of Interface2 class
		objInterface2.sportName();                         
		objInterface2.playerName("Hardik Pandya", "Rohit Sharma");
		objInterface2.teamNamesforMatch("Mumbai Indians");
		
		Interface3 objInterface3 = new Interface3();                        //object of Interface3 class
		objInterface3.sportName();
		objInterface3.playerName("Messi", "Neymar");
		objInterface3.teamNamesforMatch("Bears");
		
		TestInterface objTestInterface = new TestInterface();
		objTestInterface.getprize();

	}

	
}
