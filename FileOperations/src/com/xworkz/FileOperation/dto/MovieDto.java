package com.xworkz.FileOperation.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor

public class MovieDto implements Serializable{
	private String title ;
	private Double rating;
	private Integer releaseYear;

}
