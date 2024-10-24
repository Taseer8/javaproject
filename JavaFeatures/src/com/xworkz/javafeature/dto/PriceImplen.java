package com.xworkz.javafeature.dto;

import java.util.Comparator;

public class PriceImplen implements Comparator<BookDto> {

	@Override
	public int compare(BookDto o1, BookDto o2) {
		
		return Integer.compare(o2.getB_Price(), o1.getB_Price());
	}

}
