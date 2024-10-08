package com.xworkz.Exception.runner;

import com.xworkz.Exception.excception.ArrayIndexOutOfBoundry;

public class ArrayIndexOutOfBoundryRunner {

	public static void main(String[] args)  throws ArrayIndexOutOfBoundry {
		try {
	        int[] numbers = {1, 2, 3};
	        System.out.println("Accessing element at index 3: " + numbers[3]);  
	    } catch (IndexOutOfBoundsException e) {
	    	System.out.println("Index Out Of Bounds Exception");
	      throw new ArrayIndexOutOfBoundry();  
	    }
	}
}
