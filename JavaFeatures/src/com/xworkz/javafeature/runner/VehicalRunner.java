package com.xworkz.javafeature.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.javafeature.dto.VehicalDto;

public class VehicalRunner {

	public static void main(String[] args) {
		List<VehicalDto> list = new ArrayList<VehicalDto>();
		list.add(new VehicalDto("hero","super70",90));
		list.add(new VehicalDto("honda","shine150",110));
		list.add(new VehicalDto("Tvs","Tvs110",80));
		Collections.sort(list);
		System.out.println(list);

	}

}
