package com.xworkz.Exception.runner;

import com.xworkz.Exception.excception.NullPointer;

public class NullpointerExceptionRunner {

	public static void main(String[] args) throws NullPointer {
		getNUll();


	}
	public static void getNUll() throws NullPointer  {
		String str= null;
		  try {
	            int length = str.length(); 
	        } catch (NullPointerException e) {
	            System.out.println("Attempted to access a method on a null reference!");
	        }
		  throw new NullPointer();
	}
}