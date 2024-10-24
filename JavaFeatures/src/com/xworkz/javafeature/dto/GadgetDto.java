package com.xworkz.javafeature.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@ToString
public class GadgetDto {
	private String brand;
	private Integer bettryLife;
	private Double price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getBettryLife() {
		return bettryLife;
	}
	public void setBettryLife(Integer bettryLife) {
		this.bettryLife = bettryLife;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	

}
