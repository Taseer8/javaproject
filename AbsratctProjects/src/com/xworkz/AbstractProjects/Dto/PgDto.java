package com.xworkz.AbstractProjects.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PgDto {
	
	private PgName pgName;
	private String address;
	private int rentAmount;

}
