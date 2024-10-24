package com.xworkz.javafeature.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.javafeature.dto.CityDto;

public class CityRunner {

	public static void main(String[] args) {
		List<CityDto> cities = new ArrayList<CityDto>();
		cities.add(new CityDto("Bangalore", 8443675));
		cities.add(new CityDto("Mumbai", 12442373));
		cities.add(new CityDto("Pune", 3124458));
		cities.add(new CityDto("Delhi", 11007835));
		cities.add(new CityDto("Chennai", 7088000));

		Comparator<CityDto> nameComparator = Comparator.comparing(city -> city.getName().toLowerCase());

		Collections.sort(cities, nameComparator);
		System.out.println(cities);
	}

}
