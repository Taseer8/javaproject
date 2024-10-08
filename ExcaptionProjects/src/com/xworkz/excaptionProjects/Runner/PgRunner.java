package com.xworkz.excaptionProjects.Runner;

import com.xworkz.excaptionProjects.Exception.PgRoom;

public class PgRunner {

	public static void main(String[] args) throws PgRoom {
		// TODO Auto-generated method stub
		System.out.println("main method");
		throw new PgRoom(4);

	}

}
