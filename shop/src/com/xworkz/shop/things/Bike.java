package com.xworkz.shop.things;

public class Bike {
	private int gear;              
	private short modelYear;        
	private boolean isElectric;     
	private long distanceTraveled;  
	private byte wheelSize;        
	private double price;           
	private float fuelEfficiency;   
	private String brand;           
	private char colorCode;
	
	public Bike() {
		// TODO Auto-generated constructor stub
		System.out.println("no argumnet Constractor");
	}
	
	public Bike(int gear, short modelYear, boolean isElectric,long distanceTraveled,byte wheelSize, double price,float fuelEfficiency,   
     String brand, char colorCode) {
		this.gear = gear;              
		this.modelYear = modelYear;        
	    this.isElectric = isElectric;     
	    this.distanceTraveled = distanceTraveled;  
	    this.wheelSize = wheelSize;        
	    this.price = price;           
	    this.fuelEfficiency =  fuelEfficiency;   
	    this.brand = brand;           
	    this.colorCode = colorCode;
		
	}
	
	public void getGear(int gear) {
		this.gear = gear;
		
	}
	public int setGear() {
		return this.gear;
	}
	public void getModel(short modelYear) {
		this.modelYear = modelYear;
	}
	public short setModel() {
		return this.modelYear;
	}
	public void getElectric(boolean isElectric) {
		this.isElectric = isElectric;
		
	}
	public boolean setElectric () {
		return this.isElectric;
	}
	public void getDistance(long distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
		
	}
	public long setDistance() {
		return this.distanceTraveled;
	}
	public void getWheel(byte wheelSize) {
		this.wheelSize = wheelSize;
		
	}
	public byte setWheel() {
		return this.wheelSize;
	}
	public void getPrice(double price) {
		this.price = price;
		
	}
	public double setPrice() {
		return this.price;
	}
	public void getfuel(float fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}
	public float setfuel() {
		return this.fuelEfficiency ;
	}
	public void getBrand(String  brand) {
		this.brand = brand;
	}
	public String setBrand() {
		return this.brand;
	}
	public void getColor(char colour) {
		this.colorCode = colour;
	}
	public char setColor() {
		return this.colorCode;
	}


}
