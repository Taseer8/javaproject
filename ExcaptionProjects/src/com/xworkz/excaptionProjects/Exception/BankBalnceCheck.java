package com.xworkz.excaptionProjects.Exception;

public class BankBalnceCheck extends Throwable { 
	
	public BankBalnceCheck(int balance) {
	
		// TODO Auto-generated constructor stub
		if(balance == 0) {
			System.out.println("maintain a minimum balance");
		}
		else {
			System.out.println("the balnce is :"+balance);
		}
	}

}
