package com.xworkz.shop.tester;

import com.xworkz.shop.constant.Laptops;

public class Dell extends Laptop {
	
	public Dell() {
		super("dell" , Laptops.COMPANYNAME.toString());
	}
	
	@Override
	public void CompanysName() {
		System.out.println("getting the company name in sub class");
	}
	@Override
	public void modelNames() {
		System.out.println("getting the model name in the sub class");
	}
	public void getDetails() {
		super.CompanysName();
		super.modelNames();
	}

}
