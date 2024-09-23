package com.xworkz.AbstractProjects.Dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class BikeDto {
	
	private Type fuelType;
	private String companyname;
	private int milage;
	
	

}
