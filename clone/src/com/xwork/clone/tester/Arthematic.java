package com.xwork.clone.tester;

public class Arthematic {
	//6th program
    public static void main(String[] args) {
        int num1 = 10;
        int number = 0;
        double result ;
       
        try {
            result = num1 / number;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
        	
            System.out.println("Error: Cannot divide by zero.");
            e.printStackTrace();
        } finally {
            System.out.println("Division operation is completed.");
        }

       
    }
}

