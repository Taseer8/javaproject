package com.xworkz.excaptionProjects.Exception;

public class PgRoom extends Throwable {
	public PgRoom(int rooms) {

		if(rooms == 0) {
			System.out.println("rooms are not available");
		}
		else {
			System.out.println("Available rooms are:"+rooms);
		}
	}

}
