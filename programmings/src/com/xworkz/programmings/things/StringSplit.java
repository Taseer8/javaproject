package com.xworkz.programmings.things;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSplit {

	public static void main(String[] args) {
		 String str = "hello how are you"; 
		 String [] ar = str.split(" ");
		 List<String> ref = Arrays.asList(ar);
		 Comparator<String> refr = (String s1, String s2)-> s2.compareToIgnoreCase(s1);	
		 System.out.println(ref);
		 Collections.sort(ref,refr);
		 System.out.println(ref);

	}

}
