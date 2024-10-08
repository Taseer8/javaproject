package com.xworkz.Exception.runner;

import com.xworkz.Exception.excception.IllegalArgumentExceptions;

public class IllegalArgumentExceptionRunner {

	public static void main(String[] args) throws IllegalArgumentExceptions {

		 try {
			 	setDate(-5);
	        } catch (IllegalArgumentException e) {
	        	setDate(27); 
	            System.out.println("Caught Exception: " + e.getMessage());
	        }
		 throw new IllegalArgumentExceptions("throw and throws exceptions ");
	}
	    public static void setDate(int date) {
	        if (date < 1 || date > 31) {
	            throw new IllegalArgumentException("Age must be between 1 and 31 .");
	        } else {
	            System.out.println("date set to: " + date);
	        }
	    }
	    
}

