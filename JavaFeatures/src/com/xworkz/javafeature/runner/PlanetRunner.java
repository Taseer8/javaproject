package com.xworkz.javafeature.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.javafeature.dto.PlanetDto;

public class PlanetRunner {

	public static void main(String[] args) {
        List<PlanetDto> planets = new ArrayList<PlanetDto>();
        planets.add(new PlanetDto("Earth", 5.972E24, 12742));
        planets.add(new PlanetDto("Jupiter", 1.898E27, 139820));
        planets.add(new PlanetDto("Mars", 6.39E23, 6779));
        planets.add(new PlanetDto("Venus", null, 12104));   
        planets.add(new PlanetDto("Mercury", 3.285E23, 4879));
        planets.add(new PlanetDto("Saturn", 5.683E26, 116460));
        Comparator<PlanetDto> massComparator = Comparator.comparing(PlanetDto::getMass,
        		Comparator.nullsLast(Comparator.naturalOrder()));
        Collections.sort(planets, massComparator);
         System.out.println("mass "+planets);

	}

}
