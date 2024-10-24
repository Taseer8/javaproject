package com.xworkz.javafeature.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieRunner {

	public static void main(String[] args) {
		List<MovieDto> list = new ArrayList<MovieDto>();
		list.add(new MovieDto("bhahubali", 4.8, 2018));
		list.add(new MovieDto("KGF", 5.0, 2022));
		list.add(new MovieDto("Devara", 3.2, 2024));
		
		Comparator<MovieDto> com1 = (MovieDto a1,MovieDto a2 )-> a2.getRating().compareTo(a1.getRating());
		Collections.sort(list, com1);
		System.out.println(list);
		Comparator<MovieDto> com2 = (MovieDto a1,MovieDto a2 )-> a1.getReleaseYear().compareTo(a2.getReleaseYear());
		Collections.sort(list, com2);
		System.out.println(list);
		
		Comparator<MovieDto> com3 = Comparator.comparing(MovieDto::getRating).thenComparing(MovieDto::getReleaseYear);
		Collections.sort(list, com3);
		System.out.println(list);


	}

}
