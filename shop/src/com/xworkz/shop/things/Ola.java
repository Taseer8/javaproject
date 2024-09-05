package com.xworkz.shop.things;

import java.util.Scanner;

public class Ola {
	public String userName;
	public long phoneNo;
	public int pincode;
	public String locationName;
	
	public void getUserDetails(String userName) {
		this.userName = userName;
	}
	public void getUserDetails(long phoneNo) {
		this.phoneNo = phoneNo;
		
	}
	public void getUserDetails(int pinCode) {
		this.pincode = pinCode;
	}
	public void getUserDetails(String userName, int pincode, long phoneNo, String locationName) {
		this.userName = userName;
	    this.phoneNo = phoneNo;
	    this.pincode = pincode;
	    this.locationName = locationName;
	
	}
	public void getDisplay() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the user name");
		this.getUserDetails(scan.nextLine());
		System.out.println("enter the PhoneNumber");
		this.getUserDetails(scan.nextLong());
		System.out.println("enter the pincode");
		this.getUserDetails(scan.nextInt());
		System.out.println("enter the location Name");
		this.getUserDetails(scan.next(), scan.nextInt(), scan.nextLong(), scan.next());
	}

}
