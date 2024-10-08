package com.xworkz.excaptionProjects.Runner;

import com.xworkz.excaptionProjects.Exception.CarNotAvailable;

public class CarNotAviRunner {

	public static void main(String[] args) throws CarNotAvailable {
		System.out.println("main method");
		throw new CarNotAvailable("i20");

	}

}
