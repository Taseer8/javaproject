package com.xworkz.javafeature.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.javafeature.dto.ProductDto;

public class ProductRunner {

	public static void main(String[] args) {
		List<ProductDto> pdto = new ArrayList<ProductDto>();
		pdto.add(new ProductDto("Laptop",50499.89,2));
		pdto.add(new ProductDto("mobile",30000.788,1));
		pdto.add(new ProductDto("washing machine",57499.89,1));
		System.out.println(pdto);
		Comparator<ProductDto> ref = (ProductDto s1, ProductDto s2)-> s1.getPrice().compareTo(s2.getPrice());	
		
		Collections.sort(pdto, ref);
		System.out.println(pdto);
	}

}
