package com.xworkz.shop.things;

import com.xworkz.shop.constant.Laptops;
import com.xworkz.shop.tester.Dell;
import com.xworkz.shop.tester.Laptop;

public class LaptopTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Laptop laptop =	new Laptop();
//	laptop.setCompany("lenova");
//	laptop.setModelName(Laptops.COMPANYNAME.toString());
//	laptop.CompanysName();
//	System.out.println(laptop.getCompany());
//	laptop.modelNames();
//	System.out.println(laptop.getModelName());
	
	Dell laptops =	new Dell();
	laptops.setCompany("asus");
	laptops.setModelName(Laptops.COMPANYNAME.toString());
	laptops.CompanysName();
	System.out.println(laptops.getCompany());
	laptops.modelNames();
	System.out.println(laptops.getModelName());
	laptops.getDetails();
	

	}

}
