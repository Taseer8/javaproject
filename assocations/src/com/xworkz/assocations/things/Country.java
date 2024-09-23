package com.xworkz.assocations.things;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@Getter
@AllArgsConstructor

public class Country {
	
	
	private String countryName;
	private State state;
	

}
