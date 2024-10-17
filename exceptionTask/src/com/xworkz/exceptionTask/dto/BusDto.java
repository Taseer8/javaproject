package com.xworkz.exceptionTask.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BusDto {
	private String startingPoint;
	private String destination;
	private int priceOfTicket;


}
