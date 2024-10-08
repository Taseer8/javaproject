package com.xworkz.Exception.runner;

import com.xworkz.Exception.excception.IndexOutOfBoundry;

public class IndexOutOfBoundryRunner {

	public static void main(String[] args) throws IndexOutOfBoundry {
		try {
	        String[] names = {"taseer", "smd", "shaik"};
	        System.out.println("Accessing element at index 3: " + names[3]);  
	    } catch (ArrayIndexOutOfBoundsException e) {
	    	System.out.println("Index Out Of Bounds Exception");
	      throw new IndexOutOfBoundry();  
	    }
	}

}


