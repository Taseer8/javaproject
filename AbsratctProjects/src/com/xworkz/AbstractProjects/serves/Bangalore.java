package com.xworkz.AbstractProjects.serves;

import com.xworkz.AbstractProjects.Dto.City;
import com.xworkz.AbstractProjects.Dto.PlaceDto;

public class Bangalore  extends PlaceDetails{

	City city = new City("BTM");
	@Override
	public boolean validateCityName(PlaceDto placedto) {
		if (placedto != null) {
			if(placedto.getCityname().equals(city)) {
				System.out.println("place name in the bangalore: "+placedto);
			}
			else {
				System.out.println("this place is not available in bangalore");
			}
		}
		return false;
	}

	@Override
	public boolean validateFeMFood(PlaceDto femFood) {
		if (femFood != null) {
			if(femFood.getFemFood().equals("Tatai Idli")) {
				System.out.println("famous food   in the bangalore is "+femFood);
			}
			else {
				System.out.println("ths is not a  bangalore's famous food");
			}
		}
		
		return false;
	}

	@Override
	public boolean validateIsMetroCity(PlaceDto ismetroCity) {
		if (ismetroCity != null) {
			if(ismetroCity.isMertoCity()==true) {
				System.out.println("bangalore is a merto city"+ismetroCity);
			
		}
			else {
				System.out.println("its not a metro city");
			}
			
		}

		return false;
	}

}