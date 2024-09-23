package com.xworkx.bookings.things;

public class BookingDetails {
	private String userName;
	private String email;
	private long mobileNo;
	
	public BookingDetails() {
		// TODO Auto-generated constructor stub
	}

	public BookingDetails(String userName, String email, long mobileNo) {
		super();
		this.userName = userName;
		this.email = email;
		this.mobileNo = mobileNo;
	}
	
	public void getDetails() {
		System.out.println("user name"+this.userName);
		System.out.println("user Email"+this.email);
		System.out.println("mobile number "+this.mobileNo);
	}
	
	public static void getBooking() {
		System.out.println("static method in the booking Details class");
	}
	
	public final void getBookingDeatils() {
		System.out.println("user name"+this.userName);
		System.out.println("user Email"+this.email);
		System.out.println("mobile number "+this.mobileNo);
	}
	public boolean equals(Object person) {
		
		if(person == null)
			return false;
		
		if( this != person)
			return false;
		
		BookingDetails details = (BookingDetails) person;
		
		if(!(person instanceof BookingDetails)) {
			return false;
		}
		
		if(!(this.userName.equals(details.userName)) || (this.mobileNo != details.mobileNo))
		{
			return false;
		}
		
		return true;
	}
	

}
