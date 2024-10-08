package com.xworkz.Exception.runner;

import com.xworkz.Exception.excception.IllegalArgumentExceptions;
import com.xworkz.Exception.excception.IllegalStatementExceptions;

public class IllegalStatementExceptionRunner  {

	public static void main(String[] args) throws IllegalStatementExceptions {
		try {
			getBus("600500f");
		}
		catch(IllegalStateException e) {
			System.out.println("setting the bus root which goes to Banshankri:"+e.getMessage());
			getmessage();
			
		}

		throw new IllegalStatementExceptions("");
	}
	public static void getBus(String str)  {
		if(str.equalsIgnoreCase("600f") || str.equalsIgnoreCase("500f")) {
			throw new IllegalStateException("Banshankri bus roat nu is :"+str);
			
		}
		else {
			throw new IllegalStateException("Banshankri bus root num is :"+"600f 500f");
		}
		
	}
	public static void getmessage() {
		System.out.println("this bus doesnt goes to banshankri");
	}
	


}
