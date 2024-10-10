package com.xworkz.programs;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter thr number");
		int number = sc.nextInt();
		if (number < 0) {
			System.out.println("entered number is negitive:"+number);	
		}
		else if (number>0) {
			System.out.println("entered number is positive:"+number);		
		}
		else {
			System.out.println("the number is zero:"+number);
		}
	}
}
