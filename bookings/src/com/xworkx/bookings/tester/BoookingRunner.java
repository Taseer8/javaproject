package com.xworkx.bookings.tester;

import com.xworkx.bookings.things.BookMyShow;
import com.xworkx.bookings.things.BookingDetails;

public class BoookingRunner {

	public static void main(String[] args) {
		BookingDetails.getBooking();
		BookingDetails names = new BookingDetails("taseer", "taseer@gmail.com", 3673687l);
		
//		names.getDeatils();
//		names.getBookingDeatils();
//		BookingDetails.getBooking();
//		
		
		BookingDetails nam = new BookingDetails("taseer", "taseer@gmail.com", 3673687l);
		System.out.println(names.equals(nam));

	}

}
