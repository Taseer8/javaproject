package com.xworkz.javafeature.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class EmployeDto implements Comparable<EmployeDto> {
	private String e_Name;
	private Integer e_Id;
	private Double e_Salary;
	@Override
	public int compareTo(EmployeDto o) {
		return this.getE_Salary().compareTo(o.e_Salary);
	}

}
