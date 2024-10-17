package com.xworkz.exceptionTask.service;

import com.xworkz.exceptionTask.dto.BusDto;
import com.xworkz.exceptionTask.exception.InvalidPriceException;
import com.xworkz.exceptionTask.exception.LengthExcededException;

public interface BusServices {
	public boolean validate(BusDto dto) throws NullPointerException, InvalidPriceException, LengthExcededException;

	

}
