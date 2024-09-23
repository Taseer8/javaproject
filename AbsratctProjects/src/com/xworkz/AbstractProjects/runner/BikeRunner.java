package com.xworkz.AbstractProjects.runner;

import com.xworkz.AbstractProjects.Dto.BikeDto;
import com.xworkz.AbstractProjects.Dto.Type;
import com.xworkz.AbstractProjects.serves.BikeDetails;
import com.xworkz.AbstractProjects.serves.Hero;

public class BikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Type type = new Type("Petrol");
		BikeDto bike = new BikeDto();
		
		bike.setFuelType(type);;
		bike.setMilage(75);
		bike.setCompanyname("hero");
		
		BikeDetails details = new Hero();
		details.validateFuleType(bike);
		details.validateCompanyName(bike);
		details.validateMilage(bike);
	}

}
