package com.xworkz.assocations.runner;

import com.xworkz.assocations.things.*;

public class CountryRunner {

	public static void main(String[] args) {
		Area area = new Area("32000Sqkm");
		area.setArea("24300sqkm");
		System.out.println("Area in square KMs:"+area.getArea());
		City city = new City("Ballari", 34,area);
		State state = new State("Karnataka", 17,city);
		Country country = new Country("India",state);
		System.out.println(country);
	}

}
