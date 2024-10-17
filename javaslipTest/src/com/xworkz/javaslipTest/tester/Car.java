package com.xworkz.javaslipTest.tester;

public class Car extends Vehical {
	
	@Override
	public void start() {
		super.start();
		System.out.println("from the car child");
	}

}
