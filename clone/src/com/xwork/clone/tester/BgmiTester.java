package com.xwork.clone.tester;

import com.xwork.clone.things.Bgmi;

public class BgmiTester {

	public static void main(String[] args) {
	Bgmi bgmi = new Bgmi();
	bgmi.playerId = 810;
	bgmi.PlayerName= "taseer";
	
	// 7th program  
	
	try {
		String userName = bgmi.PlayerName  +  bgmi.playerId;
		System.out.println("userName:"+userName);
		int user = bgmi.playerId / 0;
		System.out.println("user"+user);
	}
	finally {
		System.out.println("i have combined both the player names & id");
	}

	}

}
