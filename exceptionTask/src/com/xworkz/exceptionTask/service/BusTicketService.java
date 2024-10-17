package com.xworkz.exceptionTask.service;

import com.xworkz.exceptionTask.dto.BusDto;
import com.xworkz.exceptionTask.exception.InvalidPriceException;
import com.xworkz.exceptionTask.exception.LengthExcededException;

public class BusTicketService implements BusServices {

	@Override
	public boolean validate(BusDto dto) throws NullPointerException, InvalidPriceException, LengthExcededException{

			if (dto != null) {
				if (dto.getStartingPoint().length() > 3 && dto.getStartingPoint().length() < 50) {
					if (dto.getDestination().length() > 3 && dto.getDestination().length() < 50) {
						if (dto.getPriceOfTicket() != 0) {
							System.out.println("Validated");
							return true;
						}
						throw new InvalidPriceException("Ticket price must be > 0");
					}
					throw new LengthExcededException("Destination is must be > 3  & <50.. Enter proper values");
				}
				throw new LengthExcededException("StartingPoint is must be > 3  & <50.. Enter proper values");
			}
			throw new NullPointerException("dto is null");

	}

}
