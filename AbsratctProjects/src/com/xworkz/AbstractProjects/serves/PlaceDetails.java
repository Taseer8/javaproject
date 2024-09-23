package com.xworkz.AbstractProjects.serves;

import com.xworkz.AbstractProjects.Dto.PlaceDto;

public abstract class PlaceDetails  {
	
	public abstract boolean validateCityName(PlaceDto placedto);
	public abstract boolean validateFeMFood(PlaceDto femFood);
	public abstract boolean validateIsMetroCity(PlaceDto ismetroCity);

}
