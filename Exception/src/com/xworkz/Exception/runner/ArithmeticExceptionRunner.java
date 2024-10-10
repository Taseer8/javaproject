package com.xworkz.Exception.runner;

public class ArithmeticExceptionRunner {

	public static void main(String[] args) {
		       try {
		            int checkAge =18 ; 
		            if(checkAge<18) {
		            	throw new ArithmeticException("age is must be 18 or older");
		            }
		            else {
		            	
		            	throw new ArithmeticException("age is correct");
		            }
		       } catch (ArithmeticException e) {
		            System.out.println("Caught an exception: " + e.getMessage());
		        }
		       
		        throw new ArithmeticException("hi ");
		    }
	

	}

