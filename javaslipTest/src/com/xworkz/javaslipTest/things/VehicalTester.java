package com.xworkz.javaslipTest.things;

import com.xworkz.javaslipTest.tester.Bike;
import com.xworkz.javaslipTest.tester.Car;

public class VehicalTester {

	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		Bike bike = new Bike();
		bike.start();
	}

}
