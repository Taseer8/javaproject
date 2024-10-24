package com.xworkz.javafeature.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.javafeature.dto.BettryLife;
import com.xworkz.javafeature.dto.GadgetDto;
import com.xworkz.javafeature.dto.Price;

public class GedgetRunner {

	public static void main(String[] args) {
		List<GadgetDto> gDto = new ArrayList<GadgetDto>();
		gDto.add(new GadgetDto("redme", 87, 18000.00) );
		gDto.add(new GadgetDto("oppo", 87, 8000.00) );
		gDto.add(new GadgetDto("samsung", 92, 38000.00) );

		Collections.sort(gDto, new BettryLife());
		System.out.println(gDto);
		Collections.sort(gDto, new Price());
		System.out.println(gDto);

		Comparator<GadgetDto> gadget = Comparator.comparingInt(GadgetDto::getBettryLife)
				.thenComparing(GadgetDto::getPrice);
		System.out.println("comparing both bettary and price");
		Collections.sort(gDto, gadget);
		System.out.println(gDto);

	}

}
