package com.xworkz.AbstractProjects.runner;

import com.xworkz.AbstractProjects.Dto.PgDto;
import com.xworkz.AbstractProjects.Dto.PgName;
import com.xworkz.AbstractProjects.serves.PgBuliding;
import com.xworkz.AbstractProjects.serves.PgDetails;

public class PgRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PgName name = new PgName("SSR");
		PgDto pg = new PgDto();
		pg.setPgName(name);
		pg.setAddress("BTM stage1");
		pg.setRentAmount(6000);
		
	PgDetails details =	new PgBuliding();
	details.validatePgAddress(pg);
	details.validatePgName(pg);
	details.validatePgRent(pg);
		
	}

}
