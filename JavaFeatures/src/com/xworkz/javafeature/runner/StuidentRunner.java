package com.xworkz.javafeature.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.javafeature.dto.StudentDto;

public class StuidentRunner {

	public static void main(String[] args) {
		List<StudentDto> list = new ArrayList<StudentDto>();
		list.add(new StudentDto("Taseer",25,'A'));
		list.add(new StudentDto("Smd",20,'D'));
		list.add(new StudentDto("Rehan",23,'A'));
		list.add(new StudentDto("Faiz",22,'B'));
		list.add(new StudentDto("saif",21,'C'));
		
		
		Comparator<StudentDto> ref = (StudentDto s1, StudentDto s2)-> s1.getGrade().compareTo(s2.getGrade());	
		Collections.sort(list, ref);

		System.out.println(list);
		Comparator<StudentDto> ref1 = (StudentDto s1, StudentDto s2)-> s1.getAge().compareTo(s2.getAge());
		Collections.sort(list, ref1);
		System.out.println(list);
	}

}
