package com.xworkz.Television.Dto;

import com.xworkz.Television.constants.TvEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class TvDto {
	
	private String brandName;
	private int price;
	private double resulaution;
	private boolean is8kSupport;
	private TvEnum  ScreenSize;

}
