package com.xworkz.javafeature.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class VehicalDto implements Comparable<VehicalDto> {
	private String b_name;
	private String model_number;
	private Integer speed;
	@Override
	public int compareTo(VehicalDto o) {
		return this.speed.compareTo(o.speed );
	}

}
