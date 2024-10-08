package com.xworkz.excaptionProjects.Runner;

import java.time.LocalDateTime;

import com.xworkz.excaptionProjects.Exception.LocalTD;

public class LocalDateTimeRunner {

	public static void main(String[] args) throws LocalTD  {
		System.out.println("Local time and date main method");
		LocalDateTime locals =  LocalDateTime.now();
		 throw new LocalTD(locals);

	}

}
