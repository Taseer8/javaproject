package com.xworkz.shop.things;
import java.util.Scanner;

public class Demo {
	
	public Demo() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if( a%2 == 0) {
			System.out.println("then it is a even");
		}
		else {
		System.out.println("its is a odd");
		}
	}
	public void palimdrom() {
		
		Scanner sc = new Scanner(System.in); 
		String sh = sc.next();
		char[] ch = sh.toCharArray();
		for(int j=0; j<ch.length; j++) {
			for(int i=ch.length-1; i>=0; ) {
			if(ch[i] == ch[j]) {
				System.out.println("it is a palimdrom");
				return;
			}
			else {
				System.out.println("its not a palimdrom");
				return;
			}	
		}
			}
		}
	}