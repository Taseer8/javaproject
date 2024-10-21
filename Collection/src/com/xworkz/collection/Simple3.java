package com.xworkz.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Simple3 {

	public static void main(String[] args) {
		System.out.println("Main Method Running");

		List<String> ref =new LinkedList<String>();
		ref.add("Taseer@gmail.com");
		ref.add("ran@gmail.com");
		
		ListIterator<String> listIterator=ref.listIterator();
		listIterator.add("faiz@gmail.com");
		listIterator.add("zuber@gmail.com");
		listIterator.add("hassan@gmail.com");
		System.out.println("before remove");
		ref.remove(1);
		ref.forEach(i -> System.out.println(i));

		System.err.println("Search:"+ref.contains("Taseer@gmail.com"));

		ref.add(2, "india@gmail.com");
		ref.forEach(i -> System.out.println("After update:"+i));

	}
}
