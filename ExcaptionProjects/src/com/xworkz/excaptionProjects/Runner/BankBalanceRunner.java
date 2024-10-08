package com.xworkz.excaptionProjects.Runner;

import com.xworkz.excaptionProjects.Exception.BankBalnceCheck;

public class BankBalanceRunner {

	public static void main(String[] args) throws BankBalnceCheck {
		// TODO Auto-generated method stub
		System.out.println("main method");
		throw new BankBalnceCheck(3456);

	}

}
