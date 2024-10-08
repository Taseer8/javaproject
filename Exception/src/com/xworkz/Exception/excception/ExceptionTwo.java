package com.xworkz.Exception.excception;


public class ExceptionTwo extends Throwable {
	
	public ExceptionTwo(String message) {
	super("message");
	System.out.println(" call from constractor taseer:"+message);
	}

}
