package com.xworkz.AbstractProjects.serves;

import com.xworkz.AbstractProjects.Dto.BikeDto;

public abstract class BikeDetails {
	
	public abstract boolean validateFuleType(BikeDto bikedto);
	public abstract boolean validateCompanyName(BikeDto bikeCompany);
	public abstract boolean validateMilage(BikeDto milage);

}
