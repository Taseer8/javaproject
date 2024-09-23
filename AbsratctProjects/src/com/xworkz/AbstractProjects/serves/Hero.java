package com.xworkz.AbstractProjects.serves;

import com.xworkz.AbstractProjects.Dto.BikeDto;
import com.xworkz.AbstractProjects.Dto.Type;

public class Hero extends BikeDetails{

	Type type = new Type("Petrol");
	
	@Override
	public boolean validateFuleType(BikeDto bikedto) {
		if(bikedto!= null) {
			if(bikedto.getFuelType().equals(type)) {
				System.out.println("its a bike"+bikedto);
			}
			else {
				System.out.println("itSs ev bike "+bikedto);
			}
			
			
		}
		return false;
	}

	@Override
	public boolean validateCompanyName(BikeDto bikeCompany) {
		if(bikeCompany!= null) {
			
			if(bikeCompany.getCompanyname().equalsIgnoreCase("Hero")) {
				System.out.println("this bike  belongs to  hero's vehical:"+bikeCompany);
			}
			else {
				System.out.println("this bike  belongs to unknown  company");
			}
		}
		
		return false;
	}

	@Override
	public boolean validateMilage(BikeDto milage) {
		if(milage !=null) {
			if(milage.getMilage()>74) {
				System.out.println("the milage is good"+milage);
			}
			else {
				System.out.println("milage is not good");
			}
		}
		return false;
	}
	


}
