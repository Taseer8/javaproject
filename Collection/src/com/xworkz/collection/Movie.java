package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Movie {

	public static void main(String[] args) {
		ArrayList<String> movies = new ArrayList<String>();


		movies.add("DDLJ");
		movies.add("3 Idiots ");
		movies.add("Kabhi Khushi Kabhie Gham ");
		movies.add("kill");
		movies.add("Zindagi Na Milegi Dobara (Hindi)");

		movies.add("KGF ");
		movies.add("18 pages love story ");
		movies.add("Ugramm ");
		movies.add(" Devara");
		movies.add("kantara ");

		movies.add("Baahubali1");
		movies.add("Eega ");
		movies.add("Arjun Reddy ");
		movies.add("Ala Vaikunthapurramuloo ");
		movies.add("saaho");
		Collections.sort(movies);
		System.out.println(movies);


	}

}
