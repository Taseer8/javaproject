package com.xworkz.javaslipTest.tester;

import java.util.Scanner;

public class Bank {
	public void bank()   {
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the amount to withdrwa");
			int bankbalance = sc.nextInt() ;
			if(bankbalance <= 500) {
			System.out.println("in suffient balance maintain minimum balance");
			}
			else {
				System.out.println("the balance"+bankbalance);
			}
		} 
	}
	public static void main(String[] args) throws InsufficientFundsExcception {
		Bank name = new Bank();
		name.bank();
	}

}
