package com.xworkz.shop.things;

import java.util.Scanner;

public class Slipper {
	public String brandName;
	public int size;
	public long modelNo;
	public String colour;
	
	public void getSlipper(String brandName) {
		this.brandName = brandName;
	}
	public void getSlipper(long modelNo) {
		this.modelNo = modelNo;
		
	}
	public void getSlipper(int size, String brandName) {
		this.size = size;
		this.brandName = brandName;
	}
	public void getSlipper(String brandName, int size, long modelNo, String colour) {
		this.brandName = brandName;
	    this.modelNo = modelNo;
	    this.size = size;
	    this.colour = colour;
	
	}
	public void getDisplay() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the brand name");
		this.getSlipper(scan.nextLine());
		System.out.println("enter the Model number");
		this.getSlipper(scan.nextLong());
		System.out.println("enter the size");
		this.getSlipper(scan.nextInt());
		System.out.println("enter the all the 4 arguments first brandname , size ,modelNo, color ");
		this.getSlipper(scan.next(), scan.nextInt(), scan.nextLong(), scan.next());
	}

}
