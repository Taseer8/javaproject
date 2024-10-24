package com.xworkz.javafeature.runner;


import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

import com.xworkz.javafeature.dto.AuthorImpl;
import com.xworkz.javafeature.dto.BookDto;
import com.xworkz.javafeature.dto.PriceImplen;


public class BookRunner {

	public static void main(String[] args) {
		List<BookDto> books = new ArrayList<BookDto>();
        books.add(new BookDto("The Catcher in the Rye", "B", 1000));
        books.add(new BookDto("To Kill a Mockingbird", "C", 700));
        books.add(new BookDto("1984", "F", 100));
        books.add(new BookDto("Pride and Prejudice", "A", 899));
        System.out.println("this price based list");
        Collections.sort(books, new PriceImplen());
        System.out.println(books);
        System.out.println("this is author based list ");
        Collections.sort(books, new AuthorImpl());
        System.out.println(books);

	}
}