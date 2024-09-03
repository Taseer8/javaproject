package com.xworkz.javaproject.tester;

public class shoes {
		public String brand;
	    public String color;
	    public int size;
	    public String type;
	    public double price;
	    
	    
	    public void getshoes(String brand) {
	    	this.gettype("nike", "white", 9, "formal", 1290.00);
	    	//
	    	this.brand = brand;
	    	System.out.println("1 parameter");
	    	this.displayDetails();	
	    }
	    public void getColor(String brand, String color) {
	    	this.brand = brand;
	    	this.color = color;
	    	this.displayDetails();
	    	
	    }
	    public void getSize(String brand, String color, int size) {
	    	this.getColor("puma", "blue");
	    	this.brand = brand;
	    	this.color = color;
	    	this.size = size;
	    	this.displayDetails();
	    	
	    }
	    public void gettype(String brand, String color, int size, String type, double price ) {
	    	this.getSize("reebook", "red", 8);
	    	this.brand = brand;
	    	this.color = color;
	    	this.size = size;
	    	this.price = price;
	    	this.type = type;
	    	this.displayDetails();
	    }
	    public void displayDetails() {
	        System.out.println("Shoe Details:");
	        System.out.println("Brand: " + this.brand);
	        System.out.println("Color: " + this.color);
	        System.out.println("Size: " + this.size);
	        System.out.println("Type: " + this.type);
	        System.out.println("Price: " + this.price);
	    }

}
