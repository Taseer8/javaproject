package com.xworkz.shop.tester;

import java.util.Scanner;

public class Phone {

	public String brand ;
    public String model ;
    public double screenSize = 5.4 ; 
    public int batteryCapacity = 5000 ; 
    public boolean isSmartphone = true ;
    
	    public void getDetails(String model , String brand) {
	    	this.brand = brand;
	    	this.brand = "One pluse";
	    	this.model = "t10";
	    	this.model = model;
	    	if(this.brand.equals(brand) &  this.model.equals(model)) {
	    		System.out.println("brand:"+brand);
	    		System.out.println("model:"+model);
	    	}
	    	else {
	    		System.out.println("its doest");
	    	}
	    }
	    public double getDetails(double screenSize) {
	    	this.screenSize = screenSize;
	    	if(this.screenSize==screenSize) {	
	    	}
			return screenSize;
	    } 
	    public int getDetails(int batteryCapacity) {
	    	this.batteryCapacity = batteryCapacity;
	    	if(this.batteryCapacity == batteryCapacity) {
	    		return batteryCapacity;
	    	}
	    	return 0;
	    }
	    public boolean getDetails (boolean isSmartPhone) {
	    	this.isSmartphone = isSmartPhone;
	    	if(this.isSmartphone == isSmartphone) {
	    		return isSmartPhone;
	    	}
	    	else {
	    	return isSmartPhone ;
	    	}
	   	}
	    public void getDisplay() {
	    	Scanner sc = new Scanner(System.in);
	    	this.getDetails(sc.nextLine(), sc.nextLine());
	    	
	    	double de =this.getDetails(sc.nextDouble());
	    	System.out.println("Screen Size"+de);
	    	int de1 =this.getDetails(sc.nextInt());
	    	
	    	System.out.println("Battery capacity:"+de1);
	    	boolean be = this.getDetails(sc.nextBoolean());
	    	System.out.println("is a smart phone:"+be);	
	    }    	
}