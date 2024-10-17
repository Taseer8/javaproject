package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Company {

	public static void main(String[] args) {
		Collection<String> compan = new ArrayList<String>();
		compan.add("infosis");
		compan.add("Wipro");
		compan.add("conctricts");
		compan.add("matrixstreem");
		compan.add("adoab");
		compan.add("xworkz");
		compan.add("xstream");
		compan.add("postman");
		System.out.println(compan);
		System.out.println(compan.size());
		compan.remove("Wipro");
		System.out.println(compan);
		System.out.println(compan.contains("infosis"));
		System.out.println(compan.removeAll(compan));
	}

}
