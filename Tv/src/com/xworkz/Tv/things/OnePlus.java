package com.xworkz.Tv.things;

public class OnePlus extends Tv {
	private double ScreenSizes;
	private double price;
	private char logoSimble;
	public OnePlus(double screenSize, double price, char logoSimble) {
		super("Tv",22.43,657);
		ScreenSizes = screenSize;
		this.price = price;
		this.logoSimble = logoSimble;
	}
	
	public double getScreenSizes() {
		return ScreenSizes;
	}
	public void setScreenSizes(double screenSize) {
		ScreenSizes = screenSize;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public char getLogoSimble() {
		return logoSimble;
	}
	public void setLogoSimble(char logoSimble) {
		this.logoSimble = logoSimble;
	}
	@Override
	public void getSize() {
		super.getSize();
		System.out.println("accessing in oneplus child class");
	}
	@Override
	public void getdetails() {
		
		super.getdetails();
		System.out.println("accessing in onepluse child class");
	}
	@Override
	public void getSeries() {
		super.getSeries();
		System.out.println("accessing in onepluse child class");
	}
	//overloading
	public void getDetail() {
		System.out.println("overloading in oneplus child class");
		String str = this.getDetail("tv");
		System.out.println(str);
	}
	@Override
	public String getDetail(String brandName) {
		// TODO Auto-generated method stub
		return super.getDetail(brandName);
	}
	
	
	
	

}
