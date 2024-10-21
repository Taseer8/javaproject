package com.xworkz.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Task {

	public static void main(String[] args) {
		System.out.println("main");
		List<String> list = new LinkedList<String>();
		list.add("hi well come to xworkz");
		Iterator<String> itrator = list.iterator();
	
		
		itrator.remove();
		while (itrator.hasNext()) {
			System.out.println(itrator.next());
		}
	}
}