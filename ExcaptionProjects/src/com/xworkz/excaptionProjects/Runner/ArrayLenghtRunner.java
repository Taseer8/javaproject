package com.xworkz.excaptionProjects.Runner;

import com.xworkz.excaptionProjects.Exception.ArrayLenght;

public class ArrayLenghtRunner {
	public static void main(String[] args) throws ArrayLenght {
		System.out.println("main method");
		String taseer[] = {"taseer","faiz", "arif"};
		String tasee[]= null;
	   throw new ArrayLenght(taseer);
	}
}
