package com.xworkz.javafeature.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
//@FunctionalInterface
public class ProductDto {
	private String productName;
	private Double price;
	private int quantity;

}
