package com.xworkz.javafeature.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDto {
	private String name;
	private Integer age;
	private Character grade;

}
