package com.xworkz.excaptionProjects.Exception;

import java.time.LocalDateTime;

public class LocalTD extends Throwable{
	
	public LocalTD(LocalDateTime local) {
		LocalDateTime locals = LocalDateTime.now();
		if(local.equals(locals)  ) {
			System.out.println("its  todays date");
		}
		else {
			System.out.println("its not today");
		}
		
	}

}
