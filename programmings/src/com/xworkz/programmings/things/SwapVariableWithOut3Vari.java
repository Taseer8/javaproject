package com.xworkz.programmings.things;

public class SwapVariableWithOut3Vari {

	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("afterswaping "+"\na:"+a+ "\nb:"  +b);

	}

}
