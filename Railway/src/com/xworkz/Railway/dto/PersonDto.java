package com.xworkz.Railway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class PersonDto {
	private String name;
	private int age;
	private Long mobileNo;
	private long aadharNO;
	private double ticketPrice;

}
