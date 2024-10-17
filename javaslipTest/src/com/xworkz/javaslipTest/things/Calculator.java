package com.xworkz.javaslipTest.things;

public class Calculator {
	
	public void add(int a, int b) {
		int result = a + b;
		System.out.println("result:"+result);
		
	}
	public void add(byte a, byte b) {
		byte result = (byte) (a - b);
		System.out.println("result:"+result);
	}
	public void add(String name , String name1 ) {
		String result1 = name + name1;
		System.out.println("result:"+result1);
	}

}
