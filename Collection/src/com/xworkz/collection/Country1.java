package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Country1 {
	public static void main(String[] args) {
		Collection<String> country = new ArrayList<String>();
		country.add("India");
		country.add("Bangladash");
		country.add("Naigariya");
		country.add("Pakistan");
		country.add("sri lanka");
		country.add("china");
		country.add("Nepal");
		System.out.println(country);
		System.out.println(country.size());
		System.out.println("contains:" +country.contains("India"));
		country.remove("Bangladash");
		System.out.println(country);
		System.out.println(country.addAll(country));
		country.removeAll(country);
		System.out.println(country);
		country.clear();
		System.out.println(country);
	}

}
