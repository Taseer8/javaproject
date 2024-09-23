package com.xworkz.programmings.things;

public class Hcf {
	public static void main(String[] args) {
		int number = 12;
		int number1 = 36;
		int hcf = 0;
		 
		for(int i =1; i<=number || i<=number1; i++) {
			if(number% i ==0 && number1 % i ==0)  
				hcf = i;
				
			
			
		}
		System.out.println("HFC number is :"+hcf);
	}

}
