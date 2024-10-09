package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;

public class State {
	public static void main(String[] args) {
		ArrayList<String> states = new ArrayList<String>();
		
		states.add("Karnataka");
		states.add("Haryana");
		states.add("Himachal Pradesh");
		states.add("Jharkhand");
		states.add("Kerala");
		states.add("Madhya Pradesh");
		states.add("Maharashtra");
		states.add("Manipur");
		states.add("Meghalaya");
		states.add("Mizoram");
		states.add("Nagaland");
		states.add("Andhra Pradesh");
		states.add("Arunachal Pradesh");
		states.add("Assam");
		states.add("Bihar");
        states.add("Odisha");
        states.add("Punjab");
        states.add("Rajasthan");
        states.add("Sikkim");
        states.add("Tamil Nadu");
		states.add("Chhattisgarh");
		states.add("Goa");
		states.add("Gujarat");
        states.add("Telangana");
        states.add("Tripura");
        states.add("Uttar Pradesh");
        states.add("Uttarakhand");
        states.add("West Bengal");
        
        Collections.sort(states);
        System.out.println(states);
	}

}
