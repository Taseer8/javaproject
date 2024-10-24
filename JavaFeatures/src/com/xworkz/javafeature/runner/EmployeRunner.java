package com.xworkz.javafeature.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.javafeature.dto.EmployeDto;
import com.xworkz.javafeature.dto.ProductDto;



public class EmployeRunner {

	public static void main(String[] args) {
		List<EmployeDto> eDto = new ArrayList<EmployeDto>();

		eDto.add(new EmployeDto("faiz",3, 35000.00));
		eDto.add(new EmployeDto("Taseer",5,57499.89));
		eDto.add(new EmployeDto("mash",2,30000.00));
		System.out.println("before sort"+eDto);
		Collections.sort(eDto);
		System.out.println("data"+eDto);








	}

}
