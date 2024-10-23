package com.xworkz.javafeature.runner;

import java.util.Comparator;

public class Comparato {

	public static void main(String[] args) {

		Comparator<String> comparatore = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.equals(o2))
					return 0;
				else
					return 1;
			}
		};
		int result = comparatore.compare("taseer", "smd");
		System.out.println("result 1: "+result);

		Comparator<String> comparator =  (String r1, String r2) -> r1.equals(r2)? 0:1;
		System.out.println("result 2:"+comparator.compare("taseer", "smd"));

		Test comparator1 =  (String w1, String w2) -> w1.equals(w2)? true:false;
		System.out.println("test result:"+comparator1.test("tas", "tas"));
	}
}
