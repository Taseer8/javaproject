package com.xworkz.javafeature.repo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ComNumber {

	public static void main(String[] args) {
		List<Integer> num  = new ArrayList<Integer>();
		int[] sum = {0};
		num.add(1);
		num.add(3);
		num.add(2);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(10);
		num.add(11);
		num.add(12);
		num.add(13);

		Comparator<Integer> comp = (Integer i1,Integer i2)->i1.compareTo(i2);

		Collections.sort(num,comp);
		System.out.println(num);
		//		
		List<Character> cha  = new LinkedList<Character>();
		cha.add('a');
		cha.add('b');
		cha.add('c');
		cha.add('d');
		cha.add('e');
		cha.add('f');
		cha.add('g');
		cha.add('h');
		cha.add('i');
		cha.add('j');
		Comparator<Character> compp = (Character t1,Character t2)->t2.compareTo(t1);
		Collections.sort(cha,compp);
		System.out.println(cha);

		//dto 
		//first dto 
//		NamesDto name = new NamesDto();
//		name.setName("taseer");
		//second dto
//		NamesDto names = new NamesDto();
//		names.setName("abhishake");
		// dto array list
		List<NamesDto> dto  = new ArrayList<NamesDto>();
		dto.add(new NamesDto("Taseer"));
		dto.add(new NamesDto("Sufiyan"));
		dto.add(new NamesDto("Abhishek"));
		dto.add(new NamesDto("Ravi"));
//		dto.add(name);
		System.out.println(dto);

		Comparator<NamesDto> compr = (NamesDto f1, NamesDto f2)-> f2.getName().compareTo(f1.getName());
		Collections.sort(dto, compr);
		System.out.println(dto);

		//sum of list elements
		num.forEach(s -> sum[0] += s);
		System.out.println("sum array elements:"+sum[0]);
		
		
		List<Double> doublenumber = new ArrayList<Double>();
		doublenumber.add(0.1235);
		doublenumber.add(0.7895);
		doublenumber.add(0.8952);
		doublenumber.add(0.7895);
		doublenumber.add(0.7862);
		doublenumber.add(0.45885);
		doublenumber.add(0.7984);
		doublenumber.add(0.1562);
		doublenumber.add(0.5642);
		doublenumber.add(0.10256);
		Comparator<Double> ref = (Double s1, Double s2)-> s1.compareTo(s2);	
		Collections.sort(doublenumber, ref);
		System.out.println(doublenumber);

	}

}
