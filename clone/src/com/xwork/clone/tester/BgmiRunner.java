package com.xwork.clone.tester;

import java.util.Scanner;

//import com.xwork.clone.things.Bgmi;

public class BgmiRunner {
 public static void main(String[] args) {
//	Bgmi bgmi = new Bgmi();
//	bgmi.playerId = 123;
//	bgmi.PlayerName = " taseer";
	 
	 // 8th program
	try(Scanner scanner = new Scanner(System.in);){
		System.out.println("entre the player id");
		System.out.println("player id is :"+scanner.nextInt());
		System.out.println("enter the user name");
		System.out.println("player name is :"+scanner.next());
		
		
	}
}

}
