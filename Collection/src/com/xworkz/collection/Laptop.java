package com.xworkz.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Laptop {

	public static void main(String[] args) {
		Set<String> data =new HashSet<String>();
		data.add("taseer");
		data.add("mohammed");
		data.add("faiz");
		data.forEach(s->System.out.println(s));
		System.out.println(data.contains("mohammed"));
		System.out.println(data.isEmpty());
		data.removeAll(data);
		System.out.println(data);
		
		System.out.println("LinkedHashSet");
		Set<String> data1 = new  LinkedHashSet<String>();
		data1.add("laptop");
		data1.add("mobile");
		data1.add("headphone");
		data1.add("keyboard");
		data1.forEach(r->System.out.println(r));
		data1.removeAll(data1);
		System.out.println(data1);
		
		Set<String> data2 = new TreeSet<String>();
		data2.add("cricket");
		data2.add("footBall");
		data2.add("batmentaion");
		data2.add("tableTeniss");
		data2.forEach(G->System.out.println(G));
		
	}

}
