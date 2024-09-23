package com.xworkz.AbstractProjects.serves;

import com.xworkz.AbstractProjects.Dto.PgDto;
import com.xworkz.AbstractProjects.Dto.PgName;

public class PgBuliding extends PgDetails{

	PgName pgName = new PgName("SSR");
	@Override
	public boolean validatePgName(PgDto pgDto) {
		if(pgDto != null) {
			if(pgDto.getPgName().equals(pgName)) {
				System.out.println("yes it is a pg:"+pgDto);
			}
			else {
				System.out.println("no its not a pg");
			}
		}
		return false;
	}

	@Override
	public boolean validatePgAddress(PgDto address) {
		if(address != null) {
			if(address.getAddress().equals("BTM stage1")) {
				System.out.println("correct address:"+address);
			}
			else {
				System.out.println("wrong address");
			}
		}
		return false;
	}
	

	@Override
	public boolean validatePgRent(PgDto rent) {
		if(rent != null) {
			if(rent.getRentAmount()==6000) {
				System.out.println("a Rent amount is:"+rent);
			}
			else {
				System.out.println("Pay a proper rent amount");
			}
		}
		return false;
	
	}
}
