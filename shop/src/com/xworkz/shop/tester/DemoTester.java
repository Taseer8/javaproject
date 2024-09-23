package com.xworkz.shop.tester;

import java.util.Scanner;

import com.xworkz.shop.things.*;

public class DemoTester {

	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		String fr = sc.next();
		String rev="";
		char[] ch = fr.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			rev=rev+ch[i];
		}
		if(fr==rev) {
			System.out.println("it is a palimdrom");
		}
		else {
			System.out.println("it not a palimdrom");
		}
	}
}
