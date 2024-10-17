package com.xworkz.javaslipTest.tester;

public class Playable {
	
	public static void main(String[] args) {
		
		try {
			int a = 14;
			if(a>15) {
				System.out.println("enter the number is :"+a);
			}
		}
			catch(ArithmeticException e){
				System.out.println("enter the number Which is greater then 15");
				e.printStackTrace();
				
			}
			
		
	}
	

}
