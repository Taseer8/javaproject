package com.xworkz.AbstractProjects.runner;

import com.xworkz.AbstractProjects.Dto.City;
import com.xworkz.AbstractProjects.Dto.PlaceDto;
import com.xworkz.AbstractProjects.serves.Bangalore;
import com.xworkz.AbstractProjects.serves.PlaceDetails;

public class PlaceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		City city = new City("BTM");
		PlaceDto place = new PlaceDto();
		
		place.setCityname(city);
		place.setFemFood("Tatai Idli");
		place.setMertoCity(true);
		
		PlaceDetails details = new Bangalore();
		details.validateCityName(place);
		details.validateFeMFood(place);
		details.validateIsMetroCity(place);
		

	}

}
