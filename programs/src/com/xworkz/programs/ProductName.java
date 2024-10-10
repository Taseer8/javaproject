package com.xworkz.programs;

import java.util.ArrayList;
import java.util.Collections;

public class ProductName {
	public static void main(String[] args) {
		ArrayList<String> p_Name = new ArrayList<String>();
		p_Name.add("Laptop");
		p_Name.add("Ear-Burds");
		p_Name.add("head phone");
		p_Name.add("phone");
		
		System.out.println("product names  :"+p_Name);
		Collections.sort(p_Name, Collections.reverseOrder());
		System.out.println("product name from decending order:"+p_Name);
	}

}
