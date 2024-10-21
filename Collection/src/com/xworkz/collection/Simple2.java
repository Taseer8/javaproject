package com.xworkz.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Simple2 {
	
	public static void main(String[] args) {
		System.out.println("main");
		List<String> ref = new LinkedList<String>();
		ref.add("Taseer@gmail.com");
		ref.add("Zain@gmail.com");
		ref.add("faiz@gmail.com");
		ref.add("taseer#gmail.com");
		Iterator<String> itrator = ref.iterator();
		itrator.remove();
		while (itrator.hasNext()) {
			System.out.println(itrator.next());
		}
	}
}