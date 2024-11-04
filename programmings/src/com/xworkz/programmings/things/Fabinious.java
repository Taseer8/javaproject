package com.xworkz.programmings.things;

import java.util.Scanner;

public class Fabinious {

	public static void main(String[] args) {
		int a = 0;
		int b= 1;
		int c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int count = sc.nextInt();


		for(int i = 0; i<count; i++) {
			a = b;
			b = c;
			c = a +b;
			System.out.print(a +",");
		}

	}


}
