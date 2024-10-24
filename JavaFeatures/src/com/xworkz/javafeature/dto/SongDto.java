package com.xworkz.javafeature.dto;

import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class SongDto {
	private String sName;
	private int duration;
	
	
//	public String getsName() {
//		return sName;
//	}
//	public void setsName(String sName) {
//		this.sName = sName;
//	}
	
}
