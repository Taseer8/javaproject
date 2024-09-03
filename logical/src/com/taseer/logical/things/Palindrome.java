package com.taseer.logical.things;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String org = sc.next();
		String rev="";
		char[] ch = org.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);

		if(org.equals(rev)) {
			System.out.println("it is a palimdrom");
		}
		else {
			System.out.println("it not a palimdrom");
		}
	}

}
