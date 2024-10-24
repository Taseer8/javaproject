package com.xworkz.javafeature.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.javafeature.dto.PersonDto;

public class PersonRunnerC {

	public static void main(String[] args) {
		PersonDto pdto = new PersonDto();
		pdto.setName("taseer");
		pdto.setAge(23);

		PersonDto pdto1 = new PersonDto();
		pdto1.setName("ravi");
		pdto1.setAge(24);

		PersonDto pdto2 = new PersonDto();
		pdto2.setName("Zuber");
		pdto2.setAge(21);


		List<PersonDto> list = new ArrayList<PersonDto>();
	
		list.add(pdto);
		list.add(pdto2);
		list.add(pdto1);
		System.out.println("result 2:"+list);
		Comparator<PersonDto>  comparator = (PersonDto a1 , PersonDto a2)-> a1.getAge().compareTo(a2.getAge());
		Collections.sort(list,comparator);
		System.out.println("result 2:"+list);
		// string
		
		List<String> names = new ArrayList<String>();
		names.add("taseer");
		names.add("faiz");
		names.add("abba");
		names.add("ammi");
//		names.add(null);
		Comparator<String> compe = (String f1, String f2)-> f1.compareTo(f2);
		Collections.sort(names,compe);
		System.out.println(names);


	}

}
