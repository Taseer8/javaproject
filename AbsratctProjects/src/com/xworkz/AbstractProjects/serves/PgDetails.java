package com.xworkz.AbstractProjects.serves;

import com.xworkz.AbstractProjects.Dto.PgDto;

public abstract class PgDetails {
	
	public abstract boolean validatePgName(PgDto pgDto);
	public abstract boolean validatePgAddress(PgDto address);
	public abstract boolean validatePgRent(PgDto rent);
	

}
