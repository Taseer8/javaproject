package com.xworkz.excaptionProjects.Exception;

public class CarNotAvailable extends Throwable {
	
	public CarNotAvailable(String car) {
		if(car!=null) {
			System.out.println("car is  avaliable");
		}
		else {
			System.out.println("car is not avaliable");
		}
		
	}

}
