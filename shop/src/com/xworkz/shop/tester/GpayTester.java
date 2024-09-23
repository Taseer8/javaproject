package com.xworkz.shop.tester;

import com.xworkz.shop.things.Gpay;

public class GpayTester {

	public static void main(String[] args) {
		Gpay.getDetails("Google Pay");
		Gpay.getDetails("v3.4","Google Pay");
		Gpay.getDetails("v3.4","Google Pay",1000.00);
		Gpay.getDetails(true);
		String sr[] = {"USD" , "INR"};
		for(int i=0; i<sr.length; i++) {
//			Gpay.getDetails(sr);
			if(Gpay.supportedCurrencies == sr) {
				System.out.println("supported Currencie:"+sr[i]);
			}
			else {
				System.out.println("it doesn't match:"+sr[i]);
				}
			Gpay.getDetails(sr);
		
		}
		
	}
	
}
