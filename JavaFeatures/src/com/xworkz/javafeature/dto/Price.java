package com.xworkz.javafeature.dto;

import java.util.Comparator;

public class Price implements Comparator<GadgetDto> {

	@Override
	public int compare(GadgetDto o1, GadgetDto o2) {
		
		return o1.getPrice().compareTo(o2.getPrice());
	}

}
