package com.xworkz.javafeature.dto;

import java.util.Comparator;

public class BettryLife implements Comparator<GadgetDto> {

	@Override
	public int compare(GadgetDto o1, GadgetDto o2) {
		// TODO Auto-generated method stub
		return o2.getBettryLife().compareTo(o1.getBettryLife());
	}

}
