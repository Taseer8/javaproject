package com.xworkz.collection;

import java.util.LinkedList;

public class Lined {

	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<String>();
		link.add("taseer");
		link.add("smd");
		link.add("faiz");
		link.add("arif");
		link.add("ganesh");
		link.add(2, "ahmed");
		link.add("mallikarjun");
		System.out.println(link);
		link.removeFirst();
		link.removeLast();
		System.out.println(link);
		System.out.println(link.peek());
		System.out.println(link.element());
		System.out.println(link.get(2));
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		System.out.println(link.lastIndexOf(link));
		System.out.println(link.offer("taseer"));
		System.out.println(link);
		System.out.println(link.offerFirst("khaja"));
		System.out.println(link.clone());
		System.out.println(link.poll());
		System.out.println(link.pop());
		link.push("khaja");
		System.out.println(link);
	

	}

}
