package com.Xworkz.Game.runner;

import com.Xworkz.Game.things.Cricket;
import com.Xworkz.Game.things.FootBall;
import com.Xworkz.Game.things.Game;

public class GameTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		game.setDuration(4);
		System.out.println("game duration "+game.getDuration());
		
		
		Cricket cricket = new Cricket();
		cricket.setGameName("crickret");
		cricket.settNoOfPlayers(11);
		cricket.setDuration(1);
		cricket.setSalary(1600000l);
		cricket.setTeamName("RCB");
		System.out.println(cricket.getGameName());
		System.out.println(cricket.getNoOfPlayers());
		System.out.println(cricket.getDuration());
		System.out.println(cricket.getSalary());
		System.out.println(cricket.getTeamName());
		
		FootBall football = new FootBall();
		football.setGameName("FootBall");
		football.settNoOfPlayers(11);
		football.setDuration(90);
		football.setSalary(100000l);
		football.setTeamName("Bangalore FC");
		
		
		
		System.out.println(football.getGameName());
		System.out.println(football.getNoOfPlayers());
		System.out.println(football.getSalary());
		System.out.println(football.getDuration());
		System.out.println(football.getTeamName());


	}

}
