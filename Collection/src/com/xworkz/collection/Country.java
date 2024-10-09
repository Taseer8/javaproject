package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;


public class Country {

	public static void main(String[] args) {
		 ArrayList<String> country = new ArrayList<String>();
		country.add("india");
		country.add("Bangladash");
		country.add("Naigariya");
		country.add("Pakistan");
		country.add("sri lanka ");
		country.add("china");
		country.add("nepal");
		country.add("Buthan");
		country.add("south Kouria");
		country.add("rassia");
		country.add("kuait");
		country.add("kathar");
		country.add("palistain");
		country.add("imen");
		country.add("iran");
		country.add("irak");
		country.add("north africa");
		country.add("south africa");
		country.add("indonatia");
		country.add("owman");
		Collections.sort(country);
		System.out.println(country);

	}

}
