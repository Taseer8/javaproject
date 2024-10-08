package com.xworkz.Television.services;

import com.xworkz.Television.Dto.TvDto;



public interface TvService  {
	
	public boolean validate(TvDto dto);
	
	public boolean save(TvDto dto);

}
