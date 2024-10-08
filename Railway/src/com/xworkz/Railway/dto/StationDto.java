package com.xworkz.Railway.dto;

import com.xworkz.Railway.constant.Location;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class StationDto {
	
	private String stantionName; 
	private int trailNo;
	private int plateformNO;
	private int pinCode;
	private String destiPlace;
	private Location location;
	private PersonDto persondto;
	@Override
	public String toString() {
		return "StationDto [stantionName=" + stantionName + ", trailNo=" + trailNo + ", plateformNO=" + plateformNO
				+ ", pinCode=" + pinCode + ", destiPlace=" + destiPlace + ", location=" + location + ", persondto="
				+ persondto + "]";
	} 
	
	

}
