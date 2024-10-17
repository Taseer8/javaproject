package com.xworkz.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> linked = new ArrayList<String>();
		linked.add("bangalore");
		linked.add("Ballari");
		linked.add("gadag");
		linked.add("hubli");
		linked.add("mysure");
		linked.add(1, "Raichur");
		System.out.println(" list:"+linked);
		linked.remove(4);
		System.out.println("aftering removing lined list:"+linked);
		System.out.println("equyals:" +linked.equals(linked));
		System.out.println(linked.contains("Ballari"));
		System.out.println(linked.size());

		System.out.println(linked.subList(2, 4));
		System.out.println("to string:"+linked.toString());
		System.out.println(linked.isEmpty());
		System.out.println(linked.retainAll(linked));
		linked.removeAll(linked);
		System.out.println(linked);
		


	
		

	}

}
