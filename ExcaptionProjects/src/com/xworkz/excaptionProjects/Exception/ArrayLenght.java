package com.xworkz.excaptionProjects.Exception;

public class ArrayLenght extends Throwable {
	public String[] array;
	public ArrayLenght(String []arrays) {
		this.array=arrays;
		if(array!=null) {
			System.out.println("array lenght"+arrays.length);
		}
		else {
			System.out.println("provide a elements in array");
		}
	}


}
