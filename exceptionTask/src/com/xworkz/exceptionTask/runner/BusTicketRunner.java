package com.xworkz.exceptionTask.runner;

import java.util.Scanner;

import com.xworkz.exceptionTask.dto.BusDto;
import com.xworkz.exceptionTask.exception.InvalidPriceException;
import com.xworkz.exceptionTask.exception.LengthExcededException;
import com.xworkz.exceptionTask.service.BusServices;
import com.xworkz.exceptionTask.service.BusTicketService;

public class BusTicketRunner {

	public static void main(String[] args) 		throws NullPointerException, InvalidPriceException, LengthExcededException {
		System.out.println("main is running");

		try (Scanner scanner = new Scanner(System.in)) {

			BusDto ticket = new BusDto();

			System.out.println("Enter the starting point");
			ticket.setStartingPoint(scanner.nextLine());

			System.out.println("Enter destination");
			ticket.setDestination(scanner.nextLine());

			System.out.println("Enter ticker price");
			ticket.setPriceOfTicket(scanner.nextInt());

			System.out.println("Details :"+ticket);

			BusServices bus = new BusTicketService();
			bus.validate(ticket);

		}catch(NullPointerException e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}
	}


}


