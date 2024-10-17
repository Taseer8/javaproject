package com.xworkz.javaslipTest.tester;

import com.xworkz.javaslipTest.things.Calculator;

public class CalcTester {

	public static void main(String[] args) {
		Calculator name = new Calculator();
		name.add(2,3);
		name.add(4, 8);
		name.add("Taseer", "smd");
	}

}
