package com.xworkz.javaproject.tester;

import java.util.Scanner;

public class FindingTheWrongString {
	
	public static void findWrong(String orginalString) {
		String ch[] = orginalString.split(" ");
		String replace = " " ;
		if( orginalString != null) {
			for(int i=0 ; i<ch.length; i++) {
				
				if(ch[i].equals("ouy")) {
					ch[i]="you";
				}
			}
			
			
			replace = replace+orginalString;
			System.out.println(replace);
		}
		
		
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		findWrong(str);
	}

}
