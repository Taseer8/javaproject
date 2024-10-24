package com.xworkz.javafeature.dto;

import java.util.Comparator;

public class AuthorImpl implements Comparator<BookDto> {

	@Override
	public int compare(BookDto o1, BookDto o2) {
		// TODO Auto-generated method stub
		return o1.getAuthor().compareToIgnoreCase(o2.getAuthor());
	}

}
